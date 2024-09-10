<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Стоимость услуг.
 */
class CalculateTariffsOfferInfoDTO
{
    /**
     * @DTA\Data(field="offer")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CalculateTariffsOfferDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CalculateTariffsOfferDTO::class})
     */
    public ?\App\DTO\CalculateTariffsOfferDTO $offer = null;

    /**
     * Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).
     * @DTA\Data(field="tariffs")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tariffs = null;

}
