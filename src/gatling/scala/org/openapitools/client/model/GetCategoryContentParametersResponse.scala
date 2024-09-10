
package org.openapitools.client.model


case class GetCategoryContentParametersResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[CategoryContentParametersDTO]
)
object GetCategoryContentParametersResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
