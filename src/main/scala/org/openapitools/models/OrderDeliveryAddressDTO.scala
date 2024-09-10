package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.GpsDTO

/**
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 * @param country Страна.  Обязательный параметр. 
 * @param postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
 * @param city Город или населенный пункт.  Обязательный параметр. 
 * @param district Район.
 * @param subway Станция метро.
 * @param street Улица.  Обязательный параметр. 
 * @param house Дом или владение.  Обязательный параметр. 
 * @param block Корпус или строение.
 * @param entrance Подъезд.
 * @param entryphone Код домофона.
 * @param floor Этаж.
 * @param apartment Квартира или офис.
 * @param phone Телефон получателя заказа.  Обязательный параметр. 
 * @param recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
 * @param gps 
 */
case class OrderDeliveryAddressDTO(country: Option[String],
                postcode: Option[String],
                city: Option[String],
                district: Option[String],
                subway: Option[String],
                street: Option[String],
                house: Option[String],
                block: Option[String],
                entrance: Option[String],
                entryphone: Option[String],
                floor: Option[String],
                apartment: Option[String],
                phone: Option[String],
                recipient: Option[String],
                gps: Option[GpsDTO]
                )

object OrderDeliveryAddressDTO {
    /**
     * Creates the codec for converting OrderDeliveryAddressDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderDeliveryAddressDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDeliveryAddressDTO] = deriveEncoder
}
