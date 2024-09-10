<?php
/**
 * GetModelsResponse
 */
namespace app\Models;

/**
 * GetModelsResponse
 * @description Ответ на запрос информации о моделях.
 */
class GetModelsResponse {

    /** @var \app\Models\ModelDTO[] $models Список моделей товаров.*/
    public $models = [];

    /** @var string $currency */
    public $currency = "";

    /** @var int $regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).*/
    public $regionId = 0;

}
