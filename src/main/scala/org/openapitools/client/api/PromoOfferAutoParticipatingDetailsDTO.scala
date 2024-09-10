package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromoOfferAutoParticipatingDetailsDTO._

case class PromoOfferAutoParticipatingDetailsDTO (
  /* Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`.  */
  campaignIds: Option[List[Long]])

object PromoOfferAutoParticipatingDetailsDTO {
  import DateTimeCodecs._

  implicit val PromoOfferAutoParticipatingDetailsDTOCodecJson: CodecJson[PromoOfferAutoParticipatingDetailsDTO] = CodecJson.derive[PromoOfferAutoParticipatingDetailsDTO]
  implicit val PromoOfferAutoParticipatingDetailsDTODecoder: EntityDecoder[PromoOfferAutoParticipatingDetailsDTO] = jsonOf[PromoOfferAutoParticipatingDetailsDTO]
  implicit val PromoOfferAutoParticipatingDetailsDTOEncoder: EntityEncoder[PromoOfferAutoParticipatingDetailsDTO] = jsonEncoderOf[PromoOfferAutoParticipatingDetailsDTO]
}
