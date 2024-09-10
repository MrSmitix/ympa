<?php
/**
 * EnrichedModelDTO
 */
namespace app\Models;

/**
 * EnrichedModelDTO
 * @description Модель товара.
 */
class EnrichedModelDTO {

    /** @var int $id Идентификатор модели товара.*/
    public $id = 0;

    /** @var string $name Название модели товара.*/
    public $name = "";

    /** @var \app\Models\ModelPriceDTO $prices */
    public $prices;

    /** @var \app\Models\ModelOfferDTO[]|null $offers Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.*/
    public $offers = null;

    /** @var int $offlineOffers Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.*/
    public $offlineOffers = 0;

    /** @var int $onlineOffers Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.*/
    public $onlineOffers = 0;

}
