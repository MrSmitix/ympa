package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета.
 *
 * @param campaignId Идентификатор кампании. for example: ''null''
 * @param dateFrom Начало периода, включительно. for example: ''null''
 * @param dateTo Конец периода, включительно. for example: ''null''
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  for example: ''null''
*/
final case class GenerateGoodsMovementReportRequest (
  campaignId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate,
  shopSku: Option[String] = None
)

