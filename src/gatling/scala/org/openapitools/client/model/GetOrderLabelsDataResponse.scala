
package org.openapitools.client.model


case class GetOrderLabelsDataResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OrderLabelDTO]
)
object GetOrderLabelsDataResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
