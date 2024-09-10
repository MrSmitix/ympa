package org.openapitools.server.model


/**
 * Идентификаторы, которые связаны с отзывом.
 *
 * @param orderId Идентификатор заказа на Маркете. for example: ''null''
 * @param modelId Идентификатор модели товара. for example: ''null''
*/
final case class GoodsFeedbackIdentifiersDTO (
  orderId: Long,
  modelId: Long
)

