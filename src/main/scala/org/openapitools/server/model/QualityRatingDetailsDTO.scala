package org.openapitools.server.model


/**
 * Информация о заказах, которые повлияли на индекс качества.
 *
 * @param affectedOrders Список заказов, которые повлияли на индекс качества. for example: ''null''
*/
final case class QualityRatingDetailsDTO (
  affectedOrders: Seq[QualityRatingAffectedOrderDTO]
)

