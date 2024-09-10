<?php
/**
 * GetPriceWithVatDTO
 */
namespace app\Models;

/**
 * GetPriceWithVatDTO
 * @description Цена с указанием ставки НДС и времени последнего обновления.
 */
class GetPriceWithVatDTO {

    /** @var float $value Цена на товар.*/
    public $value = 0;

    /** @var float $discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.*/
    public $discountBase = 0;

    /** @var string $currencyId */
    public $currencyId = "";

    /** @var int $vat Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.*/
    public $vat = 0;

    /** @var \DateTime $updatedAt Время последнего обновления.*/
    public $updatedAt;

}
