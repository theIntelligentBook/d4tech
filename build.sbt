name := "simplestTalks"

val deployFast = taskKey[Unit]("Copies the fastLinkJS script to deployscripts/")
val deployFull = taskKey[Unit]("Copies the fullLinkJS script to deployscripts/")

import org.scalajs.linker.interface.ModuleSplitStyle

ThisBuild / scalaVersion := "3.3.3"
val circeVersion = "0.14.1"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

lazy val root = project.in(file("."))
  .aggregate(commonJS, commonJVM, site)
  .settings(
    Compile / fullLinkJSOutput / aggregate := false,
  )

lazy val common = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Pure).in(file("common"))
  .settings(

    libraryDependencies ++= Seq(
        "io.circe" %%% "circe-core" % circeVersion,
        "io.circe" %%% "circe-generic" % circeVersion,
        "io.circe" %%% "circe-parser" % circeVersion

//      "org.scala-js" %% "scalajs-stubs" % "1.1.0" % "provided"
    )

  )
lazy val commonJS = common.js
lazy val commonJVM = common.jvm

lazy val site = project.in(file("site"))
  .dependsOn(commonJS)
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    resolvers ++= Resolver.sonatypeOssRepos("snapshots"),
    libraryDependencies ++= Seq(
      "com.wbillingsley" %%% "doctacular" % "0.3.0",
    ),

    // This is an application with a main method
    scalaJSUseMainModuleInitializer := true,
    
    // For vite bundler
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("simplestTalks"))) 
    },

    // To use ScalablyTypedConverterExternalNpmPlugin
    externalNpm := {
      baseDirectory.value
    },

    // Used by GitHub Actions to get the script out from the .gitignored target directory
    deployFast := {
      val opt = (Compile / fastOptJS).value
      IO.copyFile(opt.data, new java.io.File("site/target/compiled.js"))
    },

    deployFull := {
      val opt = (Compile / fullOptJS).value
      IO.copyFile(opt.data, new java.io.File("site/target/compiled.js"))
    }
  )
