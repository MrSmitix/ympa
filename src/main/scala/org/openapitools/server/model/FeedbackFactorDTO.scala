package org.openapitools.server.model


/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 *
 * @param id Идентификатор параметра. for example: ''null''
 * @param title Название параметра. Например, `Скорость обработки заказа`. for example: ''null''
 * @param description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. for example: ''null''
 * @param value Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  for example: ''null''
*/
final case class FeedbackFactorDTO (
  id: Option[Long] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  value: Option[Int] = None
)

