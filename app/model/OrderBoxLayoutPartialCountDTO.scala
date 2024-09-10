package model

import play.api.libs.json._

/**
  * Информация о части товара в коробке.
  * @param current Номер части, начиная с 1.
  * @param total На сколько всего частей разделен товар.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrderBoxLayoutPartialCountDTO(
  current: Int,
  total: Int
)

object OrderBoxLayoutPartialCountDTO {
  implicit lazy val orderBoxLayoutPartialCountDTOJsonFormat: Format[OrderBoxLayoutPartialCountDTO] = Json.format[OrderBoxLayoutPartialCountDTO]
}

