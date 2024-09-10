package model

import play.api.libs.json._

/**
  * Информация о складе.
  * @param id Идентификатор склада.
  * @param name Название склада.
  * @param campaignId Идентификатор кампании в API и идентификатор магазина.
  * @param express Возможна ли доставка по модели Экспресс.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class WarehouseDTO(
  id: Long,
  name: String,
  campaignId: Long,
  express: Boolean,
  address: Option[WarehouseAddressDTO]
)

object WarehouseDTO {
  implicit lazy val warehouseDTOJsonFormat: Format[WarehouseDTO] = Json.format[WarehouseDTO]
}

