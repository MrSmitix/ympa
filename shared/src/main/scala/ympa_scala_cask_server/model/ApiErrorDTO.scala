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
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ApiErrorDTO(
/* Код ошибки. */
  code: String,

  /* Описание ошибки. */
  message: Option[String] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : ApiErrorDTOData = {
    ApiErrorDTOData(
            code = code,
            message = message.getOrElse("")
    )
  }

}

object ApiErrorDTO{

    given RW[ApiErrorDTO] = ApiErrorDTOData.readWriter.bimap[ApiErrorDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case code extends Fields("code")
            case message extends Fields("message")
    }


}

