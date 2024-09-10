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
     * @var string|null
     */
    public $id;

    /**
     * Название акции.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="period")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoPeriodDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoPeriodDTO::class})
     * @var \App\DTO\PromoPeriodDTO|null
     */
    public $period;

    /**
     * Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
     * @DTA\Data(field="participating")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $participating;

    /**
     * @DTA\Data(field="assortmentInfo")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoAssortmentInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoAssortmentInfoDTO::class})
     * @var \App\DTO\GetPromoAssortmentInfoDTO|null
     */
    public $assortment_info;

    /**
     * @DTA\Data(field="mechanicsInfo")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoMechanicsInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoMechanicsInfoDTO::class})
     * @var \App\DTO\GetPromoMechanicsInfoDTO|null
     */
    public $mechanics_info;

    /**
     * @DTA\Data(field="bestsellerInfo")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoBestsellerInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoBestsellerInfoDTO::class})
     * @var \App\DTO\GetPromoBestsellerInfoDTO|null
     */
    public $bestseller_info;

    /**
     * Список каналов продвижения товаров.
     * @DTA\Data(field="channels", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ChannelType[]|null
     */
    public $channels;

    /**
     * @DTA\Data(field="constraints", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoConstraintsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoConstraintsDTO::class})
     * @var \App\DTO\GetPromoConstraintsDTO|null
     */
    public $constraints;

}
