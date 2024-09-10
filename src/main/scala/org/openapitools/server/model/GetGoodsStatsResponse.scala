package org.openapitools.server.model


/**
 * Ответ на запрос отчета по товарам.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetGoodsStatsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GoodsStatsDTO] = None
)

