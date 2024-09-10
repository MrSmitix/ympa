<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о последней загрузке прайс-листа.
 */
class FeedDownloadDTO
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedStatusType::class})
     * @var \App\DTO\FeedStatusType|null
     */
    public $status;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedDownloadErrorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedDownloadErrorDTO::class})
     * @var \App\DTO\FeedDownloadErrorDTO|null
     */
    public $error;

}
