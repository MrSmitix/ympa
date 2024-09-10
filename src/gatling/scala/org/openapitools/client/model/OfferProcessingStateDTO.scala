
package org.openapitools.client.model


case class OfferProcessingStateDTO (
    _status: Option[OfferProcessingStatusType],
    /* Причины, по которым товар не прошел модерацию. */
    _notes: Option[List[OfferProcessingNoteDTO]]
)
object OfferProcessingStateDTO {
    def toStringBody(var_status: Object, var_notes: Object) =
        s"""
        | {
        | "status":$var_status,"notes":$var_notes
        | }
        """.stripMargin
}
