package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderItemSubsidyType

/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 * @param _type 
 * @param amount Сумма субсидии.
 */
case class OrderItemSubsidyDTO(_type: Option[OrderItemSubsidyType],
                amount: Option[BigDecimal]
                )

object OrderItemSubsidyDTO {
    /**
     * Creates the codec for converting OrderItemSubsidyDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemSubsidyDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemSubsidyDTO] = deriveEncoder
}
