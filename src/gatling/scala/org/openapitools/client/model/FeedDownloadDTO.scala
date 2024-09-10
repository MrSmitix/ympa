
package org.openapitools.client.model


case class FeedDownloadDTO (
    _status: Option[FeedStatusType],
    _error: Option[FeedDownloadErrorDTO]
)
object FeedDownloadDTO {
    def toStringBody(var_status: Object, var_error: Object) =
        s"""
        | {
        | "status":$var_status,"error":$var_error
        | }
        """.stripMargin
}
