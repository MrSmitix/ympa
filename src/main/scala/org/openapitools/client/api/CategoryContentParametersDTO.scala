package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CategoryContentParametersDTO._

case class CategoryContentParametersDTO (
  /* Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). */
  categoryId: Integer,
/* Список характеристик. */
  parameters: Option[List[CategoryParameterDTO]])

object CategoryContentParametersDTO {
  import DateTimeCodecs._

  implicit val CategoryContentParametersDTOCodecJson: CodecJson[CategoryContentParametersDTO] = CodecJson.derive[CategoryContentParametersDTO]
  implicit val CategoryContentParametersDTODecoder: EntityDecoder[CategoryContentParametersDTO] = jsonOf[CategoryContentParametersDTO]
  implicit val CategoryContentParametersDTOEncoder: EntityEncoder[CategoryContentParametersDTO] = jsonEncoderOf[CategoryContentParametersDTO]
}
