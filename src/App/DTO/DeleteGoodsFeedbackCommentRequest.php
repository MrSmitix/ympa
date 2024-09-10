<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтр запроса отзывов по бизнесу.
 */
class DeleteGoodsFeedbackCommentRequest
{
    /**
     * Идентификатор комментария к отзыву.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

}
