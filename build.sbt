name := "spider"

version := "1.0"

scalaVersion := "2.10.4"

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

libraryDependencies += "net.sourceforge.tess4j" % "tess4j" % "3.1.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.5"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5" % "test"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.1"

libraryDependencies += "nu.validator.htmlparser" % "htmlparser" % "1.4"


    