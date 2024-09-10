package org.openapitools.server.model


/**
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 *
 * @param status  for example: ''null''
 * @param result  for example: ''null''
*/
final case class GetCategoryContentParametersResponse (
  status: Option[ApiResponseStatusType] = None,
  result: Option[CategoryContentParametersDTO] = None
)

