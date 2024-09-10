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
import ympa_scala_cask_server.model.CalculateTariffsOfferDTO
import ympa_scala_cask_server.model.CalculatedTariffDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class CalculateTariffsOfferInfoDTO(
  offer: CalculateTariffsOfferDTO,

  /* Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  */
  tariffs: Seq[CalculatedTariffDTO]

  ) {

  def asJson: String = asData.asJson

  def asData : CalculateTariffsOfferInfoDTOData = {
    CalculateTariffsOfferInfoDTOData(
            offer = offer,
            tariffs = tariffs.map(_.asData)
    )
  }

}

object CalculateTariffsOfferInfoDTO{

    given RW[CalculateTariffsOfferInfoDTO] = CalculateTariffsOfferInfoDTOData.readWriter.bimap[CalculateTariffsOfferInfoDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case offer extends Fields("offer")
            case tariffs extends Fields("tariffs")
    }


}

