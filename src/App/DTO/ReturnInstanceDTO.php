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
     * @var \App\DTO\ReturnInstanceStockType|null
     */
    public $stock_type;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ReturnInstanceStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ReturnInstanceStatusType::class})
     * @var \App\DTO\ReturnInstanceStatusType|null
     */
    public $status;

    /**
     * Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
     * @DTA\Data(field="cis", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cis;

    /**
     * Международный идентификатор мобильного оборудования.
     * @DTA\Data(field="imei", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $imei;

}
