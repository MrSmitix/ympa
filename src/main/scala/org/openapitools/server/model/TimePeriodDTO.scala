package org.openapitools.server.model


/**
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 *
 * @param timePeriod Продолжительность в указанных единицах. for example: ''null''
 * @param timeUnit  for example: ''null''
 * @param comment Комментарий. for example: ''null''
*/
final case class TimePeriodDTO (
  timePeriod: Int,
  timeUnit: TimeUnitType,
  comment: Option[String] = None
)

