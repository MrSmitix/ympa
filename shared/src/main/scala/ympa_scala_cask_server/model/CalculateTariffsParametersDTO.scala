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
import ympa_scala_cask_server.model.PaymentFrequencyType
import ympa_scala_cask_server.model.SellingProgramType
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class CalculateTariffsParametersDTO(
/* Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке.  */
  campaignId: Option[Long] = None ,

    sellingProgram: Option[SellingProgramType] = None ,

    frequency: Option[PaymentFrequencyType] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : CalculateTariffsParametersDTOData = {
    CalculateTariffsParametersDTOData(
            campaignId = campaignId.getOrElse(0),
            sellingProgram = sellingProgram.getOrElse(null),
            frequency = frequency.getOrElse(null)
    )
  }

}

object CalculateTariffsParametersDTO{

    given RW[CalculateTariffsParametersDTO] = CalculateTariffsParametersDTOData.readWriter.bimap[CalculateTariffsParametersDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case campaignId extends Fields("campaignId")
            case sellingProgram extends Fields("sellingProgram")
            case frequency extends Fields("frequency")
    }


}

