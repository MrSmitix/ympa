package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferCampaignStatusType
import scala.collection.immutable.Seq

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
 * @param statuses Фильтр по статусам товаров. 
 * @param categoryIds Фильтр по категориям на Маркете.
 * @param vendorNames Фильтр по брендам.
 * @param tags Фильтр по тегам.
 */
case class GetCampaignOffersRequest(offerIds: Option[Seq[String]],
                statuses: Option[Seq[OfferCampaignStatusType]],
                categoryIds: Option[Seq[Int]],
                vendorNames: Option[Seq[String]],
                tags: Option[Seq[String]]
                )

object GetCampaignOffersRequest {
    /**
     * Creates the codec for converting GetCampaignOffersRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetCampaignOffersRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetCampaignOffersRequest] = deriveEncoder
}
