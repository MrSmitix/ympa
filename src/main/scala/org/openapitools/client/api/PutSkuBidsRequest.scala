package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PutSkuBidsRequest._

case class PutSkuBidsRequest (
  /* Список товаров и ставки для продвижения, которые на них нужно установить. */
  bids: List[SkuBidItemDTO])

object PutSkuBidsRequest {
  import DateTimeCodecs._

  implicit val PutSkuBidsRequestCodecJson: CodecJson[PutSkuBidsRequest] = CodecJson.derive[PutSkuBidsRequest]
  implicit val PutSkuBidsRequestDecoder: EntityDecoder[PutSkuBidsRequest] = jsonOf[PutSkuBidsRequest]
  implicit val PutSkuBidsRequestEncoder: EntityEncoder[PutSkuBidsRequest] = jsonEncoderOf[PutSkuBidsRequest]
}
