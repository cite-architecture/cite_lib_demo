
// Add HU to repositoreis
resolvers += "uh-nexus" at "http://beta.hpcc.uh.edu/nexus/content/groups/public"

libraryDependencies += "com.lihaoyi" % "ammonite" % "0.7.6" cross CrossVersion.full

libraryDependencies += "com.lihaoyi" %% "ammonite-ops" % "0.7.6"

libraryDependencies += "io.github.cite_architecture" %% "cite" % "1.1.1"


initialCommands in (Test, console) := """ammonite.Main().run()"""

scalaVersion := "2.11.8"
