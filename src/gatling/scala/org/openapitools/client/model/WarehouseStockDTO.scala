
package org.openapitools.client.model


case class WarehouseStockDTO (
    _type: WarehouseStockType,
    /* Значение остатков. */
    _count: Long
)
object WarehouseStockDTO {
    def toStringBody(var_type: Object, var_count: Object) =
        s"""
        | {
        | "type":$var_type,"count":$var_count
        | }
        """.stripMargin
}
