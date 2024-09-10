<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
 */
class OptionValuesLimitedDTO
{
    /**
     * Идентификатор значения ограничивающей характеристики.
     * @DTA\Data(field="limitingOptionValueId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $limiting_option_value_id;

    /**
     * Идентификаторы допустимых значений ограничиваемой характеристики.
     * @DTA\Data(field="optionValueIds")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var int[]|null
     */
    public $option_value_ids;

}
