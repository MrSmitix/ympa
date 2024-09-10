<?php
/**
 * UpdateMappingDTO
 */
namespace app\Models;

/**
 * UpdateMappingDTO
 * @description Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке.
 */
class UpdateMappingDTO {

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

}
