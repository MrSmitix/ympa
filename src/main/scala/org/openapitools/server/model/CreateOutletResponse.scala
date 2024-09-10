package org.openapitools.server.model


/**
 * Ответ на запрос о создании точки продаж.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class CreateOutletResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[OutletResponseDTO] = None
)

