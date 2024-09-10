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
import ympa_scala_cask_server.model.PriceQuarantineVerdictParameterDTO
import ympa_scala_cask_server.model.PriceQuarantineVerdictType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class PriceQuarantineVerdictDTO(
  `type`: Option[PriceQuarantineVerdictType] = None ,

  /* Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина. */
  params: Seq[PriceQuarantineVerdictParameterDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : PriceQuarantineVerdictDTOData = {
    PriceQuarantineVerdictDTOData(
            `type` = `type`.getOrElse(null),
            params = params.map(_.asData)
    )
  }

}

object PriceQuarantineVerdictDTO{

    given RW[PriceQuarantineVerdictDTO] = PriceQuarantineVerdictDTOData.readWriter.bimap[PriceQuarantineVerdictDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case `type` extends Fields("`type`")
            case params extends Fields("params")
    }


}

