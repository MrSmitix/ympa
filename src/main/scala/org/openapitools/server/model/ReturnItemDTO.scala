package org.openapitools.server.model


/**
 * Список товаров в возврате.
 *
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param count Количество единиц товара. for example: ''null''
 * @param decisions Список решений по возврату. for example: ''null''
 * @param instances Список логистических позиций возврата. for example: ''null''
 * @param tracks Список трек-кодов для почтовых отправлений. for example: ''null''
*/
final case class ReturnItemDTO (
  marketSku: Option[Long] = None,
  shopSku: String,
  count: Long,
  decisions: Option[Seq[ReturnDecisionDTO]] = None,
  instances: Option[Seq[ReturnInstanceDTO]] = None,
  tracks: Option[Seq[TrackDTO]] = None
)

