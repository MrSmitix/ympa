<?php
/**
 * CategoryDTO
 */
namespace app\Models;

/**
 * CategoryDTO
 * @description Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий.
 */
class CategoryDTO {

    /** @var int $id Идентификатор категории.*/
    public $id = 0;

    /** @var string $name Название категории.*/
    public $name = "";

    /** @var \app\Models\CategoryDTO[]|null $children Дочерние категории.*/
    public $children = null;

}
