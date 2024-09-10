<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Модель для пагинации.
 */
class FlippingPagerDTO
{
    /**
     * Сколько всего найдено элементов.
     * @DTA\Data(field="total", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $total;

    /**
     * Начальный номер найденного элемента на странице.
     * @DTA\Data(field="from", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $from;

    /**
     * Конечный номер найденного элемента на странице.
     * @DTA\Data(field="to", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $to;

    /**
     * Текущая страница.
     * @DTA\Data(field="currentPage", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $current_page;

    /**
     * Общее количество страниц.
     * @DTA\Data(field="pagesCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pages_count;

    /**
     * Размер страницы.
     * @DTA\Data(field="pageSize", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $page_size;

}
