package model

import play.api.libs.json._

/**
  * Параметры для расчета стоимости услуг.
  * @param campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CalculateTariffsParametersDTO(
  campaignId: Option[Long],
  sellingProgram: Option[SellingProgramType],
  frequency: Option[PaymentFrequencyType]
)

object CalculateTariffsParametersDTO {
  implicit lazy val calculateTariffsParametersDTOJsonFormat: Format[CalculateTariffsParametersDTO] = Json.format[CalculateTariffsParametersDTO]
}

