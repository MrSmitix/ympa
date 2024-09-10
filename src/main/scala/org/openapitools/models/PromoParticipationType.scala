package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */
case class PromoParticipationType()

object PromoParticipationType {
    /**
     * Creates the codec for converting PromoParticipationType from and to JSON.
     */
    implicit val decoder: Decoder[PromoParticipationType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoParticipationType] = deriveEncoder
}
