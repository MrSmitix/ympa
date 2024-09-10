package org.openapitools.server.model


/**
 * description.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetBidsRecommendationsResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[GetBidsRecommendationsResponseDTO] = None
)

