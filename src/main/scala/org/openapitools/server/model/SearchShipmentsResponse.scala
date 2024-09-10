package org.openapitools.server.model


/**
 * Ответ на запрос информации об отгрузках.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class SearchShipmentsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[SearchShipmentsResponseDTO] = None
)

