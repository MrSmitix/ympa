<?php
/**
 * ModelDTO
 */
namespace app\Models;

/**
 * ModelDTO
 * @description Модель товара.
 */
class ModelDTO {

    /** @var int $id Идентификатор модели товара.*/
    public $id = 0;

    /** @var string $name Название модели товара.*/
    public $name = "";

    /** @var \app\Models\ModelPriceDTO $prices */
    public $prices;

}
