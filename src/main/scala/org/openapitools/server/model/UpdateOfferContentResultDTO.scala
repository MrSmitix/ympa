package org.openapitools.server.model


/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param errors Ошибки — информация в каталоге не обновится. for example: ''null''
 * @param warnings Предупреждения — информация в каталоге обновится. for example: ''null''
*/
final case class UpdateOfferContentResultDTO (
  offerId: String,
  errors: Option[Seq[OfferContentErrorDTO]] = None,
  warnings: Option[Seq[OfferContentErrorDTO]] = None
)

