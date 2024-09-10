package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrdersStatsDetailsDTO
import org.openapitools.models.OrdersStatsPriceDTO
import org.openapitools.models.OrdersStatsWarehouseDTO
import scala.collection.immutable.Seq

/**
 * Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). 
 * @param offerName Название товара.
 * @param marketSku SKU на Маркете.
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param count Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
 * @param prices Цена или скидки на товар.
 * @param warehouse 
 * @param details Информация об удалении товара из заказа.
 * @param cisList Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
 * @param initialCount Первоначальное количество единиц товара.
 * @param bidFee Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
 * @param cofinanceThreshold Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
 * @param cofinanceValue Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
 */
case class OrdersStatsItemDTO(offerName: Option[String],
                marketSku: Option[Long],
                shopSku: Option[String],
                count: Option[Int],
                prices: Option[Seq[OrdersStatsPriceDTO]],
                warehouse: Option[OrdersStatsWarehouseDTO],
                details: Option[Seq[OrdersStatsDetailsDTO]],
                cisList: Option[Seq[String]],
                initialCount: Option[Int],
                bidFee: Option[Int],
                cofinanceThreshold: Option[BigDecimal],
                cofinanceValue: Option[BigDecimal]
                )

object OrdersStatsItemDTO {
    /**
     * Creates the codec for converting OrdersStatsItemDTO from and to JSON.
     */
    implicit val decoder: Decoder[OrdersStatsItemDTO] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrdersStatsItemDTO] = deriveEncoder
}
