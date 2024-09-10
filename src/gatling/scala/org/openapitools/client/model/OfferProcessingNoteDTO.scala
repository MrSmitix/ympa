
package org.openapitools.client.model


case class OfferProcessingNoteDTO (
    _type: Option[OfferProcessingNoteType],
    /* Дополнительная информация о причине отклонения товара.  */
    _payload: Option[String]
)
object OfferProcessingNoteDTO {
    def toStringBody(var_type: Object, var_payload: Object) =
        s"""
        | {
        | "type":$var_type,"payload":$var_payload
        | }
        """.stripMargin
}
