<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * description.
 */
class GetBidsRecommendationsRequest
{
    /**
     * Список товаров, для которых нужно получить рекомендации по ставкам.
     * @DTA\Data(field="skus")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection110::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection110::class})
     * @var \App\DTO\Collection110|null
     */
    public $skus;

}
