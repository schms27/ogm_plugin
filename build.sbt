
lazy val root = (project in file(".")).
  settings(
    name := "ogm_plugin",
    version := "0.0.1",
    organization := "com.github.schms27",
    scalaVersion := "2.12.3",
    sbtPlugin := true,
    sbtVersion := "1.0.2"
  )
