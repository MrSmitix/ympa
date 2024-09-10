package org.openapitools.server.model


/**
 * Сообщение об ошибке, связанной с размещением товара.
 *
 * @param message Тип ошибки. for example: ''null''
 * @param comment Пояснение. for example: ''null''
*/
final case class OfferErrorDTO (
  message: Option[String] = None,
  comment: Option[String] = None
)

