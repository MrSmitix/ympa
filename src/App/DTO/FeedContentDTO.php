<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о проверке содержимого прайс-листа, загруженного на Маркет.
 */
class FeedContentDTO
{
    /**
     * Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.
     * @DTA\Data(field="rejectedOffersCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $rejected_offers_count;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedStatusType::class})
     * @var \App\DTO\FeedStatusType|null
     */
    public $status;

    /**
     * Количество предложений в прайс-листе. Выводится, если параметр &#x60;content status&#x3D;OK&#x60;.
     * @DTA\Data(field="totalOffersCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total_offers_count;

    /**
     * @DTA\Data(field="error", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedContentErrorDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedContentErrorDTO::class})
     * @var \App\DTO\FeedContentErrorDTO|null
     */
    public $error;

}
