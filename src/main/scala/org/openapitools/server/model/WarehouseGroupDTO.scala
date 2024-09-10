package org.openapitools.server.model


/**
 * Информация о группе складов.
 *
 * @param name Название группы складов. for example: ''null''
 * @param mainWarehouse  for example: ''null''
 * @param warehouses Список складов, входящих в группу. for example: ''null''
*/
final case class WarehouseGroupDTO (
  name: String,
  mainWarehouse: WarehouseDTO,
  warehouses: Seq[WarehouseDTO]
)

