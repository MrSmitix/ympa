package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetChatsInfoDTO._

case class GetChatsInfoDTO (
  /* Информация о чатах. */
  chats: List[GetChatInfoDTO],
paging: Option[ForwardScrollingPagerDTO])

object GetChatsInfoDTO {
  import DateTimeCodecs._

  implicit val GetChatsInfoDTOCodecJson: CodecJson[GetChatsInfoDTO] = CodecJson.derive[GetChatsInfoDTO]
  implicit val GetChatsInfoDTODecoder: EntityDecoder[GetChatsInfoDTO] = jsonOf[GetChatsInfoDTO]
  implicit val GetChatsInfoDTOEncoder: EntityEncoder[GetChatsInfoDTO] = jsonEncoderOf[GetChatsInfoDTO]
}
