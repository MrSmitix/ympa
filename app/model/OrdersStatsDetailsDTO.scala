package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Информация об удалении товара из заказа.
  * @param itemCount Количество товара со статусом, указанном в параметре `itemStatus`.
  * @param updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OrdersStatsDetailsDTO(
  itemStatus: Option[OrdersStatsItemStatusType],
  itemCount: Option[Long],
  updateDate: Option[LocalDate],
  stockType: Option[OrdersStatsStockType]
)

object OrdersStatsDetailsDTO {
  implicit lazy val ordersStatsDetailsDTOJsonFormat: Format[OrdersStatsDetailsDTO] = Json.format[OrdersStatsDetailsDTO]
}

