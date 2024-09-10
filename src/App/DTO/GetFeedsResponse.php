<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос списка прайс-листов.
 */
class GetFeedsResponse
{
    /**
     * Список прайс-листов.
     * @DTA\Data(field="feeds")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection104::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection104::class})
     */
    public ?\App\DTO\Collection104 $feeds = null;

}
