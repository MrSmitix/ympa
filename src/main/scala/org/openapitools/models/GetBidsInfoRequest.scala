package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import scala.collection.immutable.Seq

/**
 * description.
 * @param skus Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
 */
case class GetBidsInfoRequest(skus: Option[Seq[String]]
                )

object GetBidsInfoRequest {
    /**
     * Creates the codec for converting GetBidsInfoRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetBidsInfoRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBidsInfoRequest] = deriveEncoder
}
