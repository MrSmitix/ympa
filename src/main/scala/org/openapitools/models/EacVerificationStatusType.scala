package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
 */
case class EacVerificationStatusType()

object EacVerificationStatusType {
    /**
     * Creates the codec for converting EacVerificationStatusType from and to JSON.
     */
    implicit val decoder: Decoder[EacVerificationStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[EacVerificationStatusType] = deriveEncoder
}
