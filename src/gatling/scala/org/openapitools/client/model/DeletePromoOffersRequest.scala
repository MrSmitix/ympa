
package org.openapitools.client.model


case class DeletePromoOffersRequest (
    /* Идентификатор акции. */
    _promoId: String,
    /* Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. */
    _deleteAllOffers: Option[Boolean],
    /* Товары, которые нужно убрать из акции. */
    _offerIds: Option[List[String]]
)
object DeletePromoOffersRequest {
    def toStringBody(var_promoId: Object, var_deleteAllOffers: Object, var_offerIds: Object) =
        s"""
        | {
        | "promoId":$var_promoId,"deleteAllOffers":$var_deleteAllOffers,"offerIds":$var_offerIds
        | }
        """.stripMargin
}
