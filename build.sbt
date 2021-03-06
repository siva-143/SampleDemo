name := """play-java-final-demo"""
organization := "com.cloudgen"
version := "1.0-SNAPSHOT"
lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)
scalaVersion := "2.11.11"
libraryDependencies += filters
libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs
//libraryDependencies += javaJpa
//libraryDependencies += "org.hibernate" % "hibernate-core" % "5.2.5.Final"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies ++= Seq(javaJpa,"org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final")