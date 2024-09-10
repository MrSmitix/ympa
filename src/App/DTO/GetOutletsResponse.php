<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос информации о точках продаж.
 */
class GetOutletsResponse
{
    /**
     * Информация о точках продаж.
     * @DTA\Data(field="outlets")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection88::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection88::class})
     * @var \App\DTO\Collection88|null
     */
    public $outlets;

    /**
     * @DTA\Data(field="paging", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ScrollingPagerDTO::class})
     * @var \App\DTO\ScrollingPagerDTO|null
     */
    public $paging;

    /**
     * @DTA\Data(field="pager", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @var \App\DTO\FlippingPagerDTO|null
     */
    public $pager;

}
