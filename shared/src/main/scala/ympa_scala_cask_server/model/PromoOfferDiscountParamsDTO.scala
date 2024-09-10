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

case class PromoOfferDiscountParamsDTO(
/* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
  price: Option[Long] = None ,

  /* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  */
  promoPrice: Option[Long] = None ,

  /* Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  */
  maxPromoPrice: Long

  ) {

  def asJson: String = asData.asJson

  def asData : PromoOfferDiscountParamsDTOData = {
    PromoOfferDiscountParamsDTOData(
            price = price.getOrElse(0),
            promoPrice = promoPrice.getOrElse(0),
            maxPromoPrice = maxPromoPrice
    )
  }

}

object PromoOfferDiscountParamsDTO{

    given RW[PromoOfferDiscountParamsDTO] = PromoOfferDiscountParamsDTOData.readWriter.bimap[PromoOfferDiscountParamsDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case price extends Fields("price")
            case promoPrice extends Fields("promoPrice")
            case maxPromoPrice extends Fields("maxPromoPrice")
    }


}

