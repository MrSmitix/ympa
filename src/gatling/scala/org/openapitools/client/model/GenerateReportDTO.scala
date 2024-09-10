
package org.openapitools.client.model


case class GenerateReportDTO (
    /* Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. */
    _reportId: String,
    /* Ожидаемая продолжительность генерации в миллисекундах. */
    _estimatedGenerationTime: Long
)
object GenerateReportDTO {
    def toStringBody(var_reportId: Object, var_estimatedGenerationTime: Object) =
        s"""
        | {
        | "reportId":$var_reportId,"estimatedGenerationTime":$var_estimatedGenerationTime
        | }
        """.stripMargin
}
