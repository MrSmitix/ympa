<?php
/**
 * CategoryParameterUnitDTO
 */
namespace app\Models;

/**
 * CategoryParameterUnitDTO
 * @description Единицы измерения характеристики товара.
 */
class CategoryParameterUnitDTO {

    /** @var int $defaultUnitId Единица измерения по умолчанию.*/
    public $defaultUnitId = 0;

    /** @var \app\Models\UnitDTO[] $units Допустимые единицы измерения.*/
    public $units = [];

}
