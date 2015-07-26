import play.PlayImport.PlayKeys.playRunHooks

name := """sassabi"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

// database
libraryDependencies ++= Seq(
  "com.github.tototoshi" %% "play-flyway"     % "1.2.1",
  "org.skinny-framework" %% "skinny-orm"      % "1.3.18",
  "com.h2database"       %  "h2"              % "1.4.+",
  "ch.qos.logback"       %  "logback-classic" % "1.1.+"
)

// webjars
libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play"        % "2.3.0-2",
  "org.webjars" % "angularjs"            % "1.3.15",
  "org.webjars" % "bootstrap"            % "3.1.1-2",
  "org.webjars" % "angular-ui-bootstrap" % "0.12.1-1",
  "org.webjars" % "angular-ui-router"    % "0.2.13"
)

// run gulp
playRunHooks += RunSubProcess("gulp")
