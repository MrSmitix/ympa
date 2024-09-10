package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
 */
case class ChatMessageSenderType()

object ChatMessageSenderType {
    /**
     * Creates the codec for converting ChatMessageSenderType from and to JSON.
     */
    implicit val decoder: Decoder[ChatMessageSenderType] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatMessageSenderType] = deriveEncoder
}
