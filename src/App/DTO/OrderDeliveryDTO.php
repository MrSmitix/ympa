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
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryType::class})
     * @var \App\DTO\OrderDeliveryType|null
     */
    public $type;

    /**
     * Наименование службы доставки.
     * @DTA\Data(field="serviceName", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $service_name;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $price;

    /**
     * @DTA\Data(field="deliveryPartnerType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryPartnerType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryPartnerType::class})
     * @var \App\DTO\OrderDeliveryPartnerType|null
     */
    public $delivery_partner_type;

    /**
     * @DTA\Data(field="courier", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderCourierDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderCourierDTO::class})
     * @var \App\DTO\OrderCourierDTO|null
     */
    public $courier;

    /**
     * @DTA\Data(field="dates", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDatesDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDatesDTO::class})
     * @var \App\DTO\OrderDeliveryDatesDTO|null
     */
    public $dates;

    /**
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     * @var \App\DTO\RegionDTO|null
     */
    public $region;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryAddressDTO::class})
     * @var \App\DTO\OrderDeliveryAddressDTO|null
     */
    public $address;

    /**
     * @DTA\Data(field="vat", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderVatType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderVatType::class})
     * @var \App\DTO\OrderVatType|null
     */
    public $vat;

    /**
     * Идентификатор службы доставки.
     * @DTA\Data(field="deliveryServiceId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $delivery_service_id;

    /**
     * @DTA\Data(field="liftType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderLiftType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderLiftType::class})
     * @var \App\DTO\OrderLiftType|null
     */
    public $lift_type;

    /**
     * Стоимость подъема на этаж.
     * @DTA\Data(field="liftPrice", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $lift_price;

    /**
     * Идентификатор пункта самовывоза, присвоенный магазином.
     * @DTA\Data(field="outletCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $outlet_code;

    /**
     * Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="outletStorageLimitDate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $outlet_storage_limit_date;

    /**
     * @DTA\Data(field="dispatchType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryDispatchType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryDispatchType::class})
     * @var \App\DTO\OrderDeliveryDispatchType|null
     */
    public $dispatch_type;

    /**
     * Информация для отслеживания перемещений посылки.
     * @DTA\Data(field="tracks", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection14::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection14::class})
     * @var \App\DTO\Collection14|null
     */
    public $tracks;

    /**
     * Информация о посылках.
     * @DTA\Data(field="shipments", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection17::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection17::class})
     * @var \App\DTO\Collection17|null
     */
    public $shipments;

    /**
     * Приблизительная ли дата доставки.
     * @DTA\Data(field="estimated", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $estimated;

    /**
     * @DTA\Data(field="eacType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderDeliveryEacType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderDeliveryEacType::class})
     * @var \App\DTO\OrderDeliveryEacType|null
     */
    public $eac_type;

    /**
     * Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).
     * @DTA\Data(field="eacCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $eac_code;

}
