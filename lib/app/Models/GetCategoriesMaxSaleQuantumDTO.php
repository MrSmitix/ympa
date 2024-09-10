<?php
/**
 * GetCategoriesMaxSaleQuantumDTO
 */
namespace app\Models;

/**
 * GetCategoriesMaxSaleQuantumDTO
 * @description Категории и лимит на установку кванта и минимального количества товаров.
 */
class GetCategoriesMaxSaleQuantumDTO {

    /** @var \app\Models\MaxSaleQuantumDTO[] $results Категории и лимит на установку кванта и минимального количества товаров.*/
    public $results = [];

    /** @var \app\Models\CategoryErrorDTO[]|null $errors Ошибки, которые появились из-за переданных категорий.*/
    public $errors = null;

}
