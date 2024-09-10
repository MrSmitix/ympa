
package org.openapitools.client.model


case class OrdersStatsDeliveryRegionDTO (
    /* Идентификатор региона доставки. */
    _id: Option[Long],
    /* Название региона доставки. */
    _name: Option[String]
)
object OrdersStatsDeliveryRegionDTO {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
