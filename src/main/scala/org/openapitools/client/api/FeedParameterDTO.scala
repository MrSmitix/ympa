package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeedParameterDTO._

case class FeedParameterDTO (
  /* Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`.  */
  deleted: Option[Boolean],
/* Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  */
  name: String,
/* Значения параметра.  Используется вместе с параметром `name`.  */
  values: Option[List[Integer]])

object FeedParameterDTO {
  import DateTimeCodecs._

  implicit val FeedParameterDTOCodecJson: CodecJson[FeedParameterDTO] = CodecJson.derive[FeedParameterDTO]
  implicit val FeedParameterDTODecoder: EntityDecoder[FeedParameterDTO] = jsonOf[FeedParameterDTO]
  implicit val FeedParameterDTOEncoder: EntityEncoder[FeedParameterDTO] = jsonEncoderOf[FeedParameterDTO]
}
