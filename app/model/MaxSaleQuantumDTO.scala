package model

import play.api.libs.json._

/**
  * Лимит на установку кванта и минимального количества товаров по категориям. 
  * @param id Идентификатор категории.
  * @param name Название категории.
  * @param maxSaleQuantum Лимит на установку кванта и минимального количества товаров.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class MaxSaleQuantumDTO(
  id: Long,
  name: Option[String],
  maxSaleQuantum: Option[Int]
)

object MaxSaleQuantumDTO {
  implicit lazy val maxSaleQuantumDTOJsonFormat: Format[MaxSaleQuantumDTO] = Json.format[MaxSaleQuantumDTO]
}

