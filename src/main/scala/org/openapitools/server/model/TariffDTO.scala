/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class TariffDTO(
  `type`: TariffType,

  /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  */
  percent: Option[Double],

  /* Значение тарифа в рублях. */
  amount: Double,

  /* Параметры расчета тарифа. */
  parameters: List[TariffParameterDTO]

 )
