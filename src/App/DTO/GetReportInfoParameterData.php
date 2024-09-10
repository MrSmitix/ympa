<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getReportInfo
 */
class GetReportInfoParameterData
{
    /**
     * Идентификатор отчета, который вы получили после запуска генерации.
     * @DTA\Data(subset="path", field="reportId")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $report_id = null;

}
