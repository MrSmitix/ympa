package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.ModelOfferDTO
import org.openapitools.models.ModelPriceDTO
import scala.collection.immutable.Seq

/**
 * Модель товара.
 * @param id Идентификатор модели товара.
 * @param name Название модели товара.
 * @param prices 
 * @param offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
 * @param offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
 * @param onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
 */
case class EnrichedModelDTO(id: Option[Long],
                name: Option[String],
                prices: Option[ModelPriceDTO],
                offers: Option[Seq[ModelOfferDTO]],
                offlineOffers: Option[Int],
                onlineOffers: Option[Int]
                )

object EnrichedModelDTO {
    /**
     * Creates the codec for converting EnrichedModelDTO from and to JSON.
     */
    implicit val decoder: Decoder[EnrichedModelDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[EnrichedModelDTO] = deriveEncoder
}
