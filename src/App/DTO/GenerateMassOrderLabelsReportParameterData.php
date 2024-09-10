<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for generateMassOrderLabelsReport
 */
class GenerateMassOrderLabelsReportParameterData
{
    /**
     * Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
     * @DTA\Data(subset="query", field="format", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $format = null;

}
