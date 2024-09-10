package model

import play.api.libs.json._

/**
  * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
  * @param promoId Идентификатор акции.
  * @param deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
  * @param offerIds Товары, которые нужно убрать из акции.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class DeletePromoOffersRequest(
  promoId: String,
  deleteAllOffers: Option[Boolean],
  offerIds: Option[List[String]]
)

object DeletePromoOffersRequest {
  implicit lazy val deletePromoOffersRequestJsonFormat: Format[DeletePromoOffersRequest] = Json.format[DeletePromoOffersRequest]
}

