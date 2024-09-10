
package org.openapitools.client.model


case class ApiForbiddenErrorResponse (
    _status: Option[ApiResponseStatusType],
    /* Список ошибок. */
    _errors: Option[List[ApiErrorDTO]]
)
object ApiForbiddenErrorResponse {
    def toStringBody(var_status: Object, var_errors: Object) =
        s"""
        | {
        | "status":$var_status,"errors":$var_errors
        | }
        """.stripMargin
}
