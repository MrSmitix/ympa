package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
 * @param id Идентификатор категории.
 * @param name Название категории.
 * @param children Дочерние категории.
 */
case class CategoryDTO(id: Long,
                name: String,
                children: Option[Seq[CategoryDTO]]
                )

object CategoryDTO {
    /**
     * Creates the codec for converting CategoryDTO from and to JSON.
     */
    implicit val decoder: Decoder[CategoryDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CategoryDTO] = deriveEncoder
}
