package model

import play.api.libs.json._

/**
  * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
  * @param limitingOptionValueId Идентификатор значения ограничивающей характеристики.
  * @param optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OptionValuesLimitedDTO(
  limitingOptionValueId: Long,
  optionValueIds: List[Long]
)

object OptionValuesLimitedDTO {
  implicit lazy val optionValuesLimitedDTOJsonFormat: Format[OptionValuesLimitedDTO] = Json.format[OptionValuesLimitedDTO]
}

