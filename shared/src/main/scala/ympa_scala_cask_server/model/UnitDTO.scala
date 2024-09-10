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

case class UnitDTO(
/* Идентификатор единицы измерения. */
  id: Long,

  /* Сокращенное название единицы измерения. */
  name: String,

  /* Полное название единицы измерения. */
  fullName: String

  ) {

  def asJson: String = asData.asJson

  def asData : UnitDTOData = {
    UnitDTOData(
            id = id,
            name = name,
            fullName = fullName
    )
  }

}

object UnitDTO{

    given RW[UnitDTO] = UnitDTOData.readWriter.bimap[UnitDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case name extends Fields("name")
            case fullName extends Fields("fullName")
    }


}

