<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания.
 */
class ShipmentBoxesDTO
{
    /**
     * Список грузовых мест. Маркет определил количество мест по длине этого списка.
     * @DTA\Data(field="boxes")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ParcelBoxDTO[]|null
     */
    public $boxes;

}
