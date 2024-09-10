package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. 
 */
case class FieldStateType()

object FieldStateType {
    /**
     * Creates the codec for converting FieldStateType from and to JSON.
     */
    implicit val decoder: Decoder[FieldStateType] = deriveDecoder
    implicit val encoder: ObjectEncoder[FieldStateType] = deriveEncoder
}
