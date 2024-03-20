name := "Hasher"
organization := "com.outr"
version := "1.2.3"

val scala213Version = "2.13.13"

val scala3Version = "3.4.0"

scalaVersion := scala3Version
crossScalaVersions := Seq(scala3Version, scala213Version)
scalacOptions ++= Seq("-deprecation", "-feature")

ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
ThisBuild / publishTo := sonatypePublishToBundle.value
ThisBuild / sonatypeProfileName := "com.outr"
ThisBuild / licenses := Seq("MIT" -> url("https://github.com/outr/Hasher/blob/master/LICENSE"))
ThisBuild / sonatypeProjectHosting := Some(xerial.sbt.Sonatype.GitHubHosting("outr", "Hasher", "matt@outr.com"))
ThisBuild / homepage := Some(url("https://github.com/outr/Hasher"))
ThisBuild / scmInfo := Some(
    ScmInfo(
        url("https://github.com/outr/Hasher"),
        "scm:git@github.com:outr/Hasher.git"
    )
)
ThisBuild / developers := List(
    Developer(id="darkfrog", name="Matt Hicks", email="matt@matthicks.com", url=url("http://matthicks.com"))
)

Test / publishArtifact := false

// Application dependencies
libraryDependencies ++= Seq(
    "org.mindrot" % "jbcrypt" % "0.4" % "optional",
    "org.specs2" %% "specs2-core" % "4.20.4" % "test"
)