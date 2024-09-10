
package org.openapitools.client.model


case class UpdateOfferMappingEntryRequest (
    /* Информация о товарах в каталоге. */
    _offerMappingEntries: List[UpdateOfferMappingEntryDTO]
)
object UpdateOfferMappingEntryRequest {
    def toStringBody(var_offerMappingEntries: Object) =
        s"""
        | {
        | "offerMappingEntries":$var_offerMappingEntries
        | }
        """.stripMargin
}
