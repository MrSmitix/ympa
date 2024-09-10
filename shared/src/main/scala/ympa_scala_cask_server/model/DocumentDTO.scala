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
import ympa_scala_cask_server.model.OrderDocumentStatusType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class DocumentDTO(
  status: Option[OrderDocumentStatusType] = None ,

  /* Номер документа. */
  number: Option[String] = None ,

  /* Дата создания документа. */
  date: Option[LocalDate] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : DocumentDTOData = {
    DocumentDTOData(
            status = status.getOrElse(null),
            number = number.getOrElse(""),
            date = date.getOrElse(null)
    )
  }

}

object DocumentDTO{

    given RW[DocumentDTO] = DocumentDTOData.readWriter.bimap[DocumentDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case status extends Fields("status")
            case number extends Fields("number")
            case date extends Fields("date")
    }


}

