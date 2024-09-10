<?php
/**
 * RegionDTO
 */
namespace app\Models;

/**
 * RegionDTO
 * @description Регион доставки.
 */
class RegionDTO {

    /** @var int $id Идентификатор региона.*/
    public $id = 0;

    /** @var string $name Название региона.*/
    public $name = "";

    /** @var string $type */
    public $type = "";

    /** @var \app\Models\RegionDTO $parent */
    public $parent;

    /** @var \app\Models\RegionDTO[]|null $children Дочерние регионы.*/
    public $children = null;

}
