<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о статусе публикации товара на Маркете.
 */
class OfferProcessingStateDTO
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferProcessingStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferProcessingStatusType::class})
     */
    public ?\App\DTO\OfferProcessingStatusType $status = null;

    /**
     * Причины, по которым товар не прошел модерацию.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $notes = null;

}
