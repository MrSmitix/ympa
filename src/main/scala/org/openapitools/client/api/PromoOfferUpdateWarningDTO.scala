package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferUpdateWarningDTO._

case class PromoOfferUpdateWarningDTO (
  code: PromoOfferUpdateWarningCodeType,
/* Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.  */
  campaignIds: Option[List[Long]])

object PromoOfferUpdateWarningDTO {
  import DateTimeCodecs._

  implicit val PromoOfferUpdateWarningDTOCodecJson: CodecJson[PromoOfferUpdateWarningDTO] = CodecJson.derive[PromoOfferUpdateWarningDTO]
  implicit val PromoOfferUpdateWarningDTODecoder: EntityDecoder[PromoOfferUpdateWarningDTO] = jsonOf[PromoOfferUpdateWarningDTO]
  implicit val PromoOfferUpdateWarningDTOEncoder: EntityEncoder[PromoOfferUpdateWarningDTO] = jsonEncoderOf[PromoOfferUpdateWarningDTO]
}
