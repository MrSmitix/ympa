
package org.openapitools.client.model


case class WarehouseOffersDTO (
    /* Идентификатор склада. */
    _warehouseId: Long,
    /* Информация об остатках. */
    _offers: List[WarehouseOfferDTO]
)
object WarehouseOffersDTO {
    def toStringBody(var_warehouseId: Object, var_offers: Object) =
        s"""
        | {
        | "warehouseId":$var_warehouseId,"offers":$var_offers
        | }
        """.stripMargin
}
