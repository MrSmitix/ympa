package model

import play.api.libs.json._

/**
  * Причина попадания товара в карантин.
  * @param params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceQuarantineVerdictDTO(
  `type`: Option[PriceQuarantineVerdictType],
  params: List[PriceQuarantineVerdictParameterDTO]
)

object PriceQuarantineVerdictDTO {
  implicit lazy val priceQuarantineVerdictDTOJsonFormat: Format[PriceQuarantineVerdictDTO] = Json.format[PriceQuarantineVerdictDTO]
}

