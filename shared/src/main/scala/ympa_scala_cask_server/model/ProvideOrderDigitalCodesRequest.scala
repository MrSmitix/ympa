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
import ympa_scala_cask_server.model.OrderDigitalItemDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ProvideOrderDigitalCodesRequest(
/* Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же.  */
  items: Seq[OrderDigitalItemDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : ProvideOrderDigitalCodesRequestData = {
    ProvideOrderDigitalCodesRequestData(
            items = items.map(_.asData)
    )
  }

}

object ProvideOrderDigitalCodesRequest{

    given RW[ProvideOrderDigitalCodesRequest] = ProvideOrderDigitalCodesRequestData.readWriter.bimap[ProvideOrderDigitalCodesRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case items extends Fields("items")
    }


}

