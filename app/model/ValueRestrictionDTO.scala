package model

import play.api.libs.json._

/**
  * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. 
  * @param limitingParameterId Идентификатор ограничивающей характеристики.
  * @param limitedValues Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ValueRestrictionDTO(
  limitingParameterId: Long,
  limitedValues: List[OptionValuesLimitedDTO]
)

object ValueRestrictionDTO {
  implicit lazy val valueRestrictionDTOJsonFormat: Format[ValueRestrictionDTO] = Json.format[ValueRestrictionDTO]
}

