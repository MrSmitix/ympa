
package org.openapitools.client.model


case class GenerateMassOrderLabelsRequest (
    /* Идентификатор кабинета. */
    _businessId: Long,
    /* Список идентификаторов заказов. */
    _orderIds: Set[Long]
)
object GenerateMassOrderLabelsRequest {
    def toStringBody(var_businessId: Object, var_orderIds: Object) =
        s"""
        | {
        | "businessId":$var_businessId,"orderIds":$var_orderIds
        | }
        """.stripMargin
}
