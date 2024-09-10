package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._

/**
 * Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 */
case class OfferProcessingStatusType()

object OfferProcessingStatusType {
    /**
     * Creates the codec for converting OfferProcessingStatusType from and to JSON.
     */
    implicit val decoder: Decoder[OfferProcessingStatusType] = deriveDecoder
    implicit val encoder: ObjectEncoder[OfferProcessingStatusType] = deriveEncoder
}
