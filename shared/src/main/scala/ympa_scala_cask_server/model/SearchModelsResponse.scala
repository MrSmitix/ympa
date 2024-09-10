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
import ympa_scala_cask_server.model.FlippingPagerDTO
import ympa_scala_cask_server.model.ModelDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class SearchModelsResponse(
/* Список моделей товаров. */
  models: Seq[ModelDTO],

    currency: Option[CurrencyType] = None ,

  /* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
  regionId: Option[Long] = None ,

    pager: Option[FlippingPagerDTO] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : SearchModelsResponseData = {
    SearchModelsResponseData(
            models = models.map(_.asData),
            currency = currency.getOrElse(null),
            regionId = regionId.getOrElse(0),
            pager = pager.map(_.asData).getOrElse(null)
    )
  }

}

object SearchModelsResponse{

    given RW[SearchModelsResponse] = SearchModelsResponseData.readWriter.bimap[SearchModelsResponse](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case models extends Fields("models")
            case currency extends Fields("currency")
            case regionId extends Fields("regionId")
            case pager extends Fields("pager")
    }


}

