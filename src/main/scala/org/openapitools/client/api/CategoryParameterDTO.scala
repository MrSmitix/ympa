package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CategoryParameterDTO._

case class CategoryParameterDTO (
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
  valueRestrictions: Option[List[ValueRestrictionDTO]])

object CategoryParameterDTO {
  import DateTimeCodecs._

  implicit val CategoryParameterDTOCodecJson: CodecJson[CategoryParameterDTO] = CodecJson.derive[CategoryParameterDTO]
  implicit val CategoryParameterDTODecoder: EntityDecoder[CategoryParameterDTO] = jsonOf[CategoryParameterDTO]
  implicit val CategoryParameterDTOEncoder: EntityEncoder[CategoryParameterDTO] = jsonEncoderOf[CategoryParameterDTO]
}
