<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о складе.
 */
class WarehouseDTO
{
    /**
     * Идентификатор склада.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Название склада.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * Идентификатор кампании в API и идентификатор магазина.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Возможна ли доставка по модели Экспресс.
     * @DTA\Data(field="express")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $express;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseAddressDTO::class})
     * @var \App\DTO\WarehouseAddressDTO|null
     */
    public $address;

}
