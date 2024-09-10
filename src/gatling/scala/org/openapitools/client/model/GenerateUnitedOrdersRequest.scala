
package org.openapitools.client.model

import java.time.LocalDate

case class GenerateUnitedOrdersRequest (
    /* Идентификатор бизнеса. */
    _businessId: Long,
    /* Начало периода, включительно. */
    _dateFrom: LocalDate,
    /* Конец периода, включительно. Максимальный период — 1 год. */
    _dateTo: LocalDate,
    /* Список магазинов, которые нужны в отчете. */
    _campaignIds: Option[List[Long]],
    /* Идентификатор акции, товары из которой нужны в отчете. */
    _promoId: Option[String]
)
object GenerateUnitedOrdersRequest {
    def toStringBody(var_businessId: Object, var_dateFrom: Object, var_dateTo: Object, var_campaignIds: Object, var_promoId: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"dateFrom":$var_dateFrom,"dateTo":$var_dateTo,"campaignIds":$var_campaignIds,"promoId":$var_promoId
        | }
        """.stripMargin
}
