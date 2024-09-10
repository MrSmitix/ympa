<?php
/**
 * OrdersStatsDTO
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
 * Class representing the OrdersStatsDTO model.
 *
 * Информация по заказам.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OrdersStatsDTO  implements \JsonSerializable
{
        /**
     * Список заказов.
     *
     * @var OrdersStatsOrderDTO[]
     * @SerializedName("orders")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\OrdersStatsOrderDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\OrdersStatsOrderDTO>")
     */
    public array $orders;

    /**
     * @var ForwardScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Assert\Type("\OpenAPIServer\Model\ForwardScrollingPagerDTO")
     * @Type("\OpenAPIServer\Model\ForwardScrollingPagerDTO")
     */
    public ?ForwardScrollingPagerDTO $paging;

    /**
     * Constructor
     *
     * @param OrdersStatsOrderDTO[] $orders
     * @param ForwardScrollingPagerDTO|null $paging
     */
    public function __construct(array $orders, ?ForwardScrollingPagerDTO $paging)
    {
        $this->orders = $orders;
        $this->paging = $paging;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['orders']) ? array_map(fn($item) => OrdersStatsOrderDTO::fromArray($item), $data['orders']) : null, 
            isset($data['paging']) ? ForwardScrollingPagerDTO::fromArray($data['paging']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'orders' => $this->orders, 
            'paging' => $this->paging, 
        ];
    }
}


