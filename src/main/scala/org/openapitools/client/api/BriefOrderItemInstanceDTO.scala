package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BriefOrderItemInstanceDTO._

case class BriefOrderItemInstanceDTO (
  /* Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %}  */
  cis: Option[String],
/* Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.  */
  uin: Option[String],
/* Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  */
  rnpt: Option[String],
/* Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  */
  gtd: Option[String])

object BriefOrderItemInstanceDTO {
  import DateTimeCodecs._

  implicit val BriefOrderItemInstanceDTOCodecJson: CodecJson[BriefOrderItemInstanceDTO] = CodecJson.derive[BriefOrderItemInstanceDTO]
  implicit val BriefOrderItemInstanceDTODecoder: EntityDecoder[BriefOrderItemInstanceDTO] = jsonOf[BriefOrderItemInstanceDTO]
  implicit val BriefOrderItemInstanceDTOEncoder: EntityEncoder[BriefOrderItemInstanceDTO] = jsonEncoderOf[BriefOrderItemInstanceDTO]
}
