package model

import play.api.libs.json._

/**
  * Стоимость услуг.
  * @param tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CalculateTariffsOfferInfoDTO(
  offer: CalculateTariffsOfferDTO,
  tariffs: List[CalculatedTariffDTO]
)

object CalculateTariffsOfferInfoDTO {
  implicit lazy val calculateTariffsOfferInfoDTOJsonFormat: Format[CalculateTariffsOfferInfoDTO] = Json.format[CalculateTariffsOfferInfoDTO]
}

