package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Время проведения акции.
 *
 * @param dateTimeFrom Дата и время начала акции. for example: ''null''
 * @param dateTimeTo Дата и время окончания акции. for example: ''null''
*/
final case class PromoPeriodDTO (
  dateTimeFrom: OffsetDateTime,
  dateTimeTo: OffsetDateTime
)

