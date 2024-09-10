package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Информация о кабинете.
 * @param id Идентификатор кабинета.
 * @param name Название бизнеса.
 */
case class BusinessDTO(id: Option[Long],
                name: Option[String]
                )

object BusinessDTO {
    /**
     * Creates the codec for converting BusinessDTO from and to JSON.
     */
    implicit val decoder: Decoder[BusinessDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessDTO] = deriveEncoder
}
