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
import ympa_scala_cask_server.model.ApiErrorDTO
import ympa_scala_cask_server.model.ApiResponseStatusType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ApiNotFoundErrorResponse(
  status: Option[ApiResponseStatusType] = None ,

  /* Список ошибок. */
  errors: Seq[ApiErrorDTO] = Nil 

  ) {

  def asJson: String = asData.asJson

  def asData : ApiNotFoundErrorResponseData = {
    ApiNotFoundErrorResponseData(
            status = status.getOrElse(null),
            errors = errors.map(_.asData)
    )
  }

}

object ApiNotFoundErrorResponse{

    given RW[ApiNotFoundErrorResponse] = ApiNotFoundErrorResponseData.readWriter.bimap[ApiNotFoundErrorResponse](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case status extends Fields("status")
            case errors extends Fields("errors")
    }


}

