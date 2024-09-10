package org.openapitools.server.model


/**
 * Данные, необходимые для генерации документа. 
 *
 * @param campaignId Идентификатор кампании. for example: ''null''
 * @param shipmentId Идентификатор отгрузки. for example: ''null''
 * @param orderIds Фильтр по идентификаторам заказа в отгрузке. for example: ''null''
*/
final case class GenerateShipmentListDocumentReportRequest (
  campaignId: Long,
  shipmentId: Option[Long] = None,
  orderIds: Option[Seq[Long]] = None
)

