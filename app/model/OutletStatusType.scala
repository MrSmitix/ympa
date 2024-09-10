package model

import play.api.libs.json._

/**
  * Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OutletStatusType(
)

object OutletStatusType {
  implicit lazy val outletStatusTypeJsonFormat: Format[OutletStatusType] = Json.format[OutletStatusType]
}

