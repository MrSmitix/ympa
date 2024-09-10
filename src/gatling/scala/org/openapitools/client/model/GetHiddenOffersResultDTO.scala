
package org.openapitools.client.model


case class GetHiddenOffersResultDTO (
    _paging: Option[ScrollingPagerDTO],
    /* Список скрытых товаров. */
    _hiddenOffers: List[HiddenOfferDTO]
)
object GetHiddenOffersResultDTO {
    def toStringBody(var_paging: Object, var_hiddenOffers: Object) =
        s"""
        | {
        | "paging":$var_paging,"hiddenOffers":$var_hiddenOffers
        | }
        """.stripMargin
}
