<?php
/**
 * SetOrderDeliveryTrackCodeRequest
 */
namespace app\Models;

/**
 * SetOrderDeliveryTrackCodeRequest
 */
class SetOrderDeliveryTrackCodeRequest {

    /** @var string $trackCode Трек‑номер посылки.*/
    public $trackCode = "";

    /** @var int $deliveryServiceId Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).*/
    public $deliveryServiceId = 0;

}
