package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessSettingsDTO._

case class BusinessSettingsDTO (
  /* Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену.  */
  onlyDefaultPrice: Option[Boolean],
currency: Option[CurrencyType])

object BusinessSettingsDTO {
  import DateTimeCodecs._

  implicit val BusinessSettingsDTOCodecJson: CodecJson[BusinessSettingsDTO] = CodecJson.derive[BusinessSettingsDTO]
  implicit val BusinessSettingsDTODecoder: EntityDecoder[BusinessSettingsDTO] = jsonOf[BusinessSettingsDTO]
  implicit val BusinessSettingsDTOEncoder: EntityEncoder[BusinessSettingsDTO] = jsonEncoderOf[BusinessSettingsDTO]
}
