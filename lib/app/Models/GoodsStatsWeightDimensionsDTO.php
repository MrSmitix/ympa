<?php
/**
 * GoodsStatsWeightDimensionsDTO
 */
namespace app\Models;

/**
 * GoodsStatsWeightDimensionsDTO
 * @description Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете.
 */
class GoodsStatsWeightDimensionsDTO {

    /** @var float $length Длина товара в сантиметрах.*/
    public $length = 0;

    /** @var float $width Ширина товара в сантиметрах.*/
    public $width = 0;

    /** @var float $height Высота товара в сантиметрах.*/
    public $height = 0;

    /** @var float $weight Вес товара в килограммах.*/
    public $weight = 0;

}
