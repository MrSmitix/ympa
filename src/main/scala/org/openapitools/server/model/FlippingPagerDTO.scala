package org.openapitools.server.model


/**
 * Модель для пагинации.
 *
 * @param total Сколько всего найдено элементов. for example: ''null''
 * @param from Начальный номер найденного элемента на странице. for example: ''null''
 * @param to Конечный номер найденного элемента на странице. for example: ''null''
 * @param currentPage Текущая страница. for example: ''null''
 * @param pagesCount Общее количество страниц. for example: ''null''
 * @param pageSize Размер страницы. for example: ''null''
*/
final case class FlippingPagerDTO (
  total: Option[Int] = None,
  from: Option[Int] = None,
  to: Option[Int] = None,
  currentPage: Option[Int] = None,
  pagesCount: Option[Int] = None,
  pageSize: Option[Int] = None
)

