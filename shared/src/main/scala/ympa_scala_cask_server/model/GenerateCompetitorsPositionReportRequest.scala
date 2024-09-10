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
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class GenerateCompetitorsPositionReportRequest(
/* Идентификатор бизнеса. */
  businessId: Long,

  /* Идентификатор категории. */
  categoryId: Long,

  /* Начало периода, включительно. */
  dateFrom: LocalDate,

  /* Конец периода, включительно. */
  dateTo: LocalDate

  ) {

  def asJson: String = asData.asJson

  def asData : GenerateCompetitorsPositionReportRequestData = {
    GenerateCompetitorsPositionReportRequestData(
            businessId = businessId,
            categoryId = categoryId,
            dateFrom = dateFrom,
            dateTo = dateTo
    )
  }

}

object GenerateCompetitorsPositionReportRequest{

    given RW[GenerateCompetitorsPositionReportRequest] = GenerateCompetitorsPositionReportRequestData.readWriter.bimap[GenerateCompetitorsPositionReportRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case businessId extends Fields("businessId")
            case categoryId extends Fields("categoryId")
            case dateFrom extends Fields("dateFrom")
            case dateTo extends Fields("dateTo")
    }


}

