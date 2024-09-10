<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GetOrderResponse
{
    /**
     * @DTA\Data(field="order", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDTO::class})
     */
    public ?\App\DTO\OrderDTO $order = null;

}
