package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferPromocodeParamsDTO._

case class PromoOfferPromocodeParamsDTO (
  /* Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  */
  maxPrice: Long)

object PromoOfferPromocodeParamsDTO {
  import DateTimeCodecs._

  implicit val PromoOfferPromocodeParamsDTOCodecJson: CodecJson[PromoOfferPromocodeParamsDTO] = CodecJson.derive[PromoOfferPromocodeParamsDTO]
  implicit val PromoOfferPromocodeParamsDTODecoder: EntityDecoder[PromoOfferPromocodeParamsDTO] = jsonOf[PromoOfferPromocodeParamsDTO]
  implicit val PromoOfferPromocodeParamsDTOEncoder: EntityEncoder[PromoOfferPromocodeParamsDTO] = jsonEncoderOf[PromoOfferPromocodeParamsDTO]
}
