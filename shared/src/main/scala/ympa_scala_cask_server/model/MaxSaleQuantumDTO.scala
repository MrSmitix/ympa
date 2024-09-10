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

case class MaxSaleQuantumDTO(
/* Идентификатор категории. */
  id: Long,

  /* Название категории. */
  name: Option[String] = None ,

  /* Лимит на установку кванта и минимального количества товаров. */
  maxSaleQuantum: Option[Int] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : MaxSaleQuantumDTOData = {
    MaxSaleQuantumDTOData(
            id = id,
            name = name.getOrElse(""),
            maxSaleQuantum = maxSaleQuantum.getOrElse(0)
    )
  }

}

object MaxSaleQuantumDTO{

    given RW[MaxSaleQuantumDTO] = MaxSaleQuantumDTOData.readWriter.bimap[MaxSaleQuantumDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case name extends Fields("name")
            case maxSaleQuantum extends Fields("maxSaleQuantum")
    }


}

