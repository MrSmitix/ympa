
package org.openapitools.client.model

import java.time.OffsetDateTime

case class ReportInfoDTO (
    _status: ReportStatusType,
    _subStatus: Option[ReportSubStatusType],
    /* Дата и время запроса на генерацию. */
    _generationRequestedAt: OffsetDateTime,
    /* Дата и время завершения генерации. */
    _generationFinishedAt: Option[OffsetDateTime],
    /* Ссылка на готовый отчет. */
    _file: Option[String],
    /* Ожидаемая продолжительность генерации в миллисекундах. */
    _estimatedGenerationTime: Option[Long]
)
object ReportInfoDTO {
    def toStringBody(var_status: Object, var_subStatus: Object, var_generationRequestedAt: Object, var_generationFinishedAt: Object, var_file: Object, var_estimatedGenerationTime: Object) =
        s"""
        | {
        | "status":$var_status,"subStatus":$var_subStatus,"generationRequestedAt":$var_generationRequestedAt,"generationFinishedAt":$var_generationFinishedAt,"file":$var_file,"estimatedGenerationTime":$var_estimatedGenerationTime
        | }
        """.stripMargin
}
