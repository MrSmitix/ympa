<?php
/**
 * OrderLabelDTO
 */
namespace app\Models;

/**
 * OrderLabelDTO
 * @description Данные для печати ярлыка.
 */
class OrderLabelDTO {

    /** @var int $orderId Идентификатор заказа.*/
    public $orderId = 0;

    /** @var int $placesNumber Количество коробок в заказе.*/
    public $placesNumber = 0;

    /** @var string $url URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).*/
    public $url = "";

    /** @var \app\Models\ParcelBoxLabelDTO[] $parcelBoxLabels Информация на ярлыке.*/
    public $parcelBoxLabels = [];

}
