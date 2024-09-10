<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Причины, по которым товар не прошел модерацию.
 */
class OfferProcessingNoteDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferProcessingNoteType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferProcessingNoteType::class})
     * @var \App\DTO\OfferProcessingNoteType|null
     */
    public $type;

    /**
     * Дополнительная информация о причине отклонения товара.
     * @DTA\Data(field="payload", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $payload;

}
