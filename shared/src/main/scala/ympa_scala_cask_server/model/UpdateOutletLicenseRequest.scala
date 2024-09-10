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
import ympa_scala_cask_server.model.OutletLicenseDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class UpdateOutletLicenseRequest(
/* Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии.  */
  licenses: Seq[OutletLicenseDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : UpdateOutletLicenseRequestData = {
    UpdateOutletLicenseRequestData(
            licenses = licenses.map(_.asData)
    )
  }

}

object UpdateOutletLicenseRequest{

    given RW[UpdateOutletLicenseRequest] = UpdateOutletLicenseRequestData.readWriter.bimap[UpdateOutletLicenseRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case licenses extends Fields("licenses")
    }


}

