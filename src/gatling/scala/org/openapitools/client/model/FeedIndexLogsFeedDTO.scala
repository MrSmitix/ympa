
package org.openapitools.client.model


case class FeedIndexLogsFeedDTO (
    /* Идентификатор прайс-листа. */
    _id: Option[Long]
)
object FeedIndexLogsFeedDTO {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
