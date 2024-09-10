
package org.openapitools.client.model


case class GetGoodsFeedbackResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[GoodsFeedbackListDTO]
)
object GetGoodsFeedbackResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
