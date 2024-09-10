package org.openapitools.server.model


/**
 * Запрос на установку новых значений для параметров.
 *
 * @param offersContent Список товаров с указанными характеристиками. for example: ''null''
*/
final case class UpdateOfferContentRequest (
  offersContent: Seq[OfferContentDTO]
)

