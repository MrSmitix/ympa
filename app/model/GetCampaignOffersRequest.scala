package model

import play.api.libs.json._

/**
  * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
  * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  * @param statuses Фильтр по статусам товаров. 
  * @param categoryIds Фильтр по категориям на Маркете.
  * @param vendorNames Фильтр по брендам.
  * @param tags Фильтр по тегам.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetCampaignOffersRequest(
  offerIds: Option[List[String]],
  statuses: Option[List[OfferCampaignStatusType]],
  categoryIds: Option[List[Int]],
  vendorNames: Option[List[String]],
  tags: Option[List[String]]
)

object GetCampaignOffersRequest {
  implicit lazy val getCampaignOffersRequestJsonFormat: Format[GetCampaignOffersRequest] = Json.format[GetCampaignOffersRequest]
}

