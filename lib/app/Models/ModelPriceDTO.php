<?php
/**
 * ModelPriceDTO
 */
namespace app\Models;

/**
 * ModelPriceDTO
 * @description Информация о ценах на модель товара.
 */
class ModelPriceDTO {

    /** @var float $avg Средняя цена предложения для модели в регионе.*/
    public $avg = 0;

    /** @var float $max Максимальная цена предложения для модели в регионе.*/
    public $max = 0;

    /** @var float $min Минимальная цена предложения для модели в регионе.*/
    public $min = 0;

}
