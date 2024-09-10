<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Логистическая информация по возврату.
 */
class ReturnInstanceDTO
{
    /**
     * @DTA\Data(field="stockType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnInstanceStockType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnInstanceStockType::class})
     */
    public ?\App\DTO\ReturnInstanceStockType $stock_type = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnInstanceStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnInstanceStatusType::class})
     */
    public ?\App\DTO\ReturnInstanceStatusType $status = null;

    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @DTA\Data(field="cis", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cis = null;

    /**
     * Международный идентификатор мобильного оборудования.
     * @DTA\Data(field="imei", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $imei = null;

}
