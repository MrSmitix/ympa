<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос информации о прайс-листе.
 */
class GetFeedResponse
{
    /**
     * @DTA\Data(field="feed", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedDTO::class})
     * @var \App\DTO\FeedDTO|null
     */
    public $feed;

}
