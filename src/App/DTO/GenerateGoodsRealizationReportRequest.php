<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет.
 */
class GenerateGoodsRealizationReportRequest
{
    /**
     * Идентификатор кампании.
     * @DTA\Data(field="campaignId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $campaign_id = null;

    /**
     * Год.
     * @DTA\Data(field="year")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $year = null;

    /**
     * Номер месяца.
     * @DTA\Data(field="month")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":12})
     */
    public ?int $month = null;

}
