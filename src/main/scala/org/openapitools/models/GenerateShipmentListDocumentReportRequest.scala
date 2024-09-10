package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Данные, необходимые для генерации документа. 
 * @param campaignId Идентификатор кампании.
 * @param shipmentId Идентификатор отгрузки.
 * @param orderIds Фильтр по идентификаторам заказа в отгрузке.
 */
case class GenerateShipmentListDocumentReportRequest(campaignId: Long,
                shipmentId: Option[Long],
                orderIds: Option[Seq[Long]]
                )

object GenerateShipmentListDocumentReportRequest {
    /**
     * Creates the codec for converting GenerateShipmentListDocumentReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateShipmentListDocumentReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateShipmentListDocumentReportRequest] = deriveEncoder
}
