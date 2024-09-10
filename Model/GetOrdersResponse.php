<?php
/**
 * GetOrdersResponse
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
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

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the GetOrdersResponse model.
 *
 * Модель для ответа API списка информации по заказам.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetOrdersResponse 
{
        /**
     * @var FlippingPagerDTO|null
     * @SerializedName("pager")
     * @Type("OpenAPI\Server\Model\FlippingPagerDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\FlippingPagerDTO")]
    protected ?FlippingPagerDTO $pager = null;

    /**
     * Модель заказа.
     *
     * @var OrderDTO[]|null
     * @SerializedName("orders")
     * @Type("array<OpenAPI\Server\Model\OrderDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\OrderDTO"),
    ])]
    protected ?array $orders = null;

    /**
     * @var ForwardScrollingPagerDTO|null
     * @SerializedName("paging")
     * @Type("OpenAPI\Server\Model\ForwardScrollingPagerDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\ForwardScrollingPagerDTO")]
    protected ?ForwardScrollingPagerDTO $paging = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->pager = array_key_exists('pager', $data) ? $data['pager'] : $this->pager;
            $this->orders = array_key_exists('orders', $data) ? $data['orders'] : $this->orders;
            $this->paging = array_key_exists('paging', $data) ? $data['paging'] : $this->paging;
        }
    }

    /**
     * Gets pager.
     *
     * @return FlippingPagerDTO|null
     */
    public function getPager(): ?FlippingPagerDTO
    {
        return $this->pager;
    }

    /**
    * Sets pager.
    *
    * @param FlippingPagerDTO|null $pager
    *
    * @return $this
    */
    public function setPager(?FlippingPagerDTO $pager = null): self
    {
        $this->pager = $pager;

        return $this;
    }




    /**
     * Gets orders.
     *
     * @return OrderDTO[]|null
     */
    public function getOrders(): ?array
    {
        return $this->orders;
    }

    /**
    * Sets orders.
    *
    * @param OrderDTO[]|null $orders  Модель заказа.
    *
    * @return $this
    */
    public function setOrders(?array $orders): self
    {
        $this->orders = $orders;

        return $this;
    }




    /**
     * Gets paging.
     *
     * @return ForwardScrollingPagerDTO|null
     */
    public function getPaging(): ?ForwardScrollingPagerDTO
    {
        return $this->paging;
    }

    /**
    * Sets paging.
    *
    * @param ForwardScrollingPagerDTO|null $paging
    *
    * @return $this
    */
    public function setPaging(?ForwardScrollingPagerDTO $paging = null): self
    {
        $this->paging = $paging;

        return $this;
    }



}


