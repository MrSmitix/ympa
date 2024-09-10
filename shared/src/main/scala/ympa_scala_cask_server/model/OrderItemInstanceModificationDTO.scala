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
import ympa_scala_cask_server.model.BriefOrderItemInstanceDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class OrderItemInstanceModificationDTO(
/* Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  */
  id: Long,

  /* Список кодов маркировки единиц товара.  */
  instances: Seq[BriefOrderItemInstanceDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : OrderItemInstanceModificationDTOData = {
    OrderItemInstanceModificationDTOData(
            id = id,
            instances = instances.map(_.asData)
    )
  }

}

object OrderItemInstanceModificationDTO{

    given RW[OrderItemInstanceModificationDTO] = OrderItemInstanceModificationDTOData.readWriter.bimap[OrderItemInstanceModificationDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case instances extends Fields("instances")
    }


}

