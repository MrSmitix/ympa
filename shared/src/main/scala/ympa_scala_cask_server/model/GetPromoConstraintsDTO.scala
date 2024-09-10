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

case class GetPromoConstraintsDTO(
/* Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  */
  warehouseIds: Seq[Long] = Nil 

  ) {

  def asJson: String = asData.asJson

  def asData : GetPromoConstraintsDTOData = {
    GetPromoConstraintsDTOData(
            warehouseIds = warehouseIds
    )
  }

}

object GetPromoConstraintsDTO{

    given RW[GetPromoConstraintsDTO] = GetPromoConstraintsDTOData.readWriter.bimap[GetPromoConstraintsDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case warehouseIds extends Fields("warehouseIds")
    }


}

