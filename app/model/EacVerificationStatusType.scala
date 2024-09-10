package model

import play.api.libs.json._

/**
  * Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class EacVerificationStatusType(
)

object EacVerificationStatusType {
  implicit lazy val eacVerificationStatusTypeJsonFormat: Format[EacVerificationStatusType] = Json.format[EacVerificationStatusType]
}

