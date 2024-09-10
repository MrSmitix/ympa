<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о последней публикации предложений из прайс-листа на Маркете.
 */
class FeedPublicationDTO
{
    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedStatusType::class})
     */
    public ?\App\DTO\FeedStatusType $status = null;

    /**
     * @DTA\Data(field="full", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedPublicationFullDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedPublicationFullDTO::class})
     */
    public ?\App\DTO\FeedPublicationFullDTO $full = null;

    /**
     * @DTA\Data(field="priceAndStockUpdate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FeedPublicationPriceAndStockUpdateDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FeedPublicationPriceAndStockUpdateDTO::class})
     */
    public ?\App\DTO\FeedPublicationPriceAndStockUpdateDTO $price_and_stock_update = null;

}
