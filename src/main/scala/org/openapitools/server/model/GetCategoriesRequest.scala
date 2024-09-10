package org.openapitools.server.model


/**
 * Параметры запроса категорий. 
 *
 * @param language  for example: ''null''
*/
final case class GetCategoriesRequest (
  language: Option[LanguageType] = None
)

