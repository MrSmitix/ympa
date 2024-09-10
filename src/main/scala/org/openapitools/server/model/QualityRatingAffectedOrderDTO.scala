package org.openapitools.server.model


/**
 * Информация о заказе, который повлиял на индекс качества.
 *
 * @param orderId Идентификатор заказа. for example: ''null''
 * @param description Описание проблемы. for example: ''null''
 * @param componentType  for example: ''null''
*/
final case class QualityRatingAffectedOrderDTO (
  orderId: Long,
  description: String,
  componentType: AffectedOrderQualityRatingComponentType
)

