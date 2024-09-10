package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OrderDigitalItemDTO
import scala.collection.immutable.Seq

/**
 * Запрос на передачу ключей цифровых товаров.
 * @param items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
 */
case class ProvideOrderDigitalCodesRequest(items: Seq[OrderDigitalItemDTO]
                )

object ProvideOrderDigitalCodesRequest {
    /**
     * Creates the codec for converting ProvideOrderDigitalCodesRequest from and to JSON.
     */
    implicit val decoder: Decoder[ProvideOrderDigitalCodesRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProvideOrderDigitalCodesRequest] = deriveEncoder
}
