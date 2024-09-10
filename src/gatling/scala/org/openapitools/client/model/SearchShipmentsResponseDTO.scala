
package org.openapitools.client.model


case class SearchShipmentsResponseDTO (
    /* Список с информацией об отгрузках. */
    _shipments: List[ShipmentInfoDTO],
    _paging: Option[ForwardScrollingPagerDTO]
)
object SearchShipmentsResponseDTO {
    def toStringBody(var_shipments: Object, var_paging: Object) =
        s"""
        | {
        | "shipments":$var_shipments,"paging":$var_paging
        | }
        """.stripMargin
}
