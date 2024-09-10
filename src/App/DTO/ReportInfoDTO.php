<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Статус генерации и ссылка на готовый отчет.
 */
class ReportInfoDTO
{
    /**
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReportStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReportStatusType::class})
     * @var \App\DTO\ReportStatusType|null
     */
    public $status;

    /**
     * @DTA\Data(field="subStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReportSubStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReportSubStatusType::class})
     * @var \App\DTO\ReportSubStatusType|null
     */
    public $sub_status;

    /**
     * Дата и время запроса на генерацию.
     * @DTA\Data(field="generationRequestedAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $generation_requested_at;

    /**
     * Дата и время завершения генерации.
     * @DTA\Data(field="generationFinishedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $generation_finished_at;

    /**
     * Ссылка на готовый отчет.
     * @DTA\Data(field="file", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $file;

    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     * @DTA\Data(field="estimatedGenerationTime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $estimated_generation_time;

}
