package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuantumDTO._

case class QuantumDTO (
  /* Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать.  */
  minQuantity: Option[Integer],
/* На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту.  */
  stepQuantity: Option[Integer])

object QuantumDTO {
  import DateTimeCodecs._

  implicit val QuantumDTOCodecJson: CodecJson[QuantumDTO] = CodecJson.derive[QuantumDTO]
  implicit val QuantumDTODecoder: EntityDecoder[QuantumDTO] = jsonOf[QuantumDTO]
  implicit val QuantumDTOEncoder: EntityEncoder[QuantumDTO] = jsonEncoderOf[QuantumDTO]
}
