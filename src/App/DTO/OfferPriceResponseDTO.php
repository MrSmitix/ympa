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
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceDTO::class})
     */
    public ?\App\DTO\PriceDTO $price = null;

    /**
     * SKU на Маркете.
     * @DTA\Data(field="marketSku", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $market_sku = null;

    /**
     * Дата и время последнего обновления цены на товар.
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

}
