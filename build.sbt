scalaVersion := "3.9.0"

lazy val common = project.settings(
  libraryDependencies += "com.github.tminglei" %% "slick-pg_play-json" % "0.23.1",
  libraryDependencies += "org.playframework" %% "play-slick" % "6.2.0",
)
lazy val root = rootProject.settings(name := "scala-overcomp-inner").dependsOn(common)
