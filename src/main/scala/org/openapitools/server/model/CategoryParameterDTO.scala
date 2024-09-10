package org.openapitools.server.model


/**
 * Характеристика товара.
 *
 * @param id Идентификатор характеристики. for example: ''null''
 * @param name Название характеристики. for example: ''null''
 * @param `type`  for example: ''null''
 * @param unit  for example: ''null''
 * @param description Описание характеристики. for example: ''null''
 * @param recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. for example: ''null''
 * @param required Обязательность характеристики. for example: ''null''
 * @param filtering Используется ли характеристика в фильтре. for example: ''null''
 * @param distinctive Является ли характеристика особенностью варианта. for example: ''null''
 * @param multivalue Можно ли передать сразу несколько значений. for example: ''null''
 * @param allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. for example: ''null''
 * @param values Список допустимых значений параметра. Только для характеристик типа `ENUM`. for example: ''null''
 * @param constraints  for example: ''null''
 * @param valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. for example: ''null''
*/
final case class CategoryParameterDTO (
  id: Long,
  name: Option[String] = None,
  `type`: ParameterType,
  unit: Option[CategoryParameterUnitDTO] = None,
  description: Option[String] = None,
  recommendationTypes: Option[Seq[OfferCardRecommendationType]] = None,
  required: Boolean,
  filtering: Boolean,
  distinctive: Boolean,
  multivalue: Boolean,
  allowCustomValues: Boolean,
  values: Option[Seq[ParameterValueOptionDTO]] = None,
  constraints: Option[ParameterValueConstraintsDTO] = None,
  valueRestrictions: Option[Seq[ValueRestrictionDTO]] = None
)

