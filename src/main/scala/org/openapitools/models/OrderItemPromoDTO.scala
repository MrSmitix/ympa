package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderPromoType

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 * @param _type 
 * @param discount Размер пользовательской скидки в валюте покупателя. 
 * @param subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
 * @param shopPromoId Идентификатор акции поставщика. 
 * @param marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
 */
case class OrderItemPromoDTO(_type: OrderPromoType,
                discount: Option[BigDecimal],
                subsidy: Option[BigDecimal],
                shopPromoId: Option[String],
                marketPromoId: Option[String]
                )

object OrderItemPromoDTO {
    /**
     * Creates the codec for converting OrderItemPromoDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemPromoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemPromoDTO] = deriveEncoder
}
