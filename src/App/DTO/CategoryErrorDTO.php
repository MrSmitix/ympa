<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Текст ошибки.
 */
class CategoryErrorDTO
{
    /**
     * Идентификатор категории.
     * @DTA\Data(field="categoryId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $category_id = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CategoryErrorType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CategoryErrorType::class})
     */
    public ?\App\DTO\CategoryErrorType $type = null;

}
