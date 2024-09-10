package org.openapitools.server.model


/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 *
 * @param campaignId Идентификатор кампании. for example: ''null''
 * @param year Год. for example: ''null''
 * @param month Номер месяца. for example: ''null''
*/
final case class GenerateGoodsRealizationReportRequest (
  campaignId: Long,
  year: Int,
  month: Int
)

