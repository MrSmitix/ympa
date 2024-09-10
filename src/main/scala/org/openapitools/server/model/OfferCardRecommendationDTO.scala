package org.openapitools.server.model


/**
 * Рекомендация по заполнению карточки товара.
 *
 * @param `type`  for example: ''null''
 * @param percent Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов. for example: ''null''
*/
final case class OfferCardRecommendationDTO (
  `type`: OfferCardRecommendationType,
  percent: Option[Int] = None
)

