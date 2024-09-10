package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderItemInstanceDTO
import org.openapitools.models.OrderVatType
import scala.collection.immutable.Seq

/**
 * Информация о маркированном товаре.
 * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
 * @param vat 
 * @param count Количество единиц товара.
 * @param price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
 * @param offerName Название товара.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param instances Переданные вами коды маркировки.
 */
case class BriefOrderItemDTO(id: Option[Long],
                vat: Option[OrderVatType],
                count: Option[Int],
                price: Option[BigDecimal],
                offerName: Option[String],
                offerId: Option[String],
                instances: Option[Seq[OrderItemInstanceDTO]]
                )

object BriefOrderItemDTO {
    /**
     * Creates the codec for converting BriefOrderItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[BriefOrderItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[BriefOrderItemDTO] = deriveEncoder
}
