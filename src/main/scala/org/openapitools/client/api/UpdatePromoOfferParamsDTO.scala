package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePromoOfferParamsDTO._

case class UpdatePromoOfferParamsDTO (
  discountParams: Option[UpdatePromoOfferDiscountParamsDTO])

object UpdatePromoOfferParamsDTO {
  import DateTimeCodecs._

  implicit val UpdatePromoOfferParamsDTOCodecJson: CodecJson[UpdatePromoOfferParamsDTO] = CodecJson.derive[UpdatePromoOfferParamsDTO]
  implicit val UpdatePromoOfferParamsDTODecoder: EntityDecoder[UpdatePromoOfferParamsDTO] = jsonOf[UpdatePromoOfferParamsDTO]
  implicit val UpdatePromoOfferParamsDTOEncoder: EntityEncoder[UpdatePromoOfferParamsDTO] = jsonEncoderOf[UpdatePromoOfferParamsDTO]
}
