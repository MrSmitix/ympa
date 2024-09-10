<?php
/**
 * OrderDeliveryDTO
 */
namespace app\Models;

/**
 * OrderDeliveryDTO
 * @description Информация о доставке.
 */
class OrderDeliveryDTO {

    /** @var string $id Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md).*/
    public $id = "";

    /** @var string $type */
    public $type = "";

    /** @var string $serviceName Наименование службы доставки.*/
    public $serviceName = "";

    /** @var float $price {% note warning \&quot;\&quot; %}  Этот параметр устарел. Стоимость доставки смотрите в параметре &#x60;deliveryTotal&#x60;.  {% endnote %}  Стоимость доставки в валюте заказа.*/
    /** @deprecated */
    public $price = 0;

    /** @var string $deliveryPartnerType */
    public $deliveryPartnerType = "";

    /** @var \app\Models\OrderCourierDTO $courier */
    public $courier;

    /** @var \app\Models\OrderDeliveryDatesDTO $dates */
    public $dates;

    /** @var \app\Models\RegionDTO $region */
    public $region;

    /** @var \app\Models\OrderDeliveryAddressDTO $address */
    public $address;

    /** @var string $vat */
    public $vat = "";

    /** @var int $deliveryServiceId Идентификатор службы доставки.*/
    public $deliveryServiceId = 0;

    /** @var string $liftType */
    public $liftType = "";

    /** @var float $liftPrice Стоимость подъема на этаж.*/
    public $liftPrice = 0;

    /** @var string $outletCode Идентификатор пункта самовывоза, присвоенный магазином.*/
    public $outletCode = "";

    /** @var string $outletStorageLimitDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $outletStorageLimitDate = "";

    /** @var string $dispatchType */
    public $dispatchType = "";

    /** @var \app\Models\OrderTrackDTO[]|null $tracks Информация для отслеживания перемещений посылки.*/
    public $tracks = null;

    /** @var \app\Models\OrderShipmentDTO[]|null $shipments Информация о посылках.*/
    public $shipments = null;

    /** @var bool $estimated Приблизительная ли дата доставки.*/
    public $estimated = false;

    /** @var string $eacType */
    public $eacType = "";

    /** @var string $eacCode Код подтверждения ЭАПП (для типа &#x60;MERCHANT_TO_COURIER&#x60;).*/
    public $eacCode = "";

}
