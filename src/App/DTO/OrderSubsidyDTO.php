<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа.
 */
class OrderSubsidyDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderSubsidyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderSubsidyType::class})
     */
    public ?\App\DTO\OrderSubsidyType $type = null;

    /**
     * Сумма субсидии.
     * @DTA\Data(field="amount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $amount = null;

}
