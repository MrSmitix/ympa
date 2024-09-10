package org.openapitools.server.model


/**
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetFeedbackListResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[FeedbackListDTO] = None
)

