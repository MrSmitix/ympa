package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OfferCardsContentStatusDTO._

case class OfferCardsContentStatusDTO (
  /* Страница списка товаров с информацией о состоянии карточек. */
  offerCards: List[OfferCardDTO],
paging: Option[ForwardScrollingPagerDTO])

object OfferCardsContentStatusDTO {
  import DateTimeCodecs._

  implicit val OfferCardsContentStatusDTOCodecJson: CodecJson[OfferCardsContentStatusDTO] = CodecJson.derive[OfferCardsContentStatusDTO]
  implicit val OfferCardsContentStatusDTODecoder: EntityDecoder[OfferCardsContentStatusDTO] = jsonOf[OfferCardsContentStatusDTO]
  implicit val OfferCardsContentStatusDTOEncoder: EntityEncoder[OfferCardsContentStatusDTO] = jsonEncoderOf[OfferCardsContentStatusDTO]
}
