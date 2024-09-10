package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChangeOutletRequest._

case class ChangeOutletRequest (
  /* Название точки продаж.  */
  name: String,
`type`: OutletType,
/* Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  */
  coords: Option[String],
/* Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  */
  isMain: Option[Boolean],
/* Идентификатор точки продаж, присвоенный магазином. */
  shopOutletCode: Option[String],
visibility: Option[OutletVisibilityType],
address: OutletAddressDTO,
/* Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  */
  phones: List[String],
workingSchedule: OutletWorkingScheduleDTO,
/* Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  */
  deliveryRules: Option[List[OutletDeliveryRuleDTO]],
/* Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. */
  storagePeriod: Option[Long])

object ChangeOutletRequest {
  import DateTimeCodecs._

  implicit val ChangeOutletRequestCodecJson: CodecJson[ChangeOutletRequest] = CodecJson.derive[ChangeOutletRequest]
  implicit val ChangeOutletRequestDecoder: EntityDecoder[ChangeOutletRequest] = jsonOf[ChangeOutletRequest]
  implicit val ChangeOutletRequestEncoder: EntityEncoder[ChangeOutletRequest] = jsonEncoderOf[ChangeOutletRequest]
}
