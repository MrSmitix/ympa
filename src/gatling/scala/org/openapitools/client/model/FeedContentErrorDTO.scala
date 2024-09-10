
package org.openapitools.client.model


case class FeedContentErrorDTO (
    _type: Option[FeedContentErrorType]
)
object FeedContentErrorDTO {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
