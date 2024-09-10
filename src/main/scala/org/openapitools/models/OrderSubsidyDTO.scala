package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderSubsidyType

/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 * @param _type 
 * @param amount Сумма субсидии.
 */
case class OrderSubsidyDTO(_type: Option[OrderSubsidyType],
                amount: Option[BigDecimal]
                )

object OrderSubsidyDTO {
    /**
     * Creates the codec for converting OrderSubsidyDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderSubsidyDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderSubsidyDTO] = deriveEncoder
}
