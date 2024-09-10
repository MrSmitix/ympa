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
import ympa_scala_cask_server.model.FlippingPagerDTO
import ympa_scala_cask_server.model.RegionDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class GetRegionWithChildrenResponse(
  pager: Option[FlippingPagerDTO] = None ,

    regions: Option[RegionDTO] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : GetRegionWithChildrenResponseData = {
    GetRegionWithChildrenResponseData(
            pager = pager.map(_.asData).getOrElse(null),
            regions = regions.map(_.asData).getOrElse(null)
    )
  }

}

object GetRegionWithChildrenResponse{

    given RW[GetRegionWithChildrenResponse] = GetRegionWithChildrenResponseData.readWriter.bimap[GetRegionWithChildrenResponse](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case pager extends Fields("pager")
            case regions extends Fields("regions")
    }


}

