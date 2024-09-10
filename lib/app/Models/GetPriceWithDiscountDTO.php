<?php
/**
 * GetPriceWithDiscountDTO
 */
namespace app\Models;

/**
 * GetPriceWithDiscountDTO
 * @description Цена с указанием скидки и времени последнего обновления.
 */
class GetPriceWithDiscountDTO {

    /** @var float $value Значение.*/
    public $value = 0;

    /** @var string $currencyId */
    public $currencyId = "";

    /** @var float $discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.*/
    public $discountBase = 0;

    /** @var \DateTime $updatedAt Время последнего обновления.*/
    public $updatedAt;

}
