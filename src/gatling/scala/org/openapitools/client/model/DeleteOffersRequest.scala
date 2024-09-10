
package org.openapitools.client.model


case class DeleteOffersRequest (
    /* Список SKU товаров, которые нужно удалить. */
    _offerIds: List[String]
)
object DeleteOffersRequest {
    def toStringBody(var_offerIds: Object) =
        s"""
        | {
        | "offerIds":$var_offerIds
        | }
        """.stripMargin
}
