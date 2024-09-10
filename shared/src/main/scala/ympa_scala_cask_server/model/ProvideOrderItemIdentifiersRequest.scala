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
import ympa_scala_cask_server.model.OrderItemInstanceModificationDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ProvideOrderItemIdentifiersRequest(
/* Список позиций, требующих маркировки.  */
  items: Seq[OrderItemInstanceModificationDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : ProvideOrderItemIdentifiersRequestData = {
    ProvideOrderItemIdentifiersRequestData(
            items = items.map(_.asData)
    )
  }

}

object ProvideOrderItemIdentifiersRequest{

    given RW[ProvideOrderItemIdentifiersRequest] = ProvideOrderItemIdentifiersRequestData.readWriter.bimap[ProvideOrderItemIdentifiersRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case items extends Fields("items")
    }


}

