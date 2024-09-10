<?php
/**
 * CalculateTariffsOfferDTO
 */
namespace app\Models;

/**
 * CalculateTariffsOfferDTO
 * @description Параметры товара, для которого нужно рассчитать стоимость услуг.
 */
class CalculateTariffsOfferDTO {

    /** @var int $categoryId Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).*/
    public $categoryId = 0;

    /** @var float $price Цена на товар в рублях.*/
    public $price = 0;

    /** @var float $length Длина товара в сантиметрах.*/
    public $length = 0;

    /** @var float $width Ширина товара в сантиметрах.*/
    public $width = 0;

    /** @var float $height Высота товара в сантиметрах.*/
    public $height = 0;

    /** @var float $weight Вес товара в килограммах.*/
    public $weight = 0;

    /** @var int $quantity Квант продажи — количество единиц товара в одном товарном предложении.*/
    public $quantity = 1;

}
