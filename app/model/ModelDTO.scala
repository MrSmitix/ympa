package model

import play.api.libs.json._

/**
  * Модель товара.
  * @param id Идентификатор модели товара.
  * @param name Название модели товара.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ModelDTO(
  id: Option[Long],
  name: Option[String],
  prices: Option[ModelPriceDTO]
)

object ModelDTO {
  implicit lazy val modelDTOJsonFormat: Format[ModelDTO] = Json.format[ModelDTO]
}

