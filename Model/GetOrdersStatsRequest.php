<?php
/**
 * GetOrdersStatsRequest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */


namespace OpenAPIServer\Model;

/**
 * Class representing the GetOrdersStatsRequest model.
 *
 * Запрос информации по заказам.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetOrdersStatsRequest  implements \JsonSerializable
{
        /**
     * Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("dateFrom")
     * @Assert\Type("\Date")
     * @Type("DateTime<'Y-m-d'>")
     */
    public ?\DateTime $dateFrom;

    /**
     * Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("dateTo")
     * @Assert\Type("\Date")
     * @Type("DateTime<'Y-m-d'>")
     */
    public ?\DateTime $dateTo;

    /**
     * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("updateFrom")
     * @Assert\Type("\Date")
     * @Type("DateTime<'Y-m-d'>")
     */
    public ?\DateTime $updateFrom;

    /**
     * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;.
     *
     * @var \DateTime|null
     * @SerializedName("updateTo")
     * @Assert\Type("\Date")
     * @Type("DateTime<'Y-m-d'>")
     */
    public ?\DateTime $updateTo;

    /**
     * Список идентификаторов заказов.
     *
     * @var int[]|null
     * @SerializedName("orders")
     * @Assert\All({
     *   @Assert\Type("int")
     * })
     * @Type("array<int>")
     */
    public ?array $orders;

    /**
     * Список статусов заказов.
     *
     * @var OrderStatsStatusType[]|null
     * @SerializedName("statuses")
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\OrderStatsStatusType")
     * })
     * @Accessor(getter="getSerializedStatuses")
     * @Type("array<string>")
     */
    public ?array $statuses;

    /**
     * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.
     *
     * @var bool|null
     * @SerializedName("hasCis")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    public ?bool $hasCis;

    /**
     * Constructor
     *
     * @param \DateTime|null $dateFrom
     * @param \DateTime|null $dateTo
     * @param \DateTime|null $updateFrom
     * @param \DateTime|null $updateTo
     * @param int[]|null $orders
     * @param OrderStatsStatusType[]|null $statuses
     * @param bool|null $hasCis
     */
    public function __construct(?\DateTime $dateFrom, ?\DateTime $dateTo, ?\DateTime $updateFrom, ?\DateTime $updateTo, ?array $orders, ?array $statuses, ?bool $hasCis)
    {
        $this->dateFrom = $dateFrom;
        $this->dateTo = $dateTo;
        $this->updateFrom = $updateFrom;
        $this->updateTo = $updateTo;
        $this->orders = $orders;
        $this->statuses = $statuses;
        $this->hasCis = $hasCis;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['dateFrom'] ?? null, 
            $data['dateTo'] ?? null, 
            $data['updateFrom'] ?? null, 
            $data['updateTo'] ?? null, 
            $data['orders'] ?? null, 
            isset($data['statuses']) ? array_map(fn($item) => OrderStatsStatusType::tryFrom($item), $data['statuses']) : null, 
            $data['hasCis'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'dateFrom' => $this->dateFrom, 
            'dateTo' => $this->dateTo, 
            'updateFrom' => $this->updateFrom, 
            'updateTo' => $this->updateTo, 
            'orders' => $this->orders, 
            'statuses' => $this->statuses, 
            'hasCis' => $this->hasCis, 
        ];
    }
}


