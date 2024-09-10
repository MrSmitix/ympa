<?php
/**
 * UnitDTO
 */
namespace app\Models;

/**
 * UnitDTO
 * @description Единица измерения.
 */
class UnitDTO {

    /** @var int $id Идентификатор единицы измерения.*/
    public $id = 0;

    /** @var string $name Сокращенное название единицы измерения.*/
    public $name = "";

    /** @var string $fullName Полное название единицы измерения.*/
    public $fullName = "";

}
