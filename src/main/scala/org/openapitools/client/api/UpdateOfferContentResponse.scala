package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateOfferContentResponse._

case class UpdateOfferContentResponse (
  status: Option[ApiResponseStatusType],
/* Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  */
  results: Option[List[UpdateOfferContentResultDTO]])

object UpdateOfferContentResponse {
  import DateTimeCodecs._

  implicit val UpdateOfferContentResponseCodecJson: CodecJson[UpdateOfferContentResponse] = CodecJson.derive[UpdateOfferContentResponse]
  implicit val UpdateOfferContentResponseDecoder: EntityDecoder[UpdateOfferContentResponse] = jsonOf[UpdateOfferContentResponse]
  implicit val UpdateOfferContentResponseEncoder: EntityEncoder[UpdateOfferContentResponse] = jsonEncoderOf[UpdateOfferContentResponse]
}
