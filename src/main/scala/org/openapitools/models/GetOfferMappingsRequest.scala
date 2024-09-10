package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferCardStatusType
import scala.collection.immutable.Seq

/**
 * 
 * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @param categoryIds Фильтр по категориям на Маркете.
 * @param vendorNames Фильтр по брендам.
 * @param tags Фильтр по тегам.
 * @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
 */
case class GetOfferMappingsRequest(offerIds: Option[Seq[String]],
                cardStatuses: Option[Seq[OfferCardStatusType]],
                categoryIds: Option[Seq[Int]],
                vendorNames: Option[Seq[String]],
                tags: Option[Seq[String]],
                archived: Option[Boolean]
                )

object GetOfferMappingsRequest {
    /**
     * Creates the codec for converting GetOfferMappingsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferMappingsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferMappingsRequest] = deriveEncoder
}
