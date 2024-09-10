package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
 * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
 * @param cisFull Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
 * @param uin УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
 * @param rnpt Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
 * @param gtd Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
 */
case class OrderItemInstanceDTO(cis: Option[String],
                cisFull: Option[String],
                uin: Option[String],
                rnpt: Option[String],
                gtd: Option[String]
                )

object OrderItemInstanceDTO {
    /**
     * Creates the codec for converting OrderItemInstanceDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemInstanceDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemInstanceDTO] = deriveEncoder
}
