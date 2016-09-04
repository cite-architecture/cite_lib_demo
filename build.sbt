
// Add UH to repositories
resolvers += "uh-nexus" at "http://beta.hpcc.uh.edu/nexus/content/groups/public"

libraryDependencies += "io.github.cite_architecture" %% "cite" % "1.1.3"


libraryDependencies += "com.lihaoyi" % "ammonite" % "0.7.6" cross CrossVersion.full

libraryDependencies += "com.lihaoyi" %% "ammonite-ops" % "0.7.6"

initialCommands in (Test, console) := """ammonite.Main().run()"""

scalaVersion := "2.11.8"
