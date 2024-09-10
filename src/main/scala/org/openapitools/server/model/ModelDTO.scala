package org.openapitools.server.model


/**
 * Модель товара.
 *
 * @param id Идентификатор модели товара. for example: ''null''
 * @param name Название модели товара. for example: ''null''
 * @param prices  for example: ''null''
*/
final case class ModelDTO (
  id: Option[Long] = None,
  name: Option[String] = None,
  prices: Option[ModelPriceDTO] = None
)

