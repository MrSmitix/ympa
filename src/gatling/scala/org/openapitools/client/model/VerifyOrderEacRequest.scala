
package org.openapitools.client.model


case class VerifyOrderEacRequest (
    /* Код для подтверждения ЭАПП. */
    _code: Option[String]
)
object VerifyOrderEacRequest {
    def toStringBody(var_code: Object) =
        s"""
        | {
        | "code":$var_code
        | }
        """.stripMargin
}
