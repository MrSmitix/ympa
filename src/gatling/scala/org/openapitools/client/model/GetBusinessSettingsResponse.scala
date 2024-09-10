
package org.openapitools.client.model


case class GetBusinessSettingsResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GetBusinessSettingsInfoDTO]
)
object GetBusinessSettingsResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
