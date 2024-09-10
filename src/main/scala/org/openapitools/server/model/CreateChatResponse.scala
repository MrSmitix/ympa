package org.openapitools.server.model


/**
 * Результат создания чата.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class CreateChatResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[CreateChatResultDTO] = None
)

