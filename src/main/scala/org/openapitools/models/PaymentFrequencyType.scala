package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
 */
case class PaymentFrequencyType()

object PaymentFrequencyType {
    /**
     * Creates the codec for converting PaymentFrequencyType from and to JSON.
     */
    implicit val decoder: Decoder[PaymentFrequencyType] = deriveDecoder
    implicit val encoder: ObjectEncoder[PaymentFrequencyType] = deriveEncoder
}
