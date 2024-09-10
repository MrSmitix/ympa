<?php
/**
 * GetCategoriesMaxSaleQuantumResponse
 */
namespace app\Models;

/**
 * GetCategoriesMaxSaleQuantumResponse
 */
class GetCategoriesMaxSaleQuantumResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\MaxSaleQuantumDTO[] $results Категории и лимит на установку кванта и минимального количества товаров.*/
    public $results = [];

    /** @var \app\Models\CategoryErrorDTO[]|null $errors Ошибки, которые появились из-за переданных категорий.*/
    public $errors = null;

}
