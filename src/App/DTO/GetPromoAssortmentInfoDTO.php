<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о товарах в акции.
 */
class GetPromoAssortmentInfoDTO
{
    /**
     * Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).
     * @DTA\Data(field="activeOffers")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $active_offers;

    /**
     * Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.
     * @DTA\Data(field="potentialOffers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $potential_offers;

    /**
     * Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.
     * @DTA\Data(field="processing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $processing;

}
