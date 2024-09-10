package org.openapitools.server.model


/**
 * Ссылка на следующую страницу. 
 *
 * @param nextPageToken Идентификатор следующей страницы результатов. for example: ''null''
*/
final case class ForwardScrollingPagerDTO (
  nextPageToken: Option[String] = None
)

