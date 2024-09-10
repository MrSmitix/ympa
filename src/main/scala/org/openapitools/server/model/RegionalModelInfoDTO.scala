package org.openapitools.server.model


/**
 * Региональная информация.
 *
 * @param currency  for example: ''null''
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  for example: ''null''
*/
final case class RegionalModelInfoDTO (
  currency: Option[CurrencyType] = None,
  regionId: Option[Long] = None
)

