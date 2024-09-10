
package org.openapitools.client.model


case class GetOfferMappingsResultDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Информация о товарах. */
    _offerMappings: List[GetOfferMappingDTO]
)
object GetOfferMappingsResultDTO {
    def toStringBody(var_paging: Object, var_offerMappings: Object) =
        s"""
        | {
        | "paging":$var_paging,"offerMappings":$var_offerMappings
        | }
        """.stripMargin
}
