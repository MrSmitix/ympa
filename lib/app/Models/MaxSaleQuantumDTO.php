<?php
/**
 * MaxSaleQuantumDTO
 */
namespace app\Models;

/**
 * MaxSaleQuantumDTO
 * @description Лимит на установку кванта и минимального количества товаров по категориям.
 */
class MaxSaleQuantumDTO {

    /** @var int $id Идентификатор категории.*/
    public $id = 0;

    /** @var string $name Название категории.*/
    public $name = "";

    /** @var int $maxSaleQuantum Лимит на установку кванта и минимального количества товаров.*/
    public $maxSaleQuantum = 0;

}
