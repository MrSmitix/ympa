<?php
/**
 * OrderBoxLayoutDTO
 */
namespace app\Models;

/**
 * OrderBoxLayoutDTO
 * @description Информация о коробке.
 */
class OrderBoxLayoutDTO {

    /** @var \app\Models\OrderBoxLayoutItemDTO[] $items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.*/
    public $items = [];

}
