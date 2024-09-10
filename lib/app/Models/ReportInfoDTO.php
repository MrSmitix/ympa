<?php
/**
 * ReportInfoDTO
 */
namespace app\Models;

/**
 * ReportInfoDTO
 * @description Статус генерации и ссылка на готовый отчет.
 */
class ReportInfoDTO {

    /** @var string $status */
    public $status = "";

    /** @var string $subStatus */
    public $subStatus = "";

    /** @var \DateTime $generationRequestedAt Дата и время запроса на генерацию.*/
    public $generationRequestedAt;

    /** @var \DateTime $generationFinishedAt Дата и время завершения генерации.*/
    public $generationFinishedAt;

    /** @var string $file Ссылка на готовый отчет.*/
    public $file = "";

    /** @var int $estimatedGenerationTime Ожидаемая продолжительность генерации в миллисекундах.*/
    public $estimatedGenerationTime = 0;

}
