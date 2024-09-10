
package org.openapitools.client.model


case class UpdatePromoOffersResultDTO (
    /* Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  */
    _rejectedOffers: Option[List[RejectedPromoOfferUpdateDTO]],
    /* Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  */
    _warningOffers: Option[List[WarningPromoOfferUpdateDTO]]
)
object UpdatePromoOffersResultDTO {
    def toStringBody(var_rejectedOffers: Object, var_warningOffers: Object) =
        s"""
        | {
        | "rejectedOffers":$var_rejectedOffers,"warningOffers":$var_warningOffers
        | }
        """.stripMargin
}
