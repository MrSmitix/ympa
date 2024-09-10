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
import ympa_scala_cask_server.model.UpdateOfferMappingDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class UpdateOfferMappingsRequest(
/* Перечень товаров, которые нужно добавить или обновить. */
  offerMappings: Seq[UpdateOfferMappingDTO],

  /* Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`.  */
  onlyPartnerMediaContent: Option[Boolean] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : UpdateOfferMappingsRequestData = {
    UpdateOfferMappingsRequestData(
            offerMappings = offerMappings.map(_.asData),
            onlyPartnerMediaContent = onlyPartnerMediaContent.getOrElse(false)
    )
  }

}

object UpdateOfferMappingsRequest{

    given RW[UpdateOfferMappingsRequest] = UpdateOfferMappingsRequestData.readWriter.bimap[UpdateOfferMappingsRequest](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case offerMappings extends Fields("offerMappings")
            case onlyPartnerMediaContent extends Fields("onlyPartnerMediaContent")
    }


}

