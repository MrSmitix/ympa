package org.openapitools.server.model


/**
 * Информация о новой цене на товар.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param quantum  for example: ''null''
 * @param available Есть ли товар в продаже.  for example: ''null''
*/
final case class BaseCampaignOfferDTO (
  offerId: String,
  quantum: Option[QuantumDTO] = None,
  available: Option[Boolean] = None
)

