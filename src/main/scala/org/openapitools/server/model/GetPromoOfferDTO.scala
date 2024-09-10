package org.openapitools.server.model


/**
 * Товар, который участвует или может участвовать в акции.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param status  for example: ''null''
 * @param params  for example: ''null''
 * @param autoParticipatingDetails  for example: ''null''
*/
final case class GetPromoOfferDTO (
  offerId: String,
  status: PromoOfferParticipationStatusType,
  params: PromoOfferParamsDTO,
  autoParticipatingDetails: Option[PromoOfferAutoParticipatingDetailsDTO] = None
)

