<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Цена или скидки на товар.
 */
class OrdersStatsPriceDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsPriceType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsPriceType::class})
     */
    public ?\App\DTO\OrdersStatsPriceType $type = null;

    /**
     * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.
     * @DTA\Data(field="costPerItem", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $cost_per_item = null;

    /**
     * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.
     * @DTA\Data(field="total", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $total = null;

}
