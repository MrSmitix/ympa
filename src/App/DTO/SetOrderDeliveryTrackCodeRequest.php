<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SetOrderDeliveryTrackCodeRequest
{
    /**
     * Трек‑номер посылки.
     * @DTA\Data(field="trackCode")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $track_code;

    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     * @DTA\Data(field="deliveryServiceId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $delivery_service_id;

}
