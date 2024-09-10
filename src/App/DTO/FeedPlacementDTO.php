<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */
class FeedPlacementDTO
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedStatusType::class})
     * @var \App\DTO\FeedStatusType|null
     */
    public $status;

    /**
     * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
     * @DTA\Data(field="totalOffersCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total_offers_count;

}
