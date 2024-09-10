<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Модель для ответа API списка информации по заказам.
 */
class GetOrdersResponse
{
    /**
     * @DTA\Data(field="pager", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @var \App\DTO\FlippingPagerDTO|null
     */
    public $pager;

    /**
     * Модель заказа.
     * @DTA\Data(field="orders")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection21::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection21::class})
     * @var \App\DTO\Collection21|null
     */
    public $orders;

    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ForwardScrollingPagerDTO::class})
     * @var \App\DTO\ForwardScrollingPagerDTO|null
     */
    public $paging;

}
