/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import java.math.BigDecimal
import org.openapitools.client.core.ApiModel

case class FeedbackGradesDTO (
  /* Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). */
  average: Option[BigDecimal] = None,
  /* Количество пользователей, считающих отзыв полезным. */
  agreeCount: Option[Long] = None,
  /* Количество пользователей, считающих отзыв бесполезным. */
  rejectCount: Option[Long] = None,
  /* Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  */
  factors: Seq[FeedbackFactorDTO]
) extends ApiModel

