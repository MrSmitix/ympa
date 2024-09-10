package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferParamsDTO._

case class PromoOfferParamsDTO (
  discountParams: Option[PromoOfferDiscountParamsDTO],
promocodeParams: Option[PromoOfferPromocodeParamsDTO])

object PromoOfferParamsDTO {
  import DateTimeCodecs._

  implicit val PromoOfferParamsDTOCodecJson: CodecJson[PromoOfferParamsDTO] = CodecJson.derive[PromoOfferParamsDTO]
  implicit val PromoOfferParamsDTODecoder: EntityDecoder[PromoOfferParamsDTO] = jsonOf[PromoOfferParamsDTO]
  implicit val PromoOfferParamsDTOEncoder: EntityEncoder[PromoOfferParamsDTO] = jsonEncoderOf[PromoOfferParamsDTO]
}
