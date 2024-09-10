<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о точке продаж.
 */
class OutletDTO
{
    /**
     * Название точки продаж.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OutletType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OutletType::class})
     */
    public ?\App\DTO\OutletType $type = null;

    /**
     * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.
     * @DTA\Data(field="coords", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $coords = null;

    /**
     * Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.
     * @DTA\Data(field="isMain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_main = null;

    /**
     * Идентификатор точки продаж, присвоенный магазином.
     * @DTA\Data(field="shopOutletCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shop_outlet_code = null;

    /**
     * @DTA\Data(field="visibility", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OutletVisibilityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OutletVisibilityType::class})
     */
    public ?\App\DTO\OutletVisibilityType $visibility = null;

    /**
     * @DTA\Data(field="address")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OutletAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OutletAddressDTO::class})
     */
    public ?\App\DTO\OutletAddressDTO $address = null;

    /**
     * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.
     * @DTA\Data(field="phones")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $phones = null;

    /**
     * @DTA\Data(field="workingSchedule")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OutletWorkingScheduleDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OutletWorkingScheduleDTO::class})
     */
    public ?\App\DTO\OutletWorkingScheduleDTO $working_schedule = null;

    /**
     * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.
     * @DTA\Data(field="deliveryRules", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $delivery_rules = null;

    /**
     * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
     * @DTA\Data(field="storagePeriod", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $storage_period = null;

}
