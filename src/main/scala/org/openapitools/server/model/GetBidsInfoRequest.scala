package org.openapitools.server.model


/**
 * description.
 *
 * @param skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются.  for example: ''null''
*/
final case class GetBidsInfoRequest (
  skus: Option[Seq[String]] = None
)

