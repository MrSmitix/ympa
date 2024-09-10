<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class SearchModelsResponse
{
    /**
     * Список моделей товаров.
     * @DTA\Data(field="models")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ModelDTO[]|null
     */
    public $models;

    /**
     * @DTA\Data(field="currency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CurrencyType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CurrencyType::class})
     * @var \App\DTO\CurrencyType|null
     */
    public $currency;

    /**
     * Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).
     * @DTA\Data(field="regionId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $region_id;

    /**
     * @DTA\Data(field="pager", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FlippingPagerDTO::class})
     * @var \App\DTO\FlippingPagerDTO|null
     */
    public $pager;

}
