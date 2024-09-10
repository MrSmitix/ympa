package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Данные, необходимые для генерации файла. 
 * @param businessId Идентификатор кабинета.
 * @param orderIds Список идентификаторов заказов.
 */
case class GenerateMassOrderLabelsRequest(businessId: Long,
                orderIds: Set[Long]
                )

object GenerateMassOrderLabelsRequest {
    /**
     * Creates the codec for converting GenerateMassOrderLabelsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateMassOrderLabelsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateMassOrderLabelsRequest] = deriveEncoder
}
