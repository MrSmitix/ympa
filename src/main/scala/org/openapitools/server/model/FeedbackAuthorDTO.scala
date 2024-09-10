package org.openapitools.server.model


/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 *
 * @param name Имя автора отзыва. for example: ''null''
 * @param region  for example: ''null''
*/
final case class FeedbackAuthorDTO (
  name: Option[String] = None,
  region: Option[RegionDTO] = None
)

