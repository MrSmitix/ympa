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
     */
    public ?\App\DTO\ReportStatusType $status = null;

    /**
     * @DTA\Data(field="subStatus", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReportSubStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReportSubStatusType::class})
     */
    public ?\App\DTO\ReportSubStatusType $sub_status = null;

    /**
     * Дата и время запроса на генерацию.
     * @DTA\Data(field="generationRequestedAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $generation_requested_at = null;

    /**
     * Дата и время завершения генерации.
     * @DTA\Data(field="generationFinishedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $generation_finished_at = null;

    /**
     * Ссылка на готовый отчет.
     * @DTA\Data(field="file", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file = null;

    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     * @DTA\Data(field="estimatedGenerationTime", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $estimated_generation_time = null;

}
