package org.openapitools.server.model


/**
 * Информация о страницах результатов.
 *
 * @param nextPageToken Идентификатор следующей страницы результатов. for example: ''null''
 * @param prevPageToken Идентификатор предыдущей страницы результатов. for example: ''null''
*/
final case class ScrollingPagerDTO (
  nextPageToken: Option[String] = None,
  prevPageToken: Option[String] = None
)

