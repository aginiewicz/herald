import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val databinder_net = "databinder.net repository" at "http://databinder.net/repo"
  val t_repo = "t_repo" at "http://tristanhunt.com:8081/content/groups/public/"
  val posterous = "net.databinder" % "posterous-sbt" % "0.1.0"
}