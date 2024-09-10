package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CurrencyType
import org.openapitools.models.OrderBuyerDTO
import org.openapitools.models.OrderDeliveryDTO
import org.openapitools.models.OrderItemDTO
import org.openapitools.models.OrderPaymentMethodType
import org.openapitools.models.OrderPaymentType
import org.openapitools.models.OrderStatusType
import org.openapitools.models.OrderSubsidyDTO
import org.openapitools.models.OrderSubstatusType
import org.openapitools.models.OrderTaxSystemType
import scala.collection.immutable.Seq

/**
 * Заказ.
 * @param id Идентификатор заказа.
 * @param status 
 * @param substatus 
 * @param creationDate 
 * @param updatedAt 
 * @param currency 
 * @param itemsTotal Платеж покупателя. 
 * @param deliveryTotal Стоимость доставки. 
 * @param buyerItemsTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
 * @param buyerTotal {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
 * @param buyerItemsTotalBeforeDiscount Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @param buyerTotalBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
 * @param paymentType 
 * @param paymentMethod 
 * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
 * @param items Список товаров в заказе.
 * @param subsidies Список субсидий по типам.
 * @param delivery 
 * @param buyer 
 * @param notes Комментарий к заказу.
 * @param taxSystem 
 * @param cancelRequested **Только для модели DBS**  Запрошена ли отмена. 
 * @param expiryDate 
 */
case class OrderDTO(id: Option[Long],
                status: Option[OrderStatusType],
                substatus: Option[OrderSubstatusType],
                creationDate: Option[String],
                updatedAt: Option[String],
                currency: Option[CurrencyType],
                itemsTotal: Option[BigDecimal],
                deliveryTotal: Option[BigDecimal],
                buyerItemsTotal: Option[BigDecimal],
                buyerTotal: Option[BigDecimal],
                buyerItemsTotalBeforeDiscount: Option[BigDecimal],
                buyerTotalBeforeDiscount: Option[BigDecimal],
                paymentType: Option[OrderPaymentType],
                paymentMethod: Option[OrderPaymentMethodType],
                fake: Option[Boolean],
                items: Seq[OrderItemDTO],
                subsidies: Option[Seq[OrderSubsidyDTO]],
                delivery: Option[OrderDeliveryDTO],
                buyer: Option[OrderBuyerDTO],
                notes: Option[String],
                taxSystem: Option[OrderTaxSystemType],
                cancelRequested: Option[Boolean],
                expiryDate: Option[String]
                )

object OrderDTO {
    /**
     * Creates the codec for converting OrderDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderDTO] = deriveEncoder
}
