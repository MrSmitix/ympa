package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerateMassOrderLabelsRequest._

case class GenerateMassOrderLabelsRequest (
  /* Идентификатор кабинета. */
  businessId: Long,
/* Список идентификаторов заказов. */
  orderIds: Set[Long])

object GenerateMassOrderLabelsRequest {
  import DateTimeCodecs._

  implicit val GenerateMassOrderLabelsRequestCodecJson: CodecJson[GenerateMassOrderLabelsRequest] = CodecJson.derive[GenerateMassOrderLabelsRequest]
  implicit val GenerateMassOrderLabelsRequestDecoder: EntityDecoder[GenerateMassOrderLabelsRequest] = jsonOf[GenerateMassOrderLabelsRequest]
  implicit val GenerateMassOrderLabelsRequestEncoder: EntityEncoder[GenerateMassOrderLabelsRequest] = jsonEncoderOf[GenerateMassOrderLabelsRequest]
}
