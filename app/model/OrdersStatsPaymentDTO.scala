package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Информация о денежных переводах по заказу.
  * @param id Идентификатор денежного перевода.
  * @param date Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
  * @param total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsPaymentDTO(
  id: Option[String],
  date: Option[LocalDate],
  `type`: Option[OrdersStatsPaymentType],
  source: Option[OrdersStatsPaymentSourceType],
  total: Option[BigDecimal],
  paymentOrder: Option[OrdersStatsPaymentOrderDTO]
)

object OrdersStatsPaymentDTO {
  implicit lazy val ordersStatsPaymentDTOJsonFormat: Format[OrdersStatsPaymentDTO] = Json.format[OrdersStatsPaymentDTO]
}

