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
import ympa_scala_cask_server.model.WarehouseStockDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class GoodsStatsWarehouseDTO(
/* Идентификатор склада. */
  id: Option[Long] = None ,

  /* Название склада. */
  name: Option[String] = None ,

  /* Информация об остатках товаров на складе. */
  stocks: Seq[WarehouseStockDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : GoodsStatsWarehouseDTOData = {
    GoodsStatsWarehouseDTOData(
            id = id.getOrElse(0),
            name = name.getOrElse(""),
            stocks = stocks.map(_.asData)
    )
  }

}

object GoodsStatsWarehouseDTO{

    given RW[GoodsStatsWarehouseDTO] = GoodsStatsWarehouseDTOData.readWriter.bimap[GoodsStatsWarehouseDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case name extends Fields("name")
            case stocks extends Fields("stocks")
    }


}

