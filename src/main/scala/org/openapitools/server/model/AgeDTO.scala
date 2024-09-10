package org.openapitools.server.model


/**
 * Возраст в заданных единицах измерения.
 *
 * @param value Значение.  for example: ''null''
 * @param ageUnit  for example: ''null''
*/
final case class AgeDTO (
  value: Double,
  ageUnit: AgeUnitType
)

