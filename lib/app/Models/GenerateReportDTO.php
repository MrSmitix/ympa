<?php
/**
 * GenerateReportDTO
 */
namespace app\Models;

/**
 * GenerateReportDTO
 * @description Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */
class GenerateReportDTO {

    /** @var string $reportId Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.*/
    public $reportId = "";

    /** @var int $estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.*/
    public $estimatedGenerationTime = 0;

}
