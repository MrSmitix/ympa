
package org.openapitools.client.model


case class UpdateOfferContentRequest (
    /* Список товаров с указанными характеристиками. */
    _offersContent: List[OfferContentDTO]
)
object UpdateOfferContentRequest {
    def toStringBody(var_offersContent: Object) =
        s"""
        | {
        | "offersContent":$var_offersContent
        | }
        """.stripMargin
}
