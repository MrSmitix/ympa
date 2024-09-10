<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
class GenerateReportDTO
{
    /**
     * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
     * @DTA\Data(field="reportId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $report_id = null;

    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     * @DTA\Data(field="estimatedGenerationTime")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $estimated_generation_time = null;

}
