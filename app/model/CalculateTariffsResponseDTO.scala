package model

import play.api.libs.json._

/**
  * Расчет стоимости услуг.
  * @param offers Стоимость услуг.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CalculateTariffsResponseDTO(
  offers: List[CalculateTariffsOfferInfoDTO]
)

object CalculateTariffsResponseDTO {
  implicit lazy val calculateTariffsResponseDTOJsonFormat: Format[CalculateTariffsResponseDTO] = Json.format[CalculateTariffsResponseDTO]
}

