<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о грузоместе.
 */
class OrderParcelBoxDTO
{
    /**
     * Идентификатор грузоместа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Идентификатор грузового места в информационной системе магазина.
     * @DTA\Data(field="fulfilmentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $fulfilment_id;

}
