package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Планы по поставкам:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`. 
 */
case class OfferAvailabilityStatusType()

object OfferAvailabilityStatusType {
    /**
     * Creates the codec for converting OfferAvailabilityStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OfferAvailabilityStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferAvailabilityStatusType] = deriveEncoder
}
