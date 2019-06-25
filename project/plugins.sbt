
resolvers += Resolver.url(
  "LARA sbt plugins releases",
  url("https://dl.bintray.com/epfl-lara/sbt-plugins/")
)(Resolver.ivyStylePatterns)

val StainlessVersion = "0.2.1-7-g319f411"

addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % StainlessVersion)

