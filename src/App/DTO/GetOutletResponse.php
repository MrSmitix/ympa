<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос информации о точке продаж.
 */
class GetOutletResponse
{
    /**
     * @DTA\Data(field="outlet", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FullOutletDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FullOutletDTO::class})
     */
    public ?\App\DTO\FullOutletDTO $outlet = null;

}
