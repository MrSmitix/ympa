
package org.openapitools.client.model


case class DeleteOffersFromArchiveDTO (
    /* Список товаров, которые не удалось восстановить из архива. */
    _notUnarchivedOfferIds: Option[List[String]]
)
object DeleteOffersFromArchiveDTO {
    def toStringBody(var_notUnarchivedOfferIds: Object) =
        s"""
        | {
        | "notUnarchivedOfferIds":$var_notUnarchivedOfferIds
        | }
        """.stripMargin
}
