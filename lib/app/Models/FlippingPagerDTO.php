<?php
/**
 * FlippingPagerDTO
 */
namespace app\Models;

/**
 * FlippingPagerDTO
 * @description Модель для пагинации.
 */
class FlippingPagerDTO {

    /** @var int $total Сколько всего найдено элементов.*/
    public $total = 0;

    /** @var int $from Начальный номер найденного элемента на странице.*/
    public $from = 0;

    /** @var int $to Конечный номер найденного элемента на странице.*/
    public $to = 0;

    /** @var int $currentPage Текущая страница.*/
    public $currentPage = 0;

    /** @var int $pagesCount Общее количество страниц.*/
    public $pagesCount = 0;

    /** @var int $pageSize Размер страницы.*/
    public $pageSize = 0;

}
