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
import ympa_scala_cask_server.model.GetMappingDTO
import ympa_scala_cask_server.model.OfferCardRecommendationDTO
import ympa_scala_cask_server.model.OfferCardStatusType
import ympa_scala_cask_server.model.OfferErrorDTO
import ympa_scala_cask_server.model.ParameterValueDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class OfferCardDTO(
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
  offerId: String,

    mapping: Option[GetMappingDTO] = None ,

  /* Список характеристик с их значениями.  */
  parameterValues: Seq[ParameterValueDTO] = Nil ,

    cardStatus: Option[OfferCardStatusType] = None ,

  /* Процент заполненности карточки. */
  contentRating: Option[Int] = None ,

  /* Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  */
  recommendations: Seq[OfferCardRecommendationDTO] = Nil ,

  /* Ошибки в контенте, препятствующие размещению товара на витрине. */
  errors: Seq[OfferErrorDTO] = Nil ,

  /* Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. */
  warnings: Seq[OfferErrorDTO] = Nil 

  ) {

  def asJson: String = asData.asJson

  def asData : OfferCardDTOData = {
    OfferCardDTOData(
            offerId = offerId,
            mapping = mapping.map(_.asData).getOrElse(null),
            parameterValues = parameterValues.map(_.asData),
            cardStatus = cardStatus.getOrElse(null),
            contentRating = contentRating.getOrElse(0),
            recommendations = recommendations.map(_.asData),
            errors = errors.map(_.asData),
            warnings = warnings.map(_.asData)
    )
  }

}

object OfferCardDTO{

    given RW[OfferCardDTO] = OfferCardDTOData.readWriter.bimap[OfferCardDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case offerId extends Fields("offerId")
            case mapping extends Fields("mapping")
            case parameterValues extends Fields("parameterValues")
            case cardStatus extends Fields("cardStatus")
            case contentRating extends Fields("contentRating")
            case recommendations extends Fields("recommendations")
            case errors extends Fields("errors")
            case warnings extends Fields("warnings")
    }


}

