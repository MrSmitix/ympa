package org.openapitools.server.model


/**
 * Информация о товарах в каталоге. 
 *
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  for example: ''null''
 * @param marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  for example: ''null''
 * @param marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  for example: ''null''
 * @param marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  for example: ''null''
 * @param marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  for example: ''null''
*/
final case class GetMappingDTO (
  marketSku: Option[Long] = None,
  marketSkuName: Option[String] = None,
  marketModelId: Option[Long] = None,
  marketModelName: Option[String] = None,
  marketCategoryId: Option[Long] = None,
  marketCategoryName: Option[String] = None
)

