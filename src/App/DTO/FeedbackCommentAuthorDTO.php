<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об авторе комментария.
 */
class FeedbackCommentAuthorDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedbackCommentAuthorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedbackCommentAuthorType::class})
     */
    public ?\App\DTO\FeedbackCommentAuthorType $type = null;

    /**
     * Имя автора отзыва или название магазина.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
