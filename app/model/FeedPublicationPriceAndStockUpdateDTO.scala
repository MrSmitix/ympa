package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. 
  * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  * @param publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FeedPublicationPriceAndStockUpdateDTO(
  fileTime: Option[OffsetDateTime],
  publishedTime: Option[OffsetDateTime]
)

object FeedPublicationPriceAndStockUpdateDTO {
  implicit lazy val feedPublicationPriceAndStockUpdateDTOJsonFormat: Format[FeedPublicationPriceAndStockUpdateDTO] = Json.format[FeedPublicationPriceAndStockUpdateDTO]
}

