
package org.openapitools.client.model


case class WarehousesDTO (
    /* Список складов, не входящих в группы. */
    _warehouses: List[WarehouseDTO],
    /* Список групп складов. */
    _warehouseGroups: List[WarehouseGroupDTO]
)
object WarehousesDTO {
    def toStringBody(var_warehouses: Object, var_warehouseGroups: Object) =
        s"""
        | {
        | "warehouses":$var_warehouses,"warehouseGroups":$var_warehouseGroups
        | }
        """.stripMargin
}
