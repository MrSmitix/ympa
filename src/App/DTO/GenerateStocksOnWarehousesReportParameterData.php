<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for generateStocksOnWarehousesReport
 */
class GenerateStocksOnWarehousesReportParameterData
{
    /**
     * Формат отчета.
     * @DTA\Data(subset="query", field="format", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $format = null;

}
