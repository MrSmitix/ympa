
package org.openapitools.client.model


case class GetFeedIndexLogsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[FeedIndexLogsResultDTO]
)
object GetFeedIndexLogsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
