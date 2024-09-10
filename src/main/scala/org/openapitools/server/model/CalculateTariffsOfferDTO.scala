package org.openapitools.server.model


/**
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 *
 * @param categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  for example: ''null''
 * @param price Цена на товар в рублях. for example: ''null''
 * @param length Длина товара в сантиметрах. for example: ''null''
 * @param width Ширина товара в сантиметрах. for example: ''null''
 * @param height Высота товара в сантиметрах. for example: ''null''
 * @param weight Вес товара в килограммах. for example: ''null''
 * @param quantity Квант продажи — количество единиц товара в одном товарном предложении. for example: ''null''
*/
final case class CalculateTariffsOfferDTO (
  categoryId: Long,
  price: Double,
  length: Double,
  width: Double,
  height: Double,
  weight: Double,
  quantity: Option[Int] = None
)

