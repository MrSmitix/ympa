package org.openapitools.server.model


/**
 * @param offerIds Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. for example: ''null''
 * @param cofinancePriceFilter  for example: ''null''
 * @param recommendedCofinancePriceFilter  for example: ''null''
 * @param competitivenessFilter  for example: ''null''
*/
final case class GetOfferRecommendationsRequest (
  offerIds: Option[Seq[String]] = None,
  cofinancePriceFilter: Option[FieldStateType] = None,
  recommendedCofinancePriceFilter: Option[FieldStateType] = None,
  competitivenessFilter: Option[PriceCompetitivenessType] = None
)

