<?php
/**
 * ParameterValueConstraintsDTO
 */
namespace app\Models;

/**
 * ParameterValueConstraintsDTO
 * @description Ограничения на значения характеристик.
 */
class ParameterValueConstraintsDTO {

    /** @var float $minValue Минимальное число.*/
    public $minValue = 0;

    /** @var float $maxValue Максимальное число.*/
    public $maxValue = 0;

    /** @var int $maxLength Максимальная длина текста.*/
    public $maxLength = 0;

}
