<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос на передачу количества упаковок в отгрузке.
 */
class SetShipmentPalletsCountRequest
{
    /**
     * Количество упаковок в отгрузке.
     * @DTA\Data(field="placesCount")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @var int|null
     */
    public $places_count;

}
