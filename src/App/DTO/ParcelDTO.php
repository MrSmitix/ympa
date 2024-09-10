<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о грузовых местах в заказе.
 */
class ParcelDTO
{
    /**
     * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
     * @DTA\Data(field="boxes")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $boxes = null;

}
