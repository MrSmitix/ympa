
package org.openapitools.client.model


case class OfferMappingEntriesDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Информация о товарах в каталоге. */
    _offerMappingEntries: List[OfferMappingEntryDTO]
)
object OfferMappingEntriesDTO {
    def toStringBody(var_paging: Object, var_offerMappingEntries: Object) =
        s"""
        | {
        | "paging":$var_paging,"offerMappingEntries":$var_offerMappingEntries
        | }
        """.stripMargin
}
