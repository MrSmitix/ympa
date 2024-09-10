package model

import play.api.libs.json._

/**
  * Информация об услугах Маркета.
  * @param amount Стоимость услуги в рублях.
  * @param parameters Параметры расчета тарифа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CalculatedTariffDTO(
  `type`: CalculatedTariffType,
  amount: Option[BigDecimal],
  parameters: List[TariffParameterDTO]
)

object CalculatedTariffDTO {
  implicit lazy val calculatedTariffDTOJsonFormat: Format[CalculatedTariffDTO] = Json.format[CalculatedTariffDTO]
}

