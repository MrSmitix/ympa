package org.openapitools.server.model


/**
 * description.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetBidsInfoResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GetBidsInfoResponseDTO] = None
)

