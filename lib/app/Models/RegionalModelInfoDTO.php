<?php
/**
 * RegionalModelInfoDTO
 */
namespace app\Models;

/**
 * RegionalModelInfoDTO
 * @description Региональная информация.
 */
class RegionalModelInfoDTO {

    /** @var string $currency */
    public $currency = "";

    /** @var int $regionId Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).*/
    public $regionId = 0;

}
