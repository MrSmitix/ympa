package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OutletAddressDTO._

case class OutletAddressDTO (
  /* Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  */
  regionId: Long,
/* Улица. */
  street: Option[String],
/* Номер дома. */
  number: Option[String],
/* Номер строения. */
  building: Option[String],
/* Номер владения. */
  estate: Option[String],
/* Номер корпуса. */
  block: Option[String],
/* Дополнительная информация. */
  additional: Option[String],
/* Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. */
  km: Option[Integer],
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  */
  city: Option[String])

object OutletAddressDTO {
  import DateTimeCodecs._

  implicit val OutletAddressDTOCodecJson: CodecJson[OutletAddressDTO] = CodecJson.derive[OutletAddressDTO]
  implicit val OutletAddressDTODecoder: EntityDecoder[OutletAddressDTO] = jsonOf[OutletAddressDTO]
  implicit val OutletAddressDTOEncoder: EntityEncoder[OutletAddressDTO] = jsonEncoderOf[OutletAddressDTO]
}
