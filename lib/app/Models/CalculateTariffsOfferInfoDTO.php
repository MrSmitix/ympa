<?php
/**
 * CalculateTariffsOfferInfoDTO
 */
namespace app\Models;

/**
 * CalculateTariffsOfferInfoDTO
 * @description Стоимость услуг.
 */
class CalculateTariffsOfferInfoDTO {

    /** @var \app\Models\CalculateTariffsOfferDTO $offer */
    public $offer;

    /** @var \app\Models\CalculatedTariffDTO[] $tariffs Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).*/
    public $tariffs = [];

}
