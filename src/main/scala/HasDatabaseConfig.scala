import com.github.tminglei.slickpg.ExPostgresProfile
import play.api.db.slick.DatabaseConfigProvider
import slick.basic.DatabaseConfig

trait HasDatabaseConfig {
  protected lazy val dbConfig: DatabaseConfig[PostgresProfile]
  protected final lazy val profile: PostgresProfile = dbConfig.profile

  // changing the type to ExPostgresProfile#Backend#Database fixes the issue
  protected final def db: PostgresProfile#Backend#Database = dbConfig.db
}

trait HasDatabaseConfigProvider extends HasDatabaseConfig {
  protected val dbConfigProvider: DatabaseConfigProvider
  protected final override lazy val dbConfig: DatabaseConfig[PostgresProfile] =
    dbConfigProvider.get[PostgresProfile]
}
