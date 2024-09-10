package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.OrderDocumentStatusType

/**
 * Информация о документе.
 * @param status 
 * @param number Номер документа.
 * @param date Дата создания документа.
 */
case class DocumentDTO(status: Option[OrderDocumentStatusType],
                number: Option[String],
                date: Option[LocalDateTime]
                )

object DocumentDTO {
    /**
     * Creates the codec for converting DocumentDTO from and to JSON.
     */
    implicit val decoder: Decoder[DocumentDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[DocumentDTO] = deriveEncoder
}
