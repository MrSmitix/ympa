package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBidsInfoRequest._

case class GetBidsInfoRequest (
  /* Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются.  */
  skus: Option[List[String]])

object GetBidsInfoRequest {
  import DateTimeCodecs._

  implicit val GetBidsInfoRequestCodecJson: CodecJson[GetBidsInfoRequest] = CodecJson.derive[GetBidsInfoRequest]
  implicit val GetBidsInfoRequestDecoder: EntityDecoder[GetBidsInfoRequest] = jsonOf[GetBidsInfoRequest]
  implicit val GetBidsInfoRequestEncoder: EntityEncoder[GetBidsInfoRequest] = jsonEncoderOf[GetBidsInfoRequest]
}
