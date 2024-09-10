package model

import play.api.libs.json._

/**
  * Характеристика товара.
  * @param id Идентификатор характеристики.
  * @param name Название характеристики.
  * @param description Описание характеристики.
  * @param recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  * @param required Обязательность характеристики.
  * @param filtering Используется ли характеристика в фильтре.
  * @param distinctive Является ли характеристика особенностью варианта.
  * @param multivalue Можно ли передать сразу несколько значений.
  * @param allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
  * @param values Список допустимых значений параметра. Только для характеристик типа `ENUM`.
  * @param valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CategoryParameterDTO(
  id: Long,
  name: Option[String],
  `type`: ParameterType,
  unit: Option[CategoryParameterUnitDTO],
  description: Option[String],
  recommendationTypes: Option[List[OfferCardRecommendationType]],
  required: Boolean,
  filtering: Boolean,
  distinctive: Boolean,
  multivalue: Boolean,
  allowCustomValues: Boolean,
  values: Option[List[ParameterValueOptionDTO]],
  constraints: Option[ParameterValueConstraintsDTO],
  valueRestrictions: Option[List[ValueRestrictionDTO]]
)

object CategoryParameterDTO {
  implicit lazy val categoryParameterDTOJsonFormat: Format[CategoryParameterDTO] = Json.format[CategoryParameterDTO]
}

