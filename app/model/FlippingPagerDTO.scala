package model

import play.api.libs.json._

/**
  * Модель для пагинации.
  * @param total Сколько всего найдено элементов.
  * @param from Начальный номер найденного элемента на странице.
  * @param to Конечный номер найденного элемента на странице.
  * @param currentPage Текущая страница.
  * @param pagesCount Общее количество страниц.
  * @param pageSize Размер страницы.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class FlippingPagerDTO(
  total: Option[Int],
  from: Option[Int],
  to: Option[Int],
  currentPage: Option[Int],
  pagesCount: Option[Int],
  pageSize: Option[Int]
)

object FlippingPagerDTO {
  implicit lazy val flippingPagerDTOJsonFormat: Format[FlippingPagerDTO] = Json.format[FlippingPagerDTO]
}

