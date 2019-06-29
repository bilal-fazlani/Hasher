name := "Hasher"
organization := "com.outr"
version := "1.2.2"
scalaVersion := "2.13.0"
crossScalaVersions := Seq("2.13.0", "2.12.8", "2.11.12")
scalacOptions ++= Seq("-deprecation", "-feature")

publishTo in ThisBuild := sonatypePublishTo.value
sonatypeProfileName in ThisBuild := "com.outr"
publishMavenStyle in ThisBuild := true
licenses in ThisBuild := Seq("MIT" -> url("https://github.com/outr/Hasher/blob/master/LICENSE"))
sonatypeProjectHosting in ThisBuild := Some(xerial.sbt.Sonatype.GitHubHosting("outr", "Hasher", "matt@outr.com"))
homepage in ThisBuild := Some(url("https://github.com/outr/Hasher"))
scmInfo in ThisBuild := Some(
    ScmInfo(
        url("https://github.com/outr/Hasher"),
        "scm:git@github.com:outr/Hasher.git"
    )
)
developers in ThisBuild := List(
    Developer(id="darkfrog", name="Matt Hicks", email="matt@matthicks.com", url=url("http://matthicks.com"))
)

publishArtifact in Test := false

// Application dependencies
libraryDependencies ++= Seq(
    "org.mindrot" % "jbcrypt" % "0.4" % "optional",
    "org.specs2" %% "specs2-core" % "4.5.1" % "test"
)