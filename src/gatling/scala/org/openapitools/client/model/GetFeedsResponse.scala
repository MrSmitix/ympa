
package org.openapitools.client.model


case class GetFeedsResponse (
    /* Список прайс-листов. */
    _feeds: List[FeedDTO]
)
object GetFeedsResponse {
    def toStringBody(var_feeds: Object) =
        s"""
        | {
        | "feeds":$var_feeds
        | }
        """.stripMargin
}
