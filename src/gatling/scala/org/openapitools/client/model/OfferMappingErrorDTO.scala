
package org.openapitools.client.model


case class OfferMappingErrorDTO (
    _type: OfferMappingErrorType,
    /* Идентификатор характеристики, с которой связана ошибка. */
    _parameterId: Option[Long],
    /* Текст ошибки. */
    _message: String
)
object OfferMappingErrorDTO {
    def toStringBody(var_type: Object, var_parameterId: Object, var_message: Object) =
        s"""
        | {
        | "type":$var_type,"parameterId":$var_parameterId,"message":$var_message
        | }
        """.stripMargin
}
