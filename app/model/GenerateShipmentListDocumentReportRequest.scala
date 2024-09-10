package model

import play.api.libs.json._

/**
  * Данные, необходимые для генерации документа. 
  * @param campaignId Идентификатор кампании.
  * @param shipmentId Идентификатор отгрузки.
  * @param orderIds Фильтр по идентификаторам заказа в отгрузке.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateShipmentListDocumentReportRequest(
  campaignId: Long,
  shipmentId: Option[Long],
  orderIds: Option[List[Long]]
)

object GenerateShipmentListDocumentReportRequest {
  implicit lazy val generateShipmentListDocumentReportRequestJsonFormat: Format[GenerateShipmentListDocumentReportRequest] = Json.format[GenerateShipmentListDocumentReportRequest]
}

