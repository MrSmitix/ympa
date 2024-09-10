
package org.openapitools.client.model


case class GenerateShipmentListDocumentReportRequest (
    /* Идентификатор кампании. */
    _campaignId: Long,
    /* Идентификатор отгрузки. */
    _shipmentId: Option[Long],
    /* Фильтр по идентификаторам заказа в отгрузке. */
    _orderIds: Option[List[Long]]
)
object GenerateShipmentListDocumentReportRequest {
    def toStringBody(var_campaignId: Object, var_shipmentId: Object, var_orderIds: Object) =
        s"""
        | {
        | "campaignId":$var_campaignId,"shipmentId":$var_shipmentId,"orderIds":$var_orderIds
        | }
        """.stripMargin
}
