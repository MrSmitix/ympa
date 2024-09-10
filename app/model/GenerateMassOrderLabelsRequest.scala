package model

import play.api.libs.json._
import scala.collection.immutable.Set

/**
  * Данные, необходимые для генерации файла. 
  * @param businessId Идентификатор кабинета.
  * @param orderIds Список идентификаторов заказов.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GenerateMassOrderLabelsRequest(
  businessId: Long,
  orderIds: Set[Long]
)

object GenerateMassOrderLabelsRequest {
  implicit lazy val generateMassOrderLabelsRequestJsonFormat: Format[GenerateMassOrderLabelsRequest] = Json.format[GenerateMassOrderLabelsRequest]
}

