package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Статус генерации и ссылка на готовый отчет.
 *
 * @param status  for example: ''null''
 * @param subStatus  for example: ''null''
 * @param generationRequestedAt Дата и время запроса на генерацию. for example: ''null''
 * @param generationFinishedAt Дата и время завершения генерации. for example: ''null''
 * @param file Ссылка на готовый отчет. for example: ''null''
 * @param estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах. for example: ''null''
*/
final case class ReportInfoDTO (
  status: ReportStatusType,
  subStatus: Option[ReportSubStatusType] = None,
  generationRequestedAt: OffsetDateTime,
  generationFinishedAt: Option[OffsetDateTime] = None,
  file: Option[String] = None,
  estimatedGenerationTime: Option[Long] = None
)

