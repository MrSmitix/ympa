package model

import play.api.libs.json._

/**
  * Решения по возвратам.
  * @param returnItemId Идентификатор товара в возврате.
  * @param count Количество единиц товара.
  * @param comment Комментарий.
  * @param refundAmount Сумма возврата.
  * @param partnerCompensation Компенсация за обратную доставку.
  * @param images Список хеш-кодов фотографий товара от покупателя.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ReturnDecisionDTO(
  returnItemId: Option[Long],
  count: Option[Int],
  comment: Option[String],
  reasonType: Option[ReturnDecisionReasonType],
  subreasonType: Option[ReturnDecisionSubreasonType],
  decisionType: Option[ReturnDecisionType],
  refundAmount: Option[Long],
  partnerCompensation: Option[Long],
  images: Option[List[String]]
)

object ReturnDecisionDTO {
  implicit lazy val returnDecisionDTOJsonFormat: Format[ReturnDecisionDTO] = Json.format[ReturnDecisionDTO]
}

