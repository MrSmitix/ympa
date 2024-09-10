<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о стоимости услуг.
 */
class OrdersStatsCommissionDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrdersStatsCommissionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrdersStatsCommissionType::class})
     * @var \App\DTO\OrdersStatsCommissionType|null
     */
    public $type;

    /**
     * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.
     * @DTA\Data(field="actual", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $actual;

}
