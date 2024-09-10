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

case class SetOrderDeliveryTrackCodeRequest(
/* Трек‑номер посылки. */
  trackCode: String,

  /* Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). */
  deliveryServiceId: Long

  ) {

  def asJson: String = asData.asJson

  def asData : SetOrderDeliveryTrackCodeRequestData = {
    SetOrderDeliveryTrackCodeRequestData(
            trackCode = trackCode,
            deliveryServiceId = deliveryServiceId
    )
  }

}

object SetOrderDeliveryTrackCodeRequest{

    given RW[SetOrderDeliveryTrackCodeRequest] = SetOrderDeliveryTrackCodeRequestData.readWriter.bimap[SetOrderDeliveryTrackCodeRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case trackCode extends Fields("trackCode")
            case deliveryServiceId extends Fields("deliveryServiceId")
    }


}

