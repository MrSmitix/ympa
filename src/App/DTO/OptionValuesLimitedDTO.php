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
     */
    public ?int $limiting_option_value_id = null;

    /**
     * Идентификаторы допустимых значений ограничиваемой характеристики.
     * @DTA\Data(field="optionValueIds")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $option_value_ids = null;

}
