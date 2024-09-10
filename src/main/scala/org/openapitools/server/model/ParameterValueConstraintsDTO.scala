package org.openapitools.server.model


/**
 * Ограничения на значения характеристик.
 *
 * @param minValue Минимальное число. for example: ''null''
 * @param maxValue Максимальное число. for example: ''null''
 * @param maxLength Максимальная длина текста. for example: ''null''
*/
final case class ParameterValueConstraintsDTO (
  minValue: Option[Double] = None,
  maxValue: Option[Double] = None,
  maxLength: Option[Int] = None
)

