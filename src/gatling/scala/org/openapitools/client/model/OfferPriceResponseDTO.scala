
package org.openapitools.client.model

import java.time.OffsetDateTime

case class OfferPriceResponseDTO (
    /* Идентификатор предложения из прайс-листа. */
    _id: Option[String],
    _price: Option[PriceDTO],
    /* SKU на Маркете. */
    _marketSku: Option[Long],
    /* Дата и время последнего обновления цены на товар. */
    _updatedAt: Option[OffsetDateTime]
)
object OfferPriceResponseDTO {
    def toStringBody(var_id: Object, var_price: Object, var_marketSku: Object, var_updatedAt: Object) =
        s"""
        | {
        | "id":$var_id,"price":$var_price,"marketSku":$var_marketSku,"updatedAt":$var_updatedAt
        | }
        """.stripMargin
}
