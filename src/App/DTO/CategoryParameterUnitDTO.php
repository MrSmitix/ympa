<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Единицы измерения характеристики товара.
 */
class CategoryParameterUnitDTO
{
    /**
     * Единица измерения по умолчанию.
     * @DTA\Data(field="defaultUnitId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $default_unit_id;

    /**
     * Допустимые единицы измерения.
     * @DTA\Data(field="units")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\UnitDTO[]|null
     */
    public $units;

}
