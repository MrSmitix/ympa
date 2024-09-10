<?php
/**
 * GetMappingDTO
 */
namespace app\Models;

/**
 * GetMappingDTO
 * @description Информация о товарах в каталоге.
 */
class GetMappingDTO {

    /** @var int $marketSku SKU на Маркете.*/
    public $marketSku = 0;

    /** @var string $marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.*/
    public $marketSkuName = "";

    /** @var int $marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.*/
    public $marketModelId = 0;

    /** @var string $marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.*/
    public $marketModelName = "";

    /** @var int $marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.*/
    public $marketCategoryId = 0;

    /** @var string $marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.*/
    public $marketCategoryName = "";

}
