/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class CategoryParameterDTO(
  /* Идентификатор характеристики. */
  id: Long,

  /* Название характеристики. */
  name: Option[String],

  `type`: ParameterType,

  unit: Option[CategoryParameterUnitDTO],

  /* Описание характеристики. */
  description: Option[String],

  /* Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. */
  recommendationTypes: Option[List[OfferCardRecommendationType]],

  /* Обязательность характеристики. */
  required: Boolean,

  /* Используется ли характеристика в фильтре. */
  filtering: Boolean,

  /* Является ли характеристика особенностью варианта. */
  distinctive: Boolean,

  /* Можно ли передать сразу несколько значений. */
  multivalue: Boolean,

  /* Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`. */
  allowCustomValues: Boolean,

  /* Список допустимых значений параметра. Только для характеристик типа `ENUM`. */
  values: Option[List[ParameterValueOptionDTO]],

  constraints: Option[ParameterValueConstraintsDTO],

  /* Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. */
  valueRestrictions: Option[List[ValueRestrictionDTO]]

 )
