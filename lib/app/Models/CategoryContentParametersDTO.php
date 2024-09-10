<?php
/**
 * CategoryContentParametersDTO
 */
namespace app\Models;

/**
 * CategoryContentParametersDTO
 * @description Информация о параметрах категории.
 */
class CategoryContentParametersDTO {

    /** @var int $categoryId Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).*/
    public $categoryId = 0;

    /** @var \app\Models\CategoryParameterDTO[]|null $parameters Список характеристик.*/
    public $parameters = null;

}
