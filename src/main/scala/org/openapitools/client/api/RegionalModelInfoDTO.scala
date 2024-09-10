package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegionalModelInfoDTO._

case class RegionalModelInfoDTO (
  currency: Option[CurrencyType],
/* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
  regionId: Option[Long])

object RegionalModelInfoDTO {
  import DateTimeCodecs._

  implicit val RegionalModelInfoDTOCodecJson: CodecJson[RegionalModelInfoDTO] = CodecJson.derive[RegionalModelInfoDTO]
  implicit val RegionalModelInfoDTODecoder: EntityDecoder[RegionalModelInfoDTO] = jsonOf[RegionalModelInfoDTO]
  implicit val RegionalModelInfoDTOEncoder: EntityEncoder[RegionalModelInfoDTO] = jsonEncoderOf[RegionalModelInfoDTO]
}
