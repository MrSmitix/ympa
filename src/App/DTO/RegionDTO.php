<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Регион доставки.
 */
class RegionDTO
{
    /**
     * Идентификатор региона.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * Название региона.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionType::class})
     */
    public ?\App\DTO\RegionType $type = null;

    /**
     * @DTA\Data(field="parent", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     */
    public ?\App\DTO\RegionDTO $parent = null;

    /**
     * Дочерние регионы.
     * @DTA\Data(field="children", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     */
    public ?\App\DTO\Collection6 $children = null;

}
