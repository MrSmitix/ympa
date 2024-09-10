package model

import play.api.libs.json._

/**
  * Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ShelfsStatisticsAttributionType(
)

object ShelfsStatisticsAttributionType {
  implicit lazy val shelfsStatisticsAttributionTypeJsonFormat: Format[ShelfsStatisticsAttributionType] = Json.format[ShelfsStatisticsAttributionType]
}

