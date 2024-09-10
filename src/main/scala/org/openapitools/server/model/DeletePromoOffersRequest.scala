package org.openapitools.server.model


/**
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 *
 * @param promoId Идентификатор акции. for example: ''null''
 * @param deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. for example: ''null''
 * @param offerIds Товары, которые нужно убрать из акции. for example: ''null''
*/
final case class DeletePromoOffersRequest (
  promoId: String,
  deleteAllOffers: Option[Boolean] = None,
  offerIds: Option[Seq[String]] = None
)

