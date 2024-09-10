
package org.openapitools.client.model


case class OrdersStatsWarehouseDTO (
    /* Идентификатор склада. */
    _id: Option[Long],
    /* Название склада. */
    _name: Option[String]
)
object OrdersStatsWarehouseDTO {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
