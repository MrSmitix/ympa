<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о предложениях прайс-листа.
 */
class FeedIndexLogsOffersDTO
{
    /**
     * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
     * @DTA\Data(field="rejectedCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $rejected_count;

    /**
     * Количество предложений в прайс-листе.
     * @DTA\Data(field="totalCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total_count;

}