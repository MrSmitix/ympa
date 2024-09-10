
package org.openapitools.client.model


case class FulfillmentWarehousesDTO (
    /* Список складов Маркета (FBY). */
    _warehouses: List[FulfillmentWarehouseDTO]
)
object FulfillmentWarehousesDTO {
    def toStringBody(var_warehouses: Object) =
        s"""
        | {
        | "warehouses":$var_warehouses
        | }
        """.stripMargin
}
