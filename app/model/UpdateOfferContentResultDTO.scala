package model

import play.api.libs.json._

/**
  * Ошибки и предупреждения, которые появились из-за переданных характеристик.
  * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @param errors Ошибки — информация в каталоге не обновится.
  * @param warnings Предупреждения — информация в каталоге обновится.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateOfferContentResultDTO(
  offerId: String,
  errors: Option[List[OfferContentErrorDTO]],
  warnings: Option[List[OfferContentErrorDTO]]
)

object UpdateOfferContentResultDTO {
  implicit lazy val updateOfferContentResultDTOJsonFormat: Format[UpdateOfferContentResultDTO] = Json.format[UpdateOfferContentResultDTO]
}

