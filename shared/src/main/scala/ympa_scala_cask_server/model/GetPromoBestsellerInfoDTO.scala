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
import java.time.OffsetDateTime
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class GetPromoBestsellerInfoDTO(
/* Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). */
  bestseller: Boolean,

  /* До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  */
  entryDeadline: Option[OffsetDateTime] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : GetPromoBestsellerInfoDTOData = {
    GetPromoBestsellerInfoDTOData(
            bestseller = bestseller,
            entryDeadline = entryDeadline.getOrElse(null)
    )
  }

}

object GetPromoBestsellerInfoDTO{

    given RW[GetPromoBestsellerInfoDTO] = GetPromoBestsellerInfoDTOData.readWriter.bimap[GetPromoBestsellerInfoDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case bestseller extends Fields("bestseller")
            case entryDeadline extends Fields("entryDeadline")
    }


}

