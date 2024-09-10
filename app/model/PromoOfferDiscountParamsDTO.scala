package model

import play.api.libs.json._

/**
  * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
  * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  * @param maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoOfferDiscountParamsDTO(
  price: Option[Long],
  promoPrice: Option[Long],
  maxPromoPrice: Long
)

object PromoOfferDiscountParamsDTO {
  implicit lazy val promoOfferDiscountParamsDTOJsonFormat: Format[PromoOfferDiscountParamsDTO] = Json.format[PromoOfferDiscountParamsDTO]
}

