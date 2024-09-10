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
import ympa_scala_cask_server.model.ApiResponseStatusType
import ympa_scala_cask_server.model.ShipmentBoxesDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class SetOrderShipmentBoxesResponse(
  status: Option[ApiResponseStatusType] = None ,

    result: Option[ShipmentBoxesDTO] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : SetOrderShipmentBoxesResponseData = {
    SetOrderShipmentBoxesResponseData(
            status = status.getOrElse(null),
            result = result.map(_.asData).getOrElse(null)
    )
  }

}

object SetOrderShipmentBoxesResponse{

    given RW[SetOrderShipmentBoxesResponse] = SetOrderShipmentBoxesResponseData.readWriter.bimap[SetOrderShipmentBoxesResponse](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case status extends Fields("status")
            case result extends Fields("result")
    }


}

