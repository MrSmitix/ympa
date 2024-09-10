package model

import play.api.libs.json._
import java.time.LocalDate
import java.time.OffsetDateTime

/**
  * Информация о заказе.
  * @param id Идентификатор заказа.
  * @param creationDate Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  * @param statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
  * @param partnerOrderId Идентификатор заказа в информационной системе магазина.
  * @param fake Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  * @param items Список товаров в заказе после возможных изменений.
  * @param initialItems Список товаров в заказе до изменений.
  * @param payments Информация о денежных переводах по заказу.
  * @param commissions Информация о комиссиях за заказ.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsOrderDTO(
  id: Option[Long],
  creationDate: Option[LocalDate],
  statusUpdateDate: Option[OffsetDateTime],
  status: Option[OrderStatsStatusType],
  partnerOrderId: Option[String],
  paymentType: Option[OrdersStatsOrderPaymentType],
  fake: Option[Boolean],
  deliveryRegion: Option[OrdersStatsDeliveryRegionDTO],
  items: List[OrdersStatsItemDTO],
  initialItems: Option[List[OrdersStatsItemDTO]],
  payments: List[OrdersStatsPaymentDTO],
  commissions: List[OrdersStatsCommissionDTO]
)

object OrdersStatsOrderDTO {
  implicit lazy val ordersStatsOrderDTOJsonFormat: Format[OrdersStatsOrderDTO] = Json.format[OrdersStatsOrderDTO]
}

