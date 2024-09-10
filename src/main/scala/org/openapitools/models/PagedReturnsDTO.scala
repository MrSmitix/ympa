package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ForwardScrollingPagerDTO
import org.openapitools.models.ReturnDTO
import scala.collection.immutable.Seq

/**
 * Возвраты.
 * @param paging 
 * @param returns Список возвратов.
 */
case class PagedReturnsDTO(paging: Option[ForwardScrollingPagerDTO],
                returns: Seq[ReturnDTO]
                )

object PagedReturnsDTO {
    /**
     * Creates the codec for converting PagedReturnsDTO from and to JSON.
     */
    implicit val decoder: Decoder[PagedReturnsDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PagedReturnsDTO] = deriveEncoder
}
