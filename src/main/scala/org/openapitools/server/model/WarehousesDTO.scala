package org.openapitools.server.model


/**
 * Информация о складах и группах складов.
 *
 * @param warehouses Список складов, не входящих в группы. for example: ''null''
 * @param warehouseGroups Список групп складов. for example: ''null''
*/
final case class WarehousesDTO (
  warehouses: Seq[WarehouseDTO],
  warehouseGroups: Seq[WarehouseGroupDTO]
)

