<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об установленной цене на товар.
 */
class OfferPriceResponseDTO
{
    /**
     * Идентификатор предложения из прайс-листа.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceDTO::class})
     * @var \App\DTO\PriceDTO|null
     */
    public $price;

    /**
     * SKU на Маркете.
     * @DTA\Data(field="marketSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $market_sku;

    /**
     * Дата и время последнего обновления цены на товар.
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $updated_at;

}
