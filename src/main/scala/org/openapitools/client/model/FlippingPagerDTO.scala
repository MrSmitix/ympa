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

import org.openapitools.client.core.ApiModel

case class FlippingPagerDTO (
  /* Сколько всего найдено элементов. */
  total: Option[Int] = None,
  /* Начальный номер найденного элемента на странице. */
  from: Option[Int] = None,
  /* Конечный номер найденного элемента на странице. */
  to: Option[Int] = None,
  /* Текущая страница. */
  currentPage: Option[Int] = None,
  /* Общее количество страниц. */
  pagesCount: Option[Int] = None,
  /* Размер страницы. */
  pageSize: Option[Int] = None
) extends ApiModel

