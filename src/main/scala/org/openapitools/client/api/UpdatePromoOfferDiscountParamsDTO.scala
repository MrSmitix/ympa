package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePromoOfferDiscountParamsDTO._

case class UpdatePromoOfferDiscountParamsDTO (
  /* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  */
  price: Option[Long],
/* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  */
  promoPrice: Option[Long])

object UpdatePromoOfferDiscountParamsDTO {
  import DateTimeCodecs._

  implicit val UpdatePromoOfferDiscountParamsDTOCodecJson: CodecJson[UpdatePromoOfferDiscountParamsDTO] = CodecJson.derive[UpdatePromoOfferDiscountParamsDTO]
  implicit val UpdatePromoOfferDiscountParamsDTODecoder: EntityDecoder[UpdatePromoOfferDiscountParamsDTO] = jsonOf[UpdatePromoOfferDiscountParamsDTO]
  implicit val UpdatePromoOfferDiscountParamsDTOEncoder: EntityEncoder[UpdatePromoOfferDiscountParamsDTO] = jsonEncoderOf[UpdatePromoOfferDiscountParamsDTO]
}
