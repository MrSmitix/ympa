package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.DocumentDTO

/**
 * Информация о документах. 
 * @param upd 
 * @param ukd 
 * @param torgTwelve 
 * @param sf 
 * @param ksf 
 */
case class OrderBusinessDocumentsDTO(upd: Option[DocumentDTO],
                ukd: Option[DocumentDTO],
                torgTwelve: Option[DocumentDTO],
                sf: Option[DocumentDTO],
                ksf: Option[DocumentDTO]
                )

object OrderBusinessDocumentsDTO {
    /**
     * Creates the codec for converting OrderBusinessDocumentsDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBusinessDocumentsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBusinessDocumentsDTO] = deriveEncoder
}
