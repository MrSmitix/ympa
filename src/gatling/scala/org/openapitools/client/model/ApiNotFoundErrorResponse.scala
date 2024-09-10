
package org.openapitools.client.model


case class ApiNotFoundErrorResponse (
    _status: Option[ApiResponseStatusType],
    /* Список ошибок. */
    _errors: Option[List[ApiErrorDTO]]
)
object ApiNotFoundErrorResponse {
    def toStringBody(var_status: Object, var_errors: Object) =
        s"""
        | {
        | "status":$var_status,"errors":$var_errors
        | }
        """.stripMargin
}
