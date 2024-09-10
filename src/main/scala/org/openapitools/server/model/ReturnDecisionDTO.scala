package org.openapitools.server.model


/**
 * Решения по возвратам.
 *
 * @param returnItemId Идентификатор товара в возврате. for example: ''null''
 * @param count Количество единиц товара. for example: ''null''
 * @param comment Комментарий. for example: ''null''
 * @param reasonType  for example: ''null''
 * @param subreasonType  for example: ''null''
 * @param decisionType  for example: ''null''
 * @param refundAmount Сумма возврата. for example: ''null''
 * @param partnerCompensation Компенсация за обратную доставку. for example: ''null''
 * @param images Список хеш-кодов фотографий товара от покупателя. for example: ''null''
*/
final case class ReturnDecisionDTO (
  returnItemId: Option[Long] = None,
  count: Option[Int] = None,
  comment: Option[String] = None,
  reasonType: Option[ReturnDecisionReasonType] = None,
  subreasonType: Option[ReturnDecisionSubreasonType] = None,
  decisionType: Option[ReturnDecisionType] = None,
  refundAmount: Option[Long] = None,
  partnerCompensation: Option[Long] = None,
  images: Option[Seq[String]] = None
)

