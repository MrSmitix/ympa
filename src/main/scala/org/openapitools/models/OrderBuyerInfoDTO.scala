package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderBuyerType

/**
 * Информация о покупателе и его номере телефона.
 * @param id Идентификатор покупателя.
 * @param lastName Фамилия покупателя.
 * @param firstName Имя покупателя.
 * @param middleName Отчество покупателя.
 * @param _type 
 * @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
 */
case class OrderBuyerInfoDTO(id: Option[String],
                lastName: Option[String],
                firstName: Option[String],
                middleName: Option[String],
                _type: Option[OrderBuyerType],
                phone: Option[String]
                )

object OrderBuyerInfoDTO {
    /**
     * Creates the codec for converting OrderBuyerInfoDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderBuyerInfoDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderBuyerInfoDTO] = deriveEncoder
}
