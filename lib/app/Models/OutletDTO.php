<?php
/**
 * OutletDTO
 */
namespace app\Models;

/**
 * OutletDTO
 * @description Информация о точке продаж.
 */
class OutletDTO {

    /** @var string $name Название точки продаж.*/
    public $name = "";

    /** @var string $type */
    public $type = "";

    /** @var string $coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.*/
    public $coords = "";

    /** @var bool $isMain Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.*/
    public $isMain = false;

    /** @var string $shopOutletCode Идентификатор точки продаж, присвоенный магазином.*/
    public $shopOutletCode = "";

    /** @var string $visibility */
    public $visibility = "";

    /** @var \app\Models\OutletAddressDTO $address */
    public $address;

    /** @var string[] $phones Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.*/
    public $phones = [];

    /** @var \app\Models\OutletWorkingScheduleDTO $workingSchedule */
    public $workingSchedule;

    /** @var \app\Models\OutletDeliveryRuleDTO[]|null $deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.*/
    public $deliveryRules = null;

    /** @var int $storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.*/
    public $storagePeriod = 0;

}
