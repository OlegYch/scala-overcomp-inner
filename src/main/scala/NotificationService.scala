import play.api.db.slick.DatabaseConfigProvider

import scala.concurrent.ExecutionContext

class NotificationService(override val dbConfigProvider: DatabaseConfigProvider)(using ExecutionContext)
  extends HasDatabaseConfigProvider {
  def hello = 1
}
