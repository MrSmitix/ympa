package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация об остатках товара.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
 * @param turnoverSummary  for example: ''null''
 * @param stocks Информация об остатках. for example: ''null''
 * @param updatedAt Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`.  for example: ''null''
*/
final case class WarehouseOfferDTO (
  offerId: String,
  turnoverSummary: Option[TurnoverDTO] = None,
  stocks: Seq[WarehouseStockDTO],
  updatedAt: Option[OffsetDateTime] = None
)

