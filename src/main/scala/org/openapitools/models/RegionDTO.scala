package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.RegionType
import scala.collection.immutable.Seq

/**
 * Регион доставки.
 * @param id Идентификатор региона.
 * @param name Название региона.
 * @param _type 
 * @param parent 
 * @param children Дочерние регионы.
 */
case class RegionDTO(id: Option[Long],
                name: String,
                _type: RegionType,
                parent: Option[RegionDTO],
                children: Option[Seq[RegionDTO]]
                )

object RegionDTO {
    /**
     * Creates the codec for converting RegionDTO from and to JSON.
     */
    implicit val decoder: Decoder[RegionDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[RegionDTO] = deriveEncoder
}
