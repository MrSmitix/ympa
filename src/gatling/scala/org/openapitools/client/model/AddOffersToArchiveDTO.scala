
package org.openapitools.client.model


case class AddOffersToArchiveDTO (
    /* Список товаров, которые не удалось поместить в архив. */
    _notArchivedOffers: Option[List[AddOffersToArchiveErrorDTO]]
)
object AddOffersToArchiveDTO {
    def toStringBody(var_notArchivedOffers: Object) =
        s"""
        | {
        | "notArchivedOffers":$var_notArchivedOffers
        | }
        """.stripMargin
}
