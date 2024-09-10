<?php
/**
 * GetCategoryContentParametersResponse
 */
namespace app\Models;

/**
 * GetCategoryContentParametersResponse
 * @description Ответ со списком характеристик для категории и их допустимыми значениями.
 */
class GetCategoryContentParametersResponse {

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\CategoryContentParametersDTO $result */
    public $result;

}
