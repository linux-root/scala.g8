lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "$if(useScala2.truthy)$2.13.17$else$3.3.6$endif$",
  )
