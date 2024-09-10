package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.PromoOfferUpdateWarningCodeType
import scala.collection.immutable.Seq

/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 * @param code 
 * @param campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
 */
case class PromoOfferUpdateWarningDTO(code: PromoOfferUpdateWarningCodeType,
                campaignIds: Option[Seq[Long]]
                )

object PromoOfferUpdateWarningDTO {
    /**
     * Creates the codec for converting PromoOfferUpdateWarningDTO from and to JSON.
     */
    implicit val decoder: Decoder[PromoOfferUpdateWarningDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[PromoOfferUpdateWarningDTO] = deriveEncoder
}
