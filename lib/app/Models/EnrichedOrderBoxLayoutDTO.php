<?php
/**
 * EnrichedOrderBoxLayoutDTO
 */
namespace app\Models;

/**
 * EnrichedOrderBoxLayoutDTO
 * @description Информация о коробке.
 */
class EnrichedOrderBoxLayoutDTO {

    /** @var \app\Models\OrderBoxLayoutItemDTO[] $items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.*/
    public $items = [];

    /** @var int $boxId Идентификатор коробки.*/
    public $boxId = 0;

}
