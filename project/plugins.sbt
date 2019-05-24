resolvers += Resolver.url(
  "LARA sbt plugins releases",
  url("https://dl.bintray.com/epfl-lara/sbt-plugins/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % "0.1.0-377970cfde44e84dcae565afe1bbfa5d276f3346")

