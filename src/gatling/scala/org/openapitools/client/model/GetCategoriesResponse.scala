
package org.openapitools.client.model


case class GetCategoriesResponse (
    _status: Option[ApiResponseStatusType],
    _result: Option[CategoryDTO]
)
object GetCategoriesResponse {
    def toStringBody(var_status: Object, var_result: Object) =
        s"""
        | {
        | "status":$var_status,"result":$var_result
        | }
        """.stripMargin
}
