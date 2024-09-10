package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerateShipmentListDocumentReportRequest._

case class GenerateShipmentListDocumentReportRequest (
  /* Идентификатор кампании. */
  campaignId: Long,
/* Идентификатор отгрузки. */
  shipmentId: Option[Long],
/* Фильтр по идентификаторам заказа в отгрузке. */
  orderIds: Option[List[Long]])

object GenerateShipmentListDocumentReportRequest {
  import DateTimeCodecs._

  implicit val GenerateShipmentListDocumentReportRequestCodecJson: CodecJson[GenerateShipmentListDocumentReportRequest] = CodecJson.derive[GenerateShipmentListDocumentReportRequest]
  implicit val GenerateShipmentListDocumentReportRequestDecoder: EntityDecoder[GenerateShipmentListDocumentReportRequest] = jsonOf[GenerateShipmentListDocumentReportRequest]
  implicit val GenerateShipmentListDocumentReportRequestEncoder: EntityEncoder[GenerateShipmentListDocumentReportRequest] = jsonEncoderOf[GenerateShipmentListDocumentReportRequest]
}
