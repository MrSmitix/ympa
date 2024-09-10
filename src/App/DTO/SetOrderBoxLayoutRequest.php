<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SetOrderBoxLayoutRequest
{
    /**
     * Список коробок.
     * @DTA\Data(field="boxes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection30::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection30::class})
     * @var \App\DTO\Collection30|null
     */
    public $boxes;

    /**
     * Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.
     * @DTA\Data(field="allowRemove", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $allow_remove;

}
