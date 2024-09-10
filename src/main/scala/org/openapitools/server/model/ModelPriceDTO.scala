package org.openapitools.server.model


/**
 * Информация о ценах на модель товара.
 *
 * @param avg Средняя цена предложения для модели в регионе. for example: ''null''
 * @param max Максимальная цена предложения для модели в регионе. for example: ''null''
 * @param min Минимальная цена предложения для модели в регионе. for example: ''null''
*/
final case class ModelPriceDTO (
  avg: Option[Double] = None,
  max: Option[Double] = None,
  min: Option[Double] = None
)

