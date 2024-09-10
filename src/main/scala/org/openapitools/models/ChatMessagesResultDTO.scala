package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ChatMessageDTO
import org.openapitools.models.ForwardScrollingPagerDTO
import scala.collection.immutable.Seq

/**
 * Информация о сообщениях.
 * @param orderId Идентификатор заказа.
 * @param messages Информация о сообщениях.
 * @param paging 
 */
case class ChatMessagesResultDTO(orderId: Long,
                messages: Seq[ChatMessageDTO],
                paging: Option[ForwardScrollingPagerDTO]
                )

object ChatMessagesResultDTO {
    /**
     * Creates the codec for converting ChatMessagesResultDTO from and to JSON.
     */
    implicit val decoder: Decoder[ChatMessagesResultDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatMessagesResultDTO] = deriveEncoder
}
