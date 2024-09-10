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
     */
    public ?int $order_id = null;

    /**
     * Количество коробок в заказе.
     * @DTA\Data(field="placesNumber")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $places_number = null;

    /**
     * URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md).
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

    /**
     * Информация на ярлыке.
     * @DTA\Data(field="parcelBoxLabels")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $parcel_box_labels = null;

}
