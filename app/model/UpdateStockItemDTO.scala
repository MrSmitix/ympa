package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Информация об остатках товара. 
  * @param count Количество доступного товара. 
  * @param updatedAt Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class UpdateStockItemDTO(
  count: Long,
  updatedAt: Option[OffsetDateTime]
)

object UpdateStockItemDTO {
  implicit lazy val updateStockItemDTOJsonFormat: Format[UpdateStockItemDTO] = Json.format[UpdateStockItemDTO]
}

