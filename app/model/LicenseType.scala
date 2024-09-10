package model

import play.api.libs.json._

/**
  * Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class LicenseType(
)

object LicenseType {
  implicit lazy val licenseTypeJsonFormat: Format[LicenseType] = Json.format[LicenseType]
}

