package org.openapitools.server.model


/**
 * Товар с ценами для продвижения.
 *
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param priceSuggestion Цены для продвижения.  for example: ''null''
*/
final case class PriceSuggestOfferDTO (
  marketSku: Option[Long] = None,
  offerId: Option[String] = None,
  priceSuggestion: Option[Seq[PriceSuggestDTO]] = None
)

