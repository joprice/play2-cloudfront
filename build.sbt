
lazy val root = (project in file(".")).enablePlugins(PlayScala)

name := "play2-cloudfront"

version := "1.2-SNAPSHOT"

organization := "mchv"

scalaVersion := "2.11.4"

publishTo := Some(Resolver.file(
  "file", file(Option(System.getProperty("repository.path")).getOrElse("/tmp"))
))

