<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об акции.
 */
class GetPromoDTO
{
    /**
     * Идентификатор акции.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Название акции.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="period")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoPeriodDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoPeriodDTO::class})
     */
    public ?\App\DTO\PromoPeriodDTO $period = null;

    /**
     * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
     * @DTA\Data(field="participating")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $participating = null;

    /**
     * @DTA\Data(field="assortmentInfo")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoAssortmentInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoAssortmentInfoDTO::class})
     */
    public ?\App\DTO\GetPromoAssortmentInfoDTO $assortment_info = null;

    /**
     * @DTA\Data(field="mechanicsInfo")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoMechanicsInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoMechanicsInfoDTO::class})
     */
    public ?\App\DTO\GetPromoMechanicsInfoDTO $mechanics_info = null;

    /**
     * @DTA\Data(field="bestsellerInfo")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoBestsellerInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoBestsellerInfoDTO::class})
     */
    public ?\App\DTO\GetPromoBestsellerInfoDTO $bestseller_info = null;

    /**
     * Список каналов продвижения товаров.
     * @DTA\Data(field="channels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $channels = null;

    /**
     * @DTA\Data(field="constraints", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoConstraintsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoConstraintsDTO::class})
     */
    public ?\App\DTO\GetPromoConstraintsDTO $constraints = null;

}
