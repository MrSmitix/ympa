
package org.openapitools.client.model


case class FeedPublicationDTO (
    _status: Option[FeedStatusType],
    _full: Option[FeedPublicationFullDTO],
    _priceAndStockUpdate: Option[FeedPublicationPriceAndStockUpdateDTO]
)
object FeedPublicationDTO {
    def toStringBody(var_status: Object, var_full: Object, var_priceAndStockUpdate: Object) =
        s"""
        | {
        | "status":$var_status,"full":$var_full,"priceAndStockUpdate":$var_priceAndStockUpdate
        | }
        """.stripMargin
}
