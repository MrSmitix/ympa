
package org.openapitools.client.model


case class DeleteOffersDTO (
    /* Список SKU товаров, которые не удалось удалить. */
    _notDeletedOfferIds: Option[List[String]]
)
object DeleteOffersDTO {
    def toStringBody(var_notDeletedOfferIds: Object) =
        s"""
        | {
        | "notDeletedOfferIds":$var_notDeletedOfferIds
        | }
        """.stripMargin
}
