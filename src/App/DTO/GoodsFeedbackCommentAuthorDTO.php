<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об авторе комментария.
 */
class GoodsFeedbackCommentAuthorDTO
{
    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackCommentAuthorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackCommentAuthorType::class})
     * @var \App\DTO\GoodsFeedbackCommentAuthorType|null
     */
    public $type;

    /**
     * Имя автора или название кабинета.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

}
