<?php
/**
 * GetCategoriesMaxSaleQuantumRequest
 */
namespace app\Models;

/**
 * GetCategoriesMaxSaleQuantumRequest
 * @description Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров.
 */
class GetCategoriesMaxSaleQuantumRequest {

    /** @var int[] $marketCategoryIds Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.*/
    public $marketCategoryIds = [];

}
