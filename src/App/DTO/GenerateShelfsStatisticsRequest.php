<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета.
 */
class GenerateShelfsStatisticsRequest
{
    /**
     * Идентификатор бизнеса.
     * @DTA\Data(field="businessId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $business_id = null;

    /**
     * Начало периода, включительно.
     * @DTA\Data(field="dateFrom")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date_from = null;

    /**
     * Конец периода, включительно.
     * @DTA\Data(field="dateTo")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date_to = null;

    /**
     * @DTA\Data(field="attributionType")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShelfsStatisticsAttributionType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShelfsStatisticsAttributionType::class})
     */
    public ?\App\DTO\ShelfsStatisticsAttributionType $attribution_type = null;

}
