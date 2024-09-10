package org.openapitools.server.model


/**
 * @param order  for example: ''null''
*/
final case class GetOrderResponse (
  order: Option[OrderDTO] = None
)

