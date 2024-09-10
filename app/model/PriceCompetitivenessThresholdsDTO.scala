package model

import play.api.libs.json._

/**
  * Максимальные значения цены, при которых она является привлекательной или умеренной.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PriceCompetitivenessThresholdsDTO(
  optimalPrice: Option[BasePriceDTO],
  averagePrice: Option[BasePriceDTO]
)

object PriceCompetitivenessThresholdsDTO {
  implicit lazy val priceCompetitivenessThresholdsDTOJsonFormat: Format[PriceCompetitivenessThresholdsDTO] = Json.format[PriceCompetitivenessThresholdsDTO]
}

