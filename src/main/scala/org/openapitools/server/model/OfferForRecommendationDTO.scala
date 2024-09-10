package org.openapitools.server.model


/**
 * Информация о состоянии цены на товар.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param price  for example: ''null''
 * @param cofinancePrice  for example: ''null''
 * @param competitiveness  for example: ''null''
 * @param shows Количество показов карточки товара за последние 7 дней. for example: ''null''
*/
final case class OfferForRecommendationDTO (
  offerId: Option[String] = None,
  price: Option[BasePriceDTO] = None,
  cofinancePrice: Option[GetPriceDTO] = None,
  competitiveness: Option[PriceCompetitivenessType] = None,
  shows: Option[Long] = None
)

