package model

import play.api.libs.json._

/**
  * Параметры товара, для которого нужно рассчитать стоимость услуг.
  * @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  * @param price Цена на товар в рублях.
  * @param length Длина товара в сантиметрах.
  * @param width Ширина товара в сантиметрах.
  * @param height Высота товара в сантиметрах.
  * @param weight Вес товара в килограммах.
  * @param quantity Квант продажи — количество единиц товара в одном товарном предложении.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class CalculateTariffsOfferDTO(
  categoryId: Long,
  price: BigDecimal,
  length: BigDecimal,
  width: BigDecimal,
  height: BigDecimal,
  weight: BigDecimal,
  quantity: Option[Int]
)

object CalculateTariffsOfferDTO {
  implicit lazy val calculateTariffsOfferDTOJsonFormat: Format[CalculateTariffsOfferDTO] = Json.format[CalculateTariffsOfferDTO]
}

