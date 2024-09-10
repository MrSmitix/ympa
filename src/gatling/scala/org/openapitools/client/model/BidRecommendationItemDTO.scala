
package org.openapitools.client.model


case class BidRecommendationItemDTO (
    /* Значение ставки. */
    _bid: Integer,
    /* Доля показов.  */
    _showPercent: Long
)
object BidRecommendationItemDTO {
    def toStringBody(var_bid: Object, var_showPercent: Object) =
        s"""
        | {
        | "bid":$var_bid,"showPercent":$var_showPercent
        | }
        """.stripMargin
}
