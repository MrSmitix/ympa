
package org.openapitools.client.model


case class ApiErrorDTO (
    /* Код ошибки. */
    _code: String,
    /* Описание ошибки. */
    _message: Option[String]
)
object ApiErrorDTO {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
