<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об остатках товара.
 */
class WarehouseOfferDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":255})
     * @DTA\Validator(name="Match", options={"pattern":"/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/"})
     */
    public ?string $offer_id = null;

    /**
     * @DTA\Data(field="turnoverSummary", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TurnoverDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TurnoverDTO::class})
     */
    public ?\App\DTO\TurnoverDTO $turnover_summary = null;

    /**
     * Информация об остатках.
     * @DTA\Data(field="stocks")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $stocks = null;

    /**
     * Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.
     * @DTA\Data(field="updatedAt", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $updated_at = null;

}
