package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.LanguageType

/**
 * Параметры запроса категорий. 
 * @param language 
 */
case class GetCategoriesRequest(language: Option[LanguageType]
                )

object GetCategoriesRequest {
    /**
     * Creates the codec for converting GetCategoriesRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetCategoriesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCategoriesRequest] = deriveEncoder
}
