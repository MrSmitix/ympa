package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferDiscountParamsDTO._

case class PromoOfferDiscountParamsDTO (
  /* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
  price: Option[Long],
/* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
  promoPrice: Option[Long],
/* Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  */
  maxPromoPrice: Long)

object PromoOfferDiscountParamsDTO {
  import DateTimeCodecs._

  implicit val PromoOfferDiscountParamsDTOCodecJson: CodecJson[PromoOfferDiscountParamsDTO] = CodecJson.derive[PromoOfferDiscountParamsDTO]
  implicit val PromoOfferDiscountParamsDTODecoder: EntityDecoder[PromoOfferDiscountParamsDTO] = jsonOf[PromoOfferDiscountParamsDTO]
  implicit val PromoOfferDiscountParamsDTOEncoder: EntityEncoder[PromoOfferDiscountParamsDTO] = jsonEncoderOf[PromoOfferDiscountParamsDTO]
}
