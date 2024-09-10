package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderItemDetailDTO
import org.openapitools.models.OrderItemInstanceDTO
import org.openapitools.models.OrderItemInstanceType
import org.openapitools.models.OrderItemPromoDTO
import org.openapitools.models.OrderItemSubsidyDTO
import org.openapitools.models.OrderVatType
import scala.collection.immutable.Seq

/**
 * Список товаров в заказе.
 * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param offerName Название товара.
 * @param price Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
 * @param buyerPrice Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
 * @param buyerPriceBeforeDiscount Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
 * @param priceBeforeDiscount {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
 * @param count Количество единиц товара.
 * @param vat 
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param subsidy {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
 * @param partnerWarehouseId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
 * @param promos Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 * @param instances Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
 * @param details Информация об удалении товара из заказа. 
 * @param subsidies Список субсидий по типам.
 * @param requiredInstanceTypes Список необходимых маркировок товара.
 */
case class OrderItemDTO(id: Option[Long],
                offerId: Option[String],
                offerName: Option[String],
                price: Option[BigDecimal],
                buyerPrice: Option[BigDecimal],
                buyerPriceBeforeDiscount: Option[BigDecimal],
                priceBeforeDiscount: Option[BigDecimal],
                count: Option[Int],
                vat: Option[OrderVatType],
                shopSku: Option[String],
                subsidy: Option[BigDecimal],
                partnerWarehouseId: Option[String],
                promos: Option[Seq[OrderItemPromoDTO]],
                instances: Option[Seq[OrderItemInstanceDTO]],
                details: Option[Seq[OrderItemDetailDTO]],
                subsidies: Option[Seq[OrderItemSubsidyDTO]],
                requiredInstanceTypes: Option[Seq[OrderItemInstanceType]]
                )

object OrderItemDTO {
    /**
     * Creates the codec for converting OrderItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrderItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderItemDTO] = deriveEncoder
}
