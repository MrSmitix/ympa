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
     * @var int|null
     */
    public $id;

    /**
     * Название региона.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionType::class})
     * @var \App\DTO\RegionType|null
     */
    public $type;

    /**
     * @DTA\Data(field="parent", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     * @var \App\DTO\RegionDTO|null
     */
    public $parent;

    /**
     * Дочерние регионы.
     * @DTA\Data(field="children", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     * @var \App\DTO\Collection6|null
     */
    public $children;

}
