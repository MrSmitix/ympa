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
     */
    public ?int $id = null;

    /**
     * Название склада.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Идентификатор кампании в API и идентификатор магазина.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $campaign_id = null;

    /**
     * Возможна ли доставка по модели Экспресс.
     * @DTA\Data(field="express")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $express = null;

    /**
     * @DTA\Data(field="address", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\WarehouseAddressDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\WarehouseAddressDTO::class})
     */
    public ?\App\DTO\WarehouseAddressDTO $address = null;

}
