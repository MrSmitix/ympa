
package org.openapitools.client.model

import java.time.LocalDate

case class DocumentDTO (
    _status: Option[OrderDocumentStatusType],
    /* Номер документа. */
    _number: Option[String],
    /* Дата создания документа. */
    _date: Option[LocalDate]
)
object DocumentDTO {
    def toStringBody(var_status: Object, var_number: Object, var_date: Object) =
        s"""
        | {
        | "status":$var_status,"number":$var_number,"date":$var_date
        | }
        """.stripMargin
}
