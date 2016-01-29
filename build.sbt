name := """TestApp"""

version := "1.0-SNAPSHOT"

libraryDependencies += "org.mongodb" %% "casbah" % "3.1.0"

libraryDependencies += filters

lazy val root = project.in(file(".")).enablePlugins(PlayScala)


