package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerateGoodsRealizationReportRequest._

case class GenerateGoodsRealizationReportRequest (
  /* Идентификатор кампании. */
  campaignId: Long,
/* Год. */
  year: Integer,
/* Номер месяца. */
  month: Integer)

object GenerateGoodsRealizationReportRequest {
  import DateTimeCodecs._

  implicit val GenerateGoodsRealizationReportRequestCodecJson: CodecJson[GenerateGoodsRealizationReportRequest] = CodecJson.derive[GenerateGoodsRealizationReportRequest]
  implicit val GenerateGoodsRealizationReportRequestDecoder: EntityDecoder[GenerateGoodsRealizationReportRequest] = jsonOf[GenerateGoodsRealizationReportRequest]
  implicit val GenerateGoodsRealizationReportRequestEncoder: EntityEncoder[GenerateGoodsRealizationReportRequest] = jsonEncoderOf[GenerateGoodsRealizationReportRequest]
}
