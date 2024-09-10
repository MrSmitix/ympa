package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetChatsRequest._

case class GetChatsRequest (
  /* Фильтр по идентификаторам заказов на Маркете. */
  orderIds: Option[List[Long]],
/* Фильтр по типам чатов. */
  types: Option[List[ChatType]],
/* Фильтр по статусам чатов. */
  statuses: Option[List[ChatStatusType]])

object GetChatsRequest {
  import DateTimeCodecs._

  implicit val GetChatsRequestCodecJson: CodecJson[GetChatsRequest] = CodecJson.derive[GetChatsRequest]
  implicit val GetChatsRequestDecoder: EntityDecoder[GetChatsRequest] = jsonOf[GetChatsRequest]
  implicit val GetChatsRequestEncoder: EntityEncoder[GetChatsRequest] = jsonEncoderOf[GetChatsRequest]
}
