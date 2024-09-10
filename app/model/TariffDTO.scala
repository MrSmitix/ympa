package model

import play.api.libs.json._

/**
  * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
  * @param percent {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
  * @param amount Значение тарифа в рублях.
  * @param parameters Параметры расчета тарифа.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class TariffDTO(
  `type`: TariffType,
  percent: Option[BigDecimal],
  amount: BigDecimal,
  parameters: List[TariffParameterDTO]
)

object TariffDTO {
  implicit lazy val tariffDTOJsonFormat: Format[TariffDTO] = Json.format[TariffDTO]
}

