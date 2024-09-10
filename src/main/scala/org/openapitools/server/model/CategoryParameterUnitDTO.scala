package org.openapitools.server.model


/**
 * Единицы измерения характеристики товара.
 *
 * @param defaultUnitId Единица измерения по умолчанию. for example: ''null''
 * @param units Допустимые единицы измерения. for example: ''null''
*/
final case class CategoryParameterUnitDTO (
  defaultUnitId: Long,
  units: Seq[UnitDTO]
)

