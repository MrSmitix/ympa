<?php
/**
 * OrderBoxLayoutItemDTO
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
 * Class representing the OrderBoxLayoutItemDTO model.
 *
 * Информация о товаре в коробке.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OrderBoxLayoutItemDTO 
{
        /**
     * Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}  
     *
     * @var int|null
     * @SerializedName("id")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $id = null;

    /**
     * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.
     *
     * @var int|null
     * @SerializedName("fullCount")
     * @Type("int")
    */
    #[Assert\Type("int")]
    #[Assert\GreaterThanOrEqual(1)]
    protected ?int $fullCount = null;

    /**
     * @var OrderBoxLayoutPartialCountDTO|null
     * @SerializedName("partialCount")
     * @Type("OpenAPI\Server\Model\OrderBoxLayoutPartialCountDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\OrderBoxLayoutPartialCountDTO")]
    protected ?OrderBoxLayoutPartialCountDTO $partialCount = null;

    /**
     * Переданные вами коды маркировки.
     *
     * @var BriefOrderItemInstanceDTO[]|null
     * @SerializedName("instances")
     * @Type("array<OpenAPI\Server\Model\BriefOrderItemInstanceDTO>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\BriefOrderItemInstanceDTO"),
    ])]
    protected ?array $instances = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->fullCount = array_key_exists('fullCount', $data) ? $data['fullCount'] : $this->fullCount;
            $this->partialCount = array_key_exists('partialCount', $data) ? $data['partialCount'] : $this->partialCount;
            $this->instances = array_key_exists('instances', $data) ? $data['instances'] : $this->instances;
        }
    }

    /**
     * Gets id.
     *
     * @return int|null
     */
    public function getId(): ?int
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param int|null $id  Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}  
    *
    * @return $this
    */
    public function setId(?int $id): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets fullCount.
     *
     * @return int|null
     */
    public function getFullCount(): ?int
    {
        return $this->fullCount;
    }

    /**
    * Sets fullCount.
    *
    * @param int|null $fullCount  Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`.
    *
    * @return $this
    */
    public function setFullCount(?int $fullCount = null): self
    {
        $this->fullCount = $fullCount;

        return $this;
    }




    /**
     * Gets partialCount.
     *
     * @return OrderBoxLayoutPartialCountDTO|null
     */
    public function getPartialCount(): ?OrderBoxLayoutPartialCountDTO
    {
        return $this->partialCount;
    }

    /**
    * Sets partialCount.
    *
    * @param OrderBoxLayoutPartialCountDTO|null $partialCount
    *
    * @return $this
    */
    public function setPartialCount(?OrderBoxLayoutPartialCountDTO $partialCount = null): self
    {
        $this->partialCount = $partialCount;

        return $this;
    }




    /**
     * Gets instances.
     *
     * @return BriefOrderItemInstanceDTO[]|null
     */
    public function getInstances(): ?array
    {
        return $this->instances;
    }

    /**
    * Sets instances.
    *
    * @param BriefOrderItemInstanceDTO[]|null $instances  Переданные вами коды маркировки.
    *
    * @return $this
    */
    public function setInstances(?array $instances = null): self
    {
        $this->instances = $instances;

        return $this;
    }



}


