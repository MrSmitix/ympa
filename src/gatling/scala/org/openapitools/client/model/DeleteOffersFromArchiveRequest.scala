
package org.openapitools.client.model


case class DeleteOffersFromArchiveRequest (
    /* Список товаров, которые нужно восстановить из архива. */
    _offerIds: List[String]
)
object DeleteOffersFromArchiveRequest {
    def toStringBody(var_offerIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds
        | }
        """.stripMargin
}
