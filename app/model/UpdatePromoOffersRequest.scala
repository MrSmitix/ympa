package model

import play.api.libs.json._

/**
  * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
  * @param promoId Идентификатор акции.
  * @param offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdatePromoOffersRequest(
  promoId: String,
  offers: List[UpdatePromoOfferDTO]
)

object UpdatePromoOffersRequest {
  implicit lazy val updatePromoOffersRequestJsonFormat: Format[UpdatePromoOffersRequest] = Json.format[UpdatePromoOffersRequest]
}

