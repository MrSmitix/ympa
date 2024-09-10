package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
 */
case class OutletStatusType()

object OutletStatusType {
    /**
     * Creates the codec for converting OutletStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OutletStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OutletStatusType] = deriveEncoder
}
