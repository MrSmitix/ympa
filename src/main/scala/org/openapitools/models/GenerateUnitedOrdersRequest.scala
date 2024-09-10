package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import scala.collection.immutable.Seq

/**
 * Данные, необходимые для генерации отчета. 
 * @param businessId Идентификатор бизнеса.
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно. Максимальный период — 1 год.
 * @param campaignIds Список магазинов, которые нужны в отчете.
 * @param promoId Идентификатор акции, товары из которой нужны в отчете.
 */
case class GenerateUnitedOrdersRequest(businessId: Long,
                dateFrom: LocalDateTime,
                dateTo: LocalDateTime,
                campaignIds: Option[Seq[Long]],
                promoId: Option[String]
                )

object GenerateUnitedOrdersRequest {
    /**
     * Creates the codec for converting GenerateUnitedOrdersRequest from and to JSON.
     */
    implicit val decoder: Decoder[GenerateUnitedOrdersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerateUnitedOrdersRequest] = deriveEncoder
}
