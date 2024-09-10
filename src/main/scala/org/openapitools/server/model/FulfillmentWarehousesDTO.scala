package org.openapitools.server.model


/**
 * Список складов Маркета (FBY).
 *
 * @param warehouses Список складов Маркета (FBY). for example: ''null''
*/
final case class FulfillmentWarehousesDTO (
  warehouses: Seq[FulfillmentWarehouseDTO]
)

