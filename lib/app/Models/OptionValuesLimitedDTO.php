<?php
/**
 * OptionValuesLimitedDTO
 */
namespace app\Models;

/**
 * OptionValuesLimitedDTO
 * @description Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */
class OptionValuesLimitedDTO {

    /** @var int $limitingOptionValueId Идентификатор значения ограничивающей характеристики.*/
    public $limitingOptionValueId = 0;

    /** @var int[] $optionValueIds Идентификаторы допустимых значений ограничиваемой характеристики.*/
    public $optionValueIds = [];

}
