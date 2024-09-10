
package org.openapitools.client.model


case class AddHiddenOffersRequest (
    /* Список скрытых товаров.  */
    _hiddenOffers: List[HiddenOfferDTO]
)
object AddHiddenOffersRequest {
    def toStringBody(var_hiddenOffers: Object) =
        s"""
        | {
        | "hiddenOffers":$var_hiddenOffers
        | }
        """.stripMargin
}
