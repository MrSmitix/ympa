package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateStocksRequest._

case class UpdateStocksRequest (
  /* Данные об остатках товаров.  */
  skus: Set[UpdateStockDTO])

object UpdateStocksRequest {
  import DateTimeCodecs._

  implicit val UpdateStocksRequestCodecJson: CodecJson[UpdateStocksRequest] = CodecJson.derive[UpdateStocksRequest]
  implicit val UpdateStocksRequestDecoder: EntityDecoder[UpdateStocksRequest] = jsonOf[UpdateStocksRequest]
  implicit val UpdateStocksRequestEncoder: EntityEncoder[UpdateStocksRequest] = jsonEncoderOf[UpdateStocksRequest]
}
