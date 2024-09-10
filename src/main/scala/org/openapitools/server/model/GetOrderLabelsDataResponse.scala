package org.openapitools.server.model


/**
 * Ответ с информацией для печати ярлыков.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetOrderLabelsDataResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OrderLabelDTO] = None
)

