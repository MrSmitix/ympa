package org.openapitools.server.model


/**
 * Заказ, для которого нужно создать чат. 
 *
 * @param orderId Идентификатор заказа на Маркете. for example: ''null''
*/
final case class CreateChatRequest (
  orderId: Long
)

