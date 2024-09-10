package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePromoOffersResultDTO._

case class UpdatePromoOffersResultDTO (
  /* Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения.  */
  rejectedOffers: Option[List[RejectedPromoOfferUpdateDTO]],
/* Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения.  */
  warningOffers: Option[List[WarningPromoOfferUpdateDTO]])

object UpdatePromoOffersResultDTO {
  import DateTimeCodecs._

  implicit val UpdatePromoOffersResultDTOCodecJson: CodecJson[UpdatePromoOffersResultDTO] = CodecJson.derive[UpdatePromoOffersResultDTO]
  implicit val UpdatePromoOffersResultDTODecoder: EntityDecoder[UpdatePromoOffersResultDTO] = jsonOf[UpdatePromoOffersResultDTO]
  implicit val UpdatePromoOffersResultDTOEncoder: EntityEncoder[UpdatePromoOffersResultDTO] = jsonEncoderOf[UpdatePromoOffersResultDTO]
}
