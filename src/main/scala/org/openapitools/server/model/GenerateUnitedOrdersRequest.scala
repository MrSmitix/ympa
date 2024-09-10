package org.openapitools.server.model

import java.time.LocalDate

/**
 * Данные, необходимые для генерации отчета. 
 *
 * @param businessId Идентификатор бизнеса. for example: ''null''
 * @param dateFrom Начало периода, включительно. for example: ''null''
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год. for example: ''null''
 * @param campaignIds Список магазинов, которые нужны в отчете. for example: ''null''
 * @param promoId Идентификатор акции, товары из которой нужны в отчете. for example: ''null''
*/
final case class GenerateUnitedOrdersRequest (
  businessId: Long,
  dateFrom: LocalDate,
  dateTo: LocalDate,
  campaignIds: Option[Seq[Long]] = None,
  promoId: Option[String] = None
)

