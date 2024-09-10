package org.openapitools.server.model


/**
 * Инструкция по использованию товара. 
 *
 * @param url Ссылка на инструкцию. for example: ''null''
 * @param title Название инструкции, которое будет отображаться на карточке товара.  for example: ''null''
*/
final case class OfferManualDTO (
  url: String,
  title: Option[String] = None
)

