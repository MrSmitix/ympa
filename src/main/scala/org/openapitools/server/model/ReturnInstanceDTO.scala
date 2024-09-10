package org.openapitools.server.model


/**
 * Логистическая информация по возврату.
 *
 * @param stockType  for example: ''null''
 * @param status  for example: ''null''
 * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). for example: ''null''
 * @param imei Международный идентификатор мобильного оборудования. for example: ''null''
*/
final case class ReturnInstanceDTO (
  stockType: Option[ReturnInstanceStockType] = None,
  status: Option[ReturnInstanceStatusType] = None,
  cis: Option[String] = None,
  imei: Option[String] = None
)

