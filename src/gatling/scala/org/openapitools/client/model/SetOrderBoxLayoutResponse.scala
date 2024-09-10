
package org.openapitools.client.model


case class SetOrderBoxLayoutResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[OrderBoxesLayoutDTO]
)
object SetOrderBoxLayoutResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
