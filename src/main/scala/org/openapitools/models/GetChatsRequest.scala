package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ChatStatusType
import org.openapitools.models.ChatType
import scala.collection.immutable.Seq

/**
 * Фильтры по чатам, которые нужно вернуть. 
 * @param orderIds Фильтр по идентификаторам заказов на Маркете.
 * @param types Фильтр по типам чатов.
 * @param statuses Фильтр по статусам чатов.
 */
case class GetChatsRequest(orderIds: Option[Seq[Long]],
                types: Option[Seq[ChatType]],
                statuses: Option[Seq[ChatStatusType]]
                )

object GetChatsRequest {
    /**
     * Creates the codec for converting GetChatsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetChatsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetChatsRequest] = deriveEncoder
}
