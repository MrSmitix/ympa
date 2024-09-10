<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные для печати ярлыка.
 */
class OrderLabelDTO
{
    /**
     * Идентификатор заказа.
     * @DTA\Data(field="orderId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $order_id;

    /**
     * Количество коробок в заказе.
     * @DTA\Data(field="placesNumber")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $places_number;

    /**
     * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * Информация на ярлыке.
     * @DTA\Data(field="parcelBoxLabels")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ParcelBoxLabelDTO[]|null
     */
    public $parcel_box_labels;

}
