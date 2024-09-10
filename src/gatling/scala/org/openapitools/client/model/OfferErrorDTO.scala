
package org.openapitools.client.model


case class OfferErrorDTO (
    /* Тип ошибки. */
    _message: Option[String],
    /* Пояснение. */
    _comment: Option[String]
)
object OfferErrorDTO {
    def toStringBody(var_message: Object, var_comment: Object) =
        s"""
        | {
        | "message":$var_message,"comment":$var_comment
        | }
        """.stripMargin
}
