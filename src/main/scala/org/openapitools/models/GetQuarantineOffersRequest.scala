package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferCardStatusType
import scala.collection.immutable.Seq

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 * @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @param categoryIds Фильтр по категориям на Маркете.
 * @param vendorNames Фильтр по брендам.
 * @param tags Фильтр по тегам.
 */
case class GetQuarantineOffersRequest(offerIds: Option[Seq[String]],
                cardStatuses: Option[Seq[OfferCardStatusType]],
                categoryIds: Option[Seq[Int]],
                vendorNames: Option[Seq[String]],
                tags: Option[Seq[String]]
                )

object GetQuarantineOffersRequest {
    /**
     * Creates the codec for converting GetQuarantineOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetQuarantineOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetQuarantineOffersRequest] = deriveEncoder
}
