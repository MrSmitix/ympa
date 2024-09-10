package org.openapitools.server.model


/**
 * @param models Список моделей товаров. for example: ''null''
 * @param currency  for example: ''null''
 * @param regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  for example: ''null''
 * @param pager  for example: ''null''
*/
final case class SearchModelsResponse (
  models: Seq[ModelDTO],
  currency: Option[CurrencyType] = None,
  regionId: Option[Long] = None,
  pager: Option[FlippingPagerDTO] = None
)

