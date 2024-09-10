package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetMappingDTO._

case class GetMappingDTO (
  /* SKU на Маркете. */
  marketSku: Option[Long],
/* Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
  marketSkuName: Option[String],
/* Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
  marketModelId: Option[Long],
/* Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  */
  marketModelName: Option[String],
/* Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
  marketCategoryId: Option[Long],
/* Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  */
  marketCategoryName: Option[String])

object GetMappingDTO {
  import DateTimeCodecs._

  implicit val GetMappingDTOCodecJson: CodecJson[GetMappingDTO] = CodecJson.derive[GetMappingDTO]
  implicit val GetMappingDTODecoder: EntityDecoder[GetMappingDTO] = jsonOf[GetMappingDTO]
  implicit val GetMappingDTOEncoder: EntityEncoder[GetMappingDTO] = jsonEncoderOf[GetMappingDTO]
}
