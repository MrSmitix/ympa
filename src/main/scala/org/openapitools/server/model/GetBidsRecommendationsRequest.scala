package org.openapitools.server.model


/**
 * description.
 *
 * @param skus Список товаров, для которых нужно получить рекомендации по ставкам.  for example: ''null''
*/
final case class GetBidsRecommendationsRequest (
  skus: Seq[String]
)

