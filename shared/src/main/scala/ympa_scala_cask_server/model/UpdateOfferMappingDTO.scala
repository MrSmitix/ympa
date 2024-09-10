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
import ympa_scala_cask_server.model.UpdateMappingDTO
import ympa_scala_cask_server.model.UpdateOfferDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class UpdateOfferMappingDTO(
  offer: UpdateOfferDTO,

    mapping: Option[UpdateMappingDTO] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : UpdateOfferMappingDTOData = {
    UpdateOfferMappingDTOData(
            offer = offer,
            mapping = mapping.map(_.asData).getOrElse(null)
    )
  }

}

object UpdateOfferMappingDTO{

    given RW[UpdateOfferMappingDTO] = UpdateOfferMappingDTOData.readWriter.bimap[UpdateOfferMappingDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case offer extends Fields("offer")
            case mapping extends Fields("mapping")
    }


}

