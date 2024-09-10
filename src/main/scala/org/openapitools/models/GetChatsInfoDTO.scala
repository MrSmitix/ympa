package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.GetChatInfoDTO
import scala.collection.immutable.Seq

/**
 * Список чатов.
 * @param chats Информация о чатах.
 * @param paging 
 */
case class GetChatsInfoDTO(chats: Seq[GetChatInfoDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object GetChatsInfoDTO {
    /**
     * Creates the codec for converting GetChatsInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetChatsInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetChatsInfoDTO] = deriveEncoder
}
