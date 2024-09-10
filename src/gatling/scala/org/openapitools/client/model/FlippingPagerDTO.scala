
package org.openapitools.client.model


case class FlippingPagerDTO (
    /* Сколько всего найдено элементов. */
    _total: Option[Integer],
    /* Начальный номер найденного элемента на странице. */
    _from: Option[Integer],
    /* Конечный номер найденного элемента на странице. */
    _to: Option[Integer],
    /* Текущая страница. */
    _currentPage: Option[Integer],
    /* Общее количество страниц. */
    _pagesCount: Option[Integer],
    /* Размер страницы. */
    _pageSize: Option[Integer]
)
object FlippingPagerDTO {
    def toStringBody(var_total: Object, var_from: Object, var_to: Object, var_currentPage: Object, var_pagesCount: Object, var_pageSize: Object) =
        s"""
        | {
        | "total":$var_total,"from":$var_from,"to":$var_to,"currentPage":$var_currentPage,"pagesCount":$var_pagesCount,"pageSize":$var_pageSize
        | }
        """.stripMargin
}
