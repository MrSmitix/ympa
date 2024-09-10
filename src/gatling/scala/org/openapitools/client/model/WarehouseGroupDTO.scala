
package org.openapitools.client.model


case class WarehouseGroupDTO (
    /* Название группы складов. */
    _name: String,
    _mainWarehouse: WarehouseDTO,
    /* Список складов, входящих в группу. */
    _warehouses: List[WarehouseDTO]
)
object WarehouseGroupDTO {
    def toStringBody(var_name: Object, var_mainWarehouse: Object, var_warehouses: Object) =
        s"""
        | {
        | "name":$var_name,"mainWarehouse":$var_mainWarehouse,"warehouses":$var_warehouses
        | }
        """.stripMargin
}
