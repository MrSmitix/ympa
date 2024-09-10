package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import OrderStatusChangeDeliveryDatesDTO._

case class OrderStatusChangeDeliveryDatesDTO (
  /* **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}       */
  realDeliveryDate: Option[LocalDate])

object OrderStatusChangeDeliveryDatesDTO {
  import DateTimeCodecs._

  implicit val OrderStatusChangeDeliveryDatesDTOCodecJson: CodecJson[OrderStatusChangeDeliveryDatesDTO] = CodecJson.derive[OrderStatusChangeDeliveryDatesDTO]
  implicit val OrderStatusChangeDeliveryDatesDTODecoder: EntityDecoder[OrderStatusChangeDeliveryDatesDTO] = jsonOf[OrderStatusChangeDeliveryDatesDTO]
  implicit val OrderStatusChangeDeliveryDatesDTOEncoder: EntityEncoder[OrderStatusChangeDeliveryDatesDTO] = jsonEncoderOf[OrderStatusChangeDeliveryDatesDTO]
}
