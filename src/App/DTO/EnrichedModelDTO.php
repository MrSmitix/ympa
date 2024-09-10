<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Модель товара.
 */
class EnrichedModelDTO
{
    /**
     * Идентификатор модели товара.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * Название модели товара.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="prices", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModelPriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModelPriceDTO::class})
     * @var \App\DTO\ModelPriceDTO|null
     */
    public $prices;

    /**
     * Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.
     * @DTA\Data(field="offers", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\ModelOfferDTO[]|null
     */
    public $offers;

    /**
     * Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
     * @DTA\Data(field="offlineOffers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $offline_offers;

    /**
     * Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
     * @DTA\Data(field="onlineOffers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $online_offers;

}
