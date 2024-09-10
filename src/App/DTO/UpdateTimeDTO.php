<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Время последнего обновления.
 */
class UpdateTimeDTO
{
    /**
     * Время последнего обновления.
     * @DTA\Data(field="updatedAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $updated_at;

}
