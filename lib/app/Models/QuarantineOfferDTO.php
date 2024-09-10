<?php
/**
 * QuarantineOfferDTO
 */
namespace app\Models;

/**
 * QuarantineOfferDTO
 * @description Товар в карантине.
 */
class QuarantineOfferDTO {

    /** @var string $offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $offerId = "";

    /** @var \app\Models\BasePriceDTO $currentPrice */
    public $currentPrice;

    /** @var \app\Models\BasePriceDTO $lastValidPrice */
    public $lastValidPrice;

    /** @var \app\Models\PriceQuarantineVerdictDTO[]|null $verdicts Причины попадания товара в карантин.*/
    public $verdicts = null;

}
