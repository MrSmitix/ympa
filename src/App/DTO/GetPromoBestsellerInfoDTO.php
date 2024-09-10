<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об акции «Бестселлеры Маркета».
 */
class GetPromoBestsellerInfoDTO
{
    /**
     * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
     * @DTA\Data(field="bestseller")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $bestseller = null;

    /**
     * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».
     * @DTA\Data(field="entryDeadline", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $entry_deadline = null;

}
