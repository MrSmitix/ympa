/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using model.mustache
package ympa_scala_cask_server.model
import java.time.LocalDate
import ympa_scala_cask_server.model.OrderStatsStatusType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class GetOrdersStatsRequest(
/* Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  */
  dateFrom: Option[LocalDate] = None ,

  /* Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  */
  dateTo: Option[LocalDate] = None ,

  /* Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  */
  updateFrom: Option[LocalDate] = None ,

  /* Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  */
  updateTo: Option[LocalDate] = None ,

  /* Список идентификаторов заказов. */
  orders: Seq[Long] = Nil ,

  /* Список статусов заказов. */
  statuses: Seq[OrderStatsStatusType] = Nil ,

  /* Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  */
  hasCis: Option[Boolean] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : GetOrdersStatsRequestData = {
    GetOrdersStatsRequestData(
            dateFrom = dateFrom.getOrElse(null),
            dateTo = dateTo.getOrElse(null),
            updateFrom = updateFrom.getOrElse(null),
            updateTo = updateTo.getOrElse(null),
            orders = orders,
            statuses = statuses,
            hasCis = hasCis.getOrElse(false)
    )
  }

}

object GetOrdersStatsRequest{

    given RW[GetOrdersStatsRequest] = GetOrdersStatsRequestData.readWriter.bimap[GetOrdersStatsRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case dateFrom extends Fields("dateFrom")
            case dateTo extends Fields("dateTo")
            case updateFrom extends Fields("updateFrom")
            case updateTo extends Fields("updateTo")
            case orders extends Fields("orders")
            case statuses extends Fields("statuses")
            case hasCis extends Fields("hasCis")
    }


}

