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
import scala.math.BigDecimal
import ympa_scala_cask_server.model.OrdersStatsPriceType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class OrdersStatsPriceDTO(
  `type`: Option[OrdersStatsPriceType] = None ,

  /* Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
  costPerItem: Option[BigDecimal] = None ,

  /* Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  */
  total: Option[BigDecimal] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : OrdersStatsPriceDTOData = {
    OrdersStatsPriceDTOData(
            `type` = `type`.getOrElse(null),
            costPerItem = costPerItem.getOrElse(0),
            total = total.getOrElse(0)
    )
  }

}

object OrdersStatsPriceDTO{

    given RW[OrdersStatsPriceDTO] = OrdersStatsPriceDTOData.readWriter.bimap[OrdersStatsPriceDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case `type` extends Fields("`type`")
            case costPerItem extends Fields("costPerItem")
            case total extends Fields("total")
    }


}

