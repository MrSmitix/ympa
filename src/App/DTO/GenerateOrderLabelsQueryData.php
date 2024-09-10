<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for generateOrderLabels
 */
class GenerateOrderLabelsQueryData
{
    /**
     * Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
     * @DTA\Data(field="format", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $format;

}
