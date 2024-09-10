package org.openapitools.server.model


/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 *
 * @param reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета. for example: ''null''
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах. for example: ''null''
*/
final case class GenerateReportDTO (
  reportId: String,
  estimatedGenerationTime: Long
)

