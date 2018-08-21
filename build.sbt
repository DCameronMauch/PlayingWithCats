name := "PlayingWithCats"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions += "-Ypartial-unification"
scalacOptions += "-language:higherKinds"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

libraryDependencies += "com.github.mpilquist" %% "simulacrum" % "0.13.0"
libraryDependencies += "org.typelevel" %% "cats-core" % "1.2.0"
