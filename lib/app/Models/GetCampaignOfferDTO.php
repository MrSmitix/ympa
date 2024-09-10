<?php
/**
 * GetCampaignOfferDTO
 */
namespace app\Models;

/**
 * GetCampaignOfferDTO
 * @description Параметры размещения товара в магазине.
 */
class GetCampaignOfferDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\QuantumDTO $quantum */
    public $quantum;

    /** @var bool $available Есть ли товар в продаже.*/
    public $available = false;

    /** @var \app\Models\GetPriceWithDiscountDTO $basicPrice */
    public $basicPrice;

    /** @var \app\Models\GetPriceWithVatDTO $campaignPrice */
    public $campaignPrice;

    /** @var string $status */
    public $status = "";

    /** @var \app\Models\OfferErrorDTO[]|null $errors Ошибки, препятствующие размещению товара на витрине.*/
    public $errors = null;

    /** @var \app\Models\OfferErrorDTO[]|null $warnings Предупреждения, не препятствующие размещению товара на витрине.*/
    public $warnings = null;

}
