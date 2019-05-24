
lazy val `root` = (project in file("."))
  .enablePlugins(StainlessPlugin)
  .settings(
    name         := "stainless-plugin-test",
    version      := "0.1.0",
    scalaVersion := "2.12.8",
    Compile/mainClass := Some("Main"),
  )
