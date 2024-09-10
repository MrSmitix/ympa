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
import ympa_scala_cask_server.model.CurrencyType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class RegionalModelInfoDTO(
  currency: Option[CurrencyType] = None ,

  /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
  regionId: Option[Long] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : RegionalModelInfoDTOData = {
    RegionalModelInfoDTOData(
            currency = currency.getOrElse(null),
            regionId = regionId.getOrElse(0)
    )
  }

}

object RegionalModelInfoDTO{

    given RW[RegionalModelInfoDTO] = RegionalModelInfoDTOData.readWriter.bimap[RegionalModelInfoDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case currency extends Fields("currency")
            case regionId extends Fields("regionId")
    }


}

