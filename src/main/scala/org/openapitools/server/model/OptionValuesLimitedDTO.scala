package org.openapitools.server.model


/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 *
 * @param limitingOptionValueId Идентификатор значения ограничивающей характеристики. for example: ''null''
 * @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики.  for example: ''null''
*/
final case class OptionValuesLimitedDTO (
  limitingOptionValueId: Long,
  optionValueIds: Seq[Long]
)

