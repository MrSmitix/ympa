package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GetPriceWithDiscountDTO
import org.openapitools.models.GetPriceWithVatDTO
import org.openapitools.models.OfferCampaignStatusType
import org.openapitools.models.OfferErrorDTO
import org.openapitools.models.QuantumDTO
import scala.collection.immutable.Seq

/**
 * Параметры размещения товара в магазине.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param quantum 
 * @param available Есть ли товар в продаже. 
 * @param basicPrice 
 * @param campaignPrice 
 * @param status 
 * @param errors Ошибки, препятствующие размещению товара на витрине. 
 * @param warnings Предупреждения, не препятствующие размещению товара на витрине. 
 */
case class GetCampaignOfferDTO(offerId: String,
                quantum: Option[QuantumDTO],
                available: Option[Boolean],
                basicPrice: Option[GetPriceWithDiscountDTO],
                campaignPrice: Option[GetPriceWithVatDTO],
                status: Option[OfferCampaignStatusType],
                errors: Option[Seq[OfferErrorDTO]],
                warnings: Option[Seq[OfferErrorDTO]]
                )

object GetCampaignOfferDTO {
    /**
     * Creates the codec for converting GetCampaignOfferDTO from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignOfferDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignOfferDTO] = deriveEncoder
}
