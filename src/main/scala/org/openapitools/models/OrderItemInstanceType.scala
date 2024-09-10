package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. 
 */
case class OrderItemInstanceType()

object OrderItemInstanceType {
    /**
     * Creates the codec for converting OrderItemInstanceType from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemInstanceType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemInstanceType] = deriveEncoder
}
