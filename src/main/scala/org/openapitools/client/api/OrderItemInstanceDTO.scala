package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemInstanceDTO._

case class OrderItemInstanceDTO (
  /* Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста. */
  cis: Option[String],
/* Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом. */
  cisFull: Option[String],
/* УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.  */
  uin: Option[String],
/* Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  */
  rnpt: Option[String],
/* Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  */
  gtd: Option[String])

object OrderItemInstanceDTO {
  import DateTimeCodecs._

  implicit val OrderItemInstanceDTOCodecJson: CodecJson[OrderItemInstanceDTO] = CodecJson.derive[OrderItemInstanceDTO]
  implicit val OrderItemInstanceDTODecoder: EntityDecoder[OrderItemInstanceDTO] = jsonOf[OrderItemInstanceDTO]
  implicit val OrderItemInstanceDTOEncoder: EntityEncoder[OrderItemInstanceDTO] = jsonEncoderOf[OrderItemInstanceDTO]
}
