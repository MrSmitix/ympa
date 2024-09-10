package org.openapitools.server.model


/**
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 *
 * @param promoId Идентификатор акции. for example: ''null''
 * @param offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить. for example: ''null''
*/
final case class UpdatePromoOffersRequest (
  promoId: String,
  offers: Seq[UpdatePromoOfferDTO]
)

