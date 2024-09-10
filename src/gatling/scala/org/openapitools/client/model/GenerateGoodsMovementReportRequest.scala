
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateGoodsMovementReportRequest (
    /* Идентификатор кампании. */
    _campaignId: Long,
    /* Начало периода, включительно. */
    _dateFrom: LocalDate,
    /* Конец периода, включительно. */
    _dateTo: LocalDate,
    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    _shopSku: Option[String]
)
object GenerateGoodsMovementReportRequest {
    def toStringBody(var_campaignId: Object, var_dateFrom: Object, var_dateTo: Object, var_shopSku: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"shopSku":$var_shopSku
        | }
        """.stripMargin
}
