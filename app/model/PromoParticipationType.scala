package model

import play.api.libs.json._

/**
  * Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class PromoParticipationType(
)

object PromoParticipationType {
  implicit lazy val promoParticipationTypeJsonFormat: Format[PromoParticipationType] = Json.format[PromoParticipationType]
}

