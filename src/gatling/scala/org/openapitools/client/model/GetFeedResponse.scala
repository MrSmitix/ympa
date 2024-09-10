
package org.openapitools.client.model


case class GetFeedResponse (
    _feed: Option[FeedDTO]
)
object GetFeedResponse {
    def toStringBody(var_feed: Object) =
        s"""
        | {
        | "feed":$var_feed
        | }
        """.stripMargin
}
