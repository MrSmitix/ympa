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
     */
    public ?int $total = null;

    /**
     * Начальный номер найденного элемента на странице.
     * @DTA\Data(field="from", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $from = null;

    /**
     * Конечный номер найденного элемента на странице.
     * @DTA\Data(field="to", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $to = null;

    /**
     * Текущая страница.
     * @DTA\Data(field="currentPage", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $current_page = null;

    /**
     * Общее количество страниц.
     * @DTA\Data(field="pagesCount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pages_count = null;

    /**
     * Размер страницы.
     * @DTA\Data(field="pageSize", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $page_size = null;

}
