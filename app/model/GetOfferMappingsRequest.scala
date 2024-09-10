package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GetOfferMappingsRequest.
  * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
  * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  * @param categoryIds Фильтр по категориям на Маркете.
  * @param vendorNames Фильтр по брендам.
  * @param tags Фильтр по тегам.
  * @param archived Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOfferMappingsRequest(
  offerIds: Option[List[String]],
  cardStatuses: Option[List[OfferCardStatusType]],
  categoryIds: Option[List[Int]],
  vendorNames: Option[List[String]],
  tags: Option[List[String]],
  archived: Option[Boolean]
)

object GetOfferMappingsRequest {
  implicit lazy val getOfferMappingsRequestJsonFormat: Format[GetOfferMappingsRequest] = Json.format[GetOfferMappingsRequest]
}

