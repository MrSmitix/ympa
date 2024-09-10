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
     */
    public ?int $id = null;

    /**
     * Идентификатор грузового места в информационной системе магазина.
     * @DTA\Data(field="fulfilmentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $fulfilment_id = null;

}
