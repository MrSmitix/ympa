package org.openapitools.server.model


/**
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetReturnsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[PagedReturnsDTO] = None
)

