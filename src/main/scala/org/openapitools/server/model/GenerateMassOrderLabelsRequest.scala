package org.openapitools.server.model


/**
 * Данные, необходимые для генерации файла. 
 *
 * @param businessId Идентификатор кабинета. for example: ''null''
 * @param orderIds Список идентификаторов заказов. for example: ''null''
*/
final case class GenerateMassOrderLabelsRequest (
  businessId: Long,
  orderIds: Set[Long]
)

