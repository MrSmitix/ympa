package model

import play.api.libs.json._

/**
  * Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ParameterType(
)

object ParameterType {
  implicit lazy val parameterTypeJsonFormat: Format[ParameterType] = Json.format[ParameterType]
}

