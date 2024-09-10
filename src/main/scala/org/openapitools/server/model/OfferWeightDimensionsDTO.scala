package org.openapitools.server.model


/**
 * Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
 *
 * @param length Длина упаковки в см.  for example: ''65.55''
 * @param width Ширина упаковки в см.  for example: ''50.7''
 * @param height Высота упаковки в см.  for example: ''20''
 * @param weight Вес товара в кг с учетом упаковки (брутто).  for example: ''1.001''
*/
final case class OfferWeightDimensionsDTO (
  length: Double,
  width: Double,
  height: Double,
  weight: Double
)

