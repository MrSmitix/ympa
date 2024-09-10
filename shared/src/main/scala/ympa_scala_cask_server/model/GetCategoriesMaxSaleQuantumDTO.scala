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
import ympa_scala_cask_server.model.CategoryErrorDTO
import ympa_scala_cask_server.model.MaxSaleQuantumDTO
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class GetCategoriesMaxSaleQuantumDTO(
/* Категории и лимит на установку кванта и минимального количества товаров. */
  results: Seq[MaxSaleQuantumDTO],

  /* Ошибки, которые появились из-за переданных категорий. */
  errors: Seq[CategoryErrorDTO] = Nil 

  ) {

  def asJson: String = asData.asJson

  def asData : GetCategoriesMaxSaleQuantumDTOData = {
    GetCategoriesMaxSaleQuantumDTOData(
            results = results.map(_.asData),
            errors = errors.map(_.asData)
    )
  }

}

object GetCategoriesMaxSaleQuantumDTO{

    given RW[GetCategoriesMaxSaleQuantumDTO] = GetCategoriesMaxSaleQuantumDTOData.readWriter.bimap[GetCategoriesMaxSaleQuantumDTO](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case results extends Fields("results")
            case errors extends Fields("errors")
    }


}

