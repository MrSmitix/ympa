package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime

/**
 * Запрос на обновление срока хранения заказа в ПВЗ.
 * @param newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
 */
case class UpdateOrderStorageLimitRequest(newDate: LocalDateTime
                )

object UpdateOrderStorageLimitRequest {
    /**
     * Creates the codec for converting UpdateOrderStorageLimitRequest from and to JSON.
     */
    implicit val decoder: Decoder[UpdateOrderStorageLimitRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateOrderStorageLimitRequest] = deriveEncoder
}
