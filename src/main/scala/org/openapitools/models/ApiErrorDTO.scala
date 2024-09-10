package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Общий формат ошибки.
 * @param code Код ошибки.
 * @param message Описание ошибки.
 */
case class ApiErrorDTO(code: String,
                message: Option[String]
                )

object ApiErrorDTO {
    /**
     * Creates the codec for converting ApiErrorDTO from and to JSON.
     */
    implicit val decoder: Decoder[ApiErrorDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApiErrorDTO] = deriveEncoder
}
