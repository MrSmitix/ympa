package model

import play.api.libs.json._

/**
  * Информация об оборачиваемости товара.
  * @param turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class TurnoverDTO(
  turnover: TurnoverType,
  turnoverDays: Option[Double]
)

object TurnoverDTO {
  implicit lazy val turnoverDTOJsonFormat: Format[TurnoverDTO] = Json.format[TurnoverDTO]
}

