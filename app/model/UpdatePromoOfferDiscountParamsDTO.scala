package model

import play.api.libs.json._

/**
  * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
  * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
  * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdatePromoOfferDiscountParamsDTO(
  price: Option[Long],
  promoPrice: Option[Long]
)

object UpdatePromoOfferDiscountParamsDTO {
  implicit lazy val updatePromoOfferDiscountParamsDTOJsonFormat: Format[UpdatePromoOfferDiscountParamsDTO] = Json.format[UpdatePromoOfferDiscountParamsDTO]
}

