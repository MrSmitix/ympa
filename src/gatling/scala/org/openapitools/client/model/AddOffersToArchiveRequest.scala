
package org.openapitools.client.model


case class AddOffersToArchiveRequest (
    /* Список товаров, которые нужно поместить в архив. */
    _offerIds: List[String]
)
object AddOffersToArchiveRequest {
    def toStringBody(var_offerIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds
        | }
        """.stripMargin
}
