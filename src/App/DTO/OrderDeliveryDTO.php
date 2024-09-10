<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о доставке.
 */
class OrderDeliveryDTO
{
    /**
     * Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryType::class})
     */
    public ?\App\DTO\OrderDeliveryType $type = null;

    /**
     * Наименование службы доставки.
     * @DTA\Data(field="serviceName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $service_name = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $price = null;

    /**
     * @DTA\Data(field="deliveryPartnerType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryPartnerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryPartnerType::class})
     */
    public ?\App\DTO\OrderDeliveryPartnerType $delivery_partner_type = null;

    /**
     * @DTA\Data(field="courier", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderCourierDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderCourierDTO::class})
     */
    public ?\App\DTO\OrderCourierDTO $courier = null;

    /**
     * @DTA\Data(field="dates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDatesDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDatesDTO::class})
     */
    public ?\App\DTO\OrderDeliveryDatesDTO $dates = null;

    /**
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     */
    public ?\App\DTO\RegionDTO $region = null;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryAddressDTO::class})
     */
    public ?\App\DTO\OrderDeliveryAddressDTO $address = null;

    /**
     * @DTA\Data(field="vat", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderVatType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderVatType::class})
     */
    public ?\App\DTO\OrderVatType $vat = null;

    /**
     * Идентификатор службы доставки.
     * @DTA\Data(field="deliveryServiceId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $delivery_service_id = null;

    /**
     * @DTA\Data(field="liftType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLiftType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLiftType::class})
     */
    public ?\App\DTO\OrderLiftType $lift_type = null;

    /**
     * Стоимость подъема на этаж.
     * @DTA\Data(field="liftPrice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $lift_price = null;

    /**
     * Идентификатор пункта самовывоза, присвоенный магазином.
     * @DTA\Data(field="outletCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $outlet_code = null;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="outletStorageLimitDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $outlet_storage_limit_date = null;

    /**
     * @DTA\Data(field="dispatchType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDispatchType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDispatchType::class})
     */
    public ?\App\DTO\OrderDeliveryDispatchType $dispatch_type = null;

    /**
     * Информация для отслеживания перемещений посылки.
     * @DTA\Data(field="tracks", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection14::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection14::class})
     */
    public ?\App\DTO\Collection14 $tracks = null;

    /**
     * Информация о посылках.
     * @DTA\Data(field="shipments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     */
    public ?\App\DTO\Collection17 $shipments = null;

    /**
     * Приблизительная ли дата доставки.
     * @DTA\Data(field="estimated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $estimated = null;

    /**
     * @DTA\Data(field="eacType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryEacType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryEacType::class})
     */
    public ?\App\DTO\OrderDeliveryEacType $eac_type = null;

    /**
     * Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).
     * @DTA\Data(field="eacCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $eac_code = null;

}
