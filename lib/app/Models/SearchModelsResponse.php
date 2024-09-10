<?php
/**
 * SearchModelsResponse
 */
namespace app\Models;

/**
 * SearchModelsResponse
 */
class SearchModelsResponse {

    /** @var \app\Models\ModelDTO[] $models Список моделей товаров.*/
    public $models = [];

    /** @var string $currency */
    public $currency = "";

    /** @var int $regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).*/
    public $regionId = 0;

    /** @var \app\Models\FlippingPagerDTO $pager */
    public $pager;

}
