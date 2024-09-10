package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CategoryParameterUnitDTO
import org.openapitools.models.OfferCardRecommendationType
import org.openapitools.models.ParameterType
import org.openapitools.models.ParameterValueConstraintsDTO
import org.openapitools.models.ParameterValueOptionDTO
import org.openapitools.models.ValueRestrictionDTO
import scala.collection.immutable.Seq

/**
 * Характеристика товара.
 * @param id Идентификатор характеристики.
 * @param name Название характеристики.
 * @param _type 
 * @param unit 
 * @param description Описание характеристики.
 * @param recommendationTypes Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
 * @param required Обязательность характеристики.
 * @param filtering Используется ли характеристика в фильтре.
 * @param distinctive Является ли характеристика особенностью варианта.
 * @param multivalue Можно ли передать сразу несколько значений.
 * @param allowCustomValues Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
 * @param values Список допустимых значений параметра. Только для характеристик типа `ENUM`.
 * @param constraints 
 * @param valueRestrictions Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
 */
case class CategoryParameterDTO(id: Long,
                name: Option[String],
                _type: ParameterType,
                unit: Option[CategoryParameterUnitDTO],
                description: Option[String],
                recommendationTypes: Option[Seq[OfferCardRecommendationType]],
                required: Boolean,
                filtering: Boolean,
                distinctive: Boolean,
                multivalue: Boolean,
                allowCustomValues: Boolean,
                values: Option[Seq[ParameterValueOptionDTO]],
                constraints: Option[ParameterValueConstraintsDTO],
                valueRestrictions: Option[Seq[ValueRestrictionDTO]]
                )

object CategoryParameterDTO {
    /**
     * Creates the codec for converting CategoryParameterDTO from and to JSON.
     */
    implicit val decoder: Decoder[CategoryParameterDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CategoryParameterDTO] = deriveEncoder
}
