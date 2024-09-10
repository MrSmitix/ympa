/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.model.OfferCardRecommendationType._
import org.openapitools.client.model.ParameterType._

  /**
   * Характеристика товара.
   */
case class CategoryParameterDTO(
  /* Идентификатор характеристики. */
  id: Long,
  /* Название характеристики. */
  name: Option[String] = None,
  `type`: ParameterType,
  unit: Option[CategoryParameterUnitDTO] = None,
  /* Описание характеристики. */
  description: Option[String] = None,
  /* Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. */
  recommendationTypes: Option[Seq[OfferCardRecommendationType]] = None,
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
  values: Option[Seq[ParameterValueOptionDTO]] = None,
  constraints: Option[ParameterValueConstraintsDTO] = None,
  /* Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`. */
  valueRestrictions: Option[Seq[ValueRestrictionDTO]] = None
)

object CategoryParameterDTOEnums {

}
