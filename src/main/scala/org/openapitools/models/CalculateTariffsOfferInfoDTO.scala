package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.CalculateTariffsOfferDTO
import org.openapitools.models.CalculatedTariffDTO
import scala.collection.immutable.Seq

/**
 * Стоимость услуг.
 * @param offer 
 * @param tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
 */
case class CalculateTariffsOfferInfoDTO(offer: CalculateTariffsOfferDTO,
                tariffs: Seq[CalculatedTariffDTO]
                )

object CalculateTariffsOfferInfoDTO {
    /**
     * Creates the codec for converting CalculateTariffsOfferInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[CalculateTariffsOfferInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[CalculateTariffsOfferInfoDTO] = deriveEncoder
}
