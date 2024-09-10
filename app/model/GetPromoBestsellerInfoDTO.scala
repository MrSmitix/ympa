package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация об акции «Бестселлеры Маркета».
  * @param bestseller Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
  * @param entryDeadline До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetPromoBestsellerInfoDTO(
  bestseller: Boolean,
  entryDeadline: Option[OffsetDateTime]
)

object GetPromoBestsellerInfoDTO {
  implicit lazy val getPromoBestsellerInfoDTOJsonFormat: Format[GetPromoBestsellerInfoDTO] = Json.format[GetPromoBestsellerInfoDTO]
}

