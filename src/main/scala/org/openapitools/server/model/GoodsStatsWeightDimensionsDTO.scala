package org.openapitools.server.model


/**
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 *
 * @param length Длина товара в сантиметрах. for example: ''null''
 * @param width Ширина товара в сантиметрах. for example: ''null''
 * @param height Высота товара в сантиметрах. for example: ''null''
 * @param weight Вес товара в килограммах. for example: ''null''
*/
final case class GoodsStatsWeightDimensionsDTO (
  length: Option[Double] = None,
  width: Option[Double] = None,
  height: Option[Double] = None,
  weight: Option[Double] = None
)

