<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Запрос для подтверждения отгрузки.
 */
class ConfirmShipmentRequest
{
    /**
     * Идентификатор отгрузки в системе поставщика.
     * @DTA\Data(field="externalShipmentId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $external_shipment_id;

}
