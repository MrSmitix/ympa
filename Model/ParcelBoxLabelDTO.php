<?php
/**
 * ParcelBoxLabelDTO
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
 * Class representing the ParcelBoxLabelDTO model.
 *
 * Информация о ярлыке для коробки.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class ParcelBoxLabelDTO 
{
        /**
     * Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).
     *
     * @var string|null
     * @SerializedName("url")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $url = null;

    /**
     * Юридическое название магазина.
     *
     * @var string|null
     * @SerializedName("supplierName")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $supplierName = null;

    /**
     * Юридическое название службы доставки.
     *
     * @var string|null
     * @SerializedName("deliveryServiceName")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $deliveryServiceName = null;

    /**
     * Идентификатор заказа в системе Маркета.
     *
     * @var int|null
     * @SerializedName("orderId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $orderId = null;

    /**
     * Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина.
     *
     * @var string|null
     * @SerializedName("orderNum")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $orderNum = null;

    /**
     * Фамилия и инициалы получателя заказа.
     *
     * @var string|null
     * @SerializedName("recipientName")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $recipientName = null;

    /**
     * Идентификатор коробки.
     *
     * @var int|null
     * @SerializedName("boxId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $boxId = null;

    /**
     * Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д.
     *
     * @var string|null
     * @SerializedName("fulfilmentId")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $fulfilmentId = null;

    /**
     * Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;.
     *
     * @var string|null
     * @SerializedName("place")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $place = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;.
     *
     * @var string|null
     * @SerializedName("weight")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $weight = null;

    /**
     * Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
     *
     * @var string|null
     * @SerializedName("deliveryServiceId")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $deliveryServiceId = null;

    /**
     * Адрес получателя.
     *
     * @var string|null
     * @SerializedName("deliveryAddress")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $deliveryAddress = null;

    /**
     * Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.
     *
     * @var string|null
     * @SerializedName("shipmentDate")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $shipmentDate = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->url = array_key_exists('url', $data) ? $data['url'] : $this->url;
            $this->supplierName = array_key_exists('supplierName', $data) ? $data['supplierName'] : $this->supplierName;
            $this->deliveryServiceName = array_key_exists('deliveryServiceName', $data) ? $data['deliveryServiceName'] : $this->deliveryServiceName;
            $this->orderId = array_key_exists('orderId', $data) ? $data['orderId'] : $this->orderId;
            $this->orderNum = array_key_exists('orderNum', $data) ? $data['orderNum'] : $this->orderNum;
            $this->recipientName = array_key_exists('recipientName', $data) ? $data['recipientName'] : $this->recipientName;
            $this->boxId = array_key_exists('boxId', $data) ? $data['boxId'] : $this->boxId;
            $this->fulfilmentId = array_key_exists('fulfilmentId', $data) ? $data['fulfilmentId'] : $this->fulfilmentId;
            $this->place = array_key_exists('place', $data) ? $data['place'] : $this->place;
            $this->weight = array_key_exists('weight', $data) ? $data['weight'] : $this->weight;
            $this->deliveryServiceId = array_key_exists('deliveryServiceId', $data) ? $data['deliveryServiceId'] : $this->deliveryServiceId;
            $this->deliveryAddress = array_key_exists('deliveryAddress', $data) ? $data['deliveryAddress'] : $this->deliveryAddress;
            $this->shipmentDate = array_key_exists('shipmentDate', $data) ? $data['shipmentDate'] : $this->shipmentDate;
        }
    }

    /**
     * Gets url.
     *
     * @return string|null
     */
    public function getUrl(): ?string
    {
        return $this->url;
    }

    /**
    * Sets url.
    *
    * @param string|null $url  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md).
    *
    * @return $this
    */
    public function setUrl(?string $url): self
    {
        $this->url = $url;

        return $this;
    }




    /**
     * Gets supplierName.
     *
     * @return string|null
     */
    public function getSupplierName(): ?string
    {
        return $this->supplierName;
    }

    /**
    * Sets supplierName.
    *
    * @param string|null $supplierName  Юридическое название магазина.
    *
    * @return $this
    */
    public function setSupplierName(?string $supplierName): self
    {
        $this->supplierName = $supplierName;

        return $this;
    }




    /**
     * Gets deliveryServiceName.
     *
     * @return string|null
     */
    public function getDeliveryServiceName(): ?string
    {
        return $this->deliveryServiceName;
    }

    /**
    * Sets deliveryServiceName.
    *
    * @param string|null $deliveryServiceName  Юридическое название службы доставки.
    *
    * @return $this
    */
    public function setDeliveryServiceName(?string $deliveryServiceName): self
    {
        $this->deliveryServiceName = $deliveryServiceName;

        return $this;
    }




    /**
     * Gets orderId.
     *
     * @return int|null
     */
    public function getOrderId(): ?int
    {
        return $this->orderId;
    }

    /**
    * Sets orderId.
    *
    * @param int|null $orderId  Идентификатор заказа в системе Маркета.
    *
    * @return $this
    */
    public function setOrderId(?int $orderId): self
    {
        $this->orderId = $orderId;

        return $this;
    }




    /**
     * Gets orderNum.
     *
     * @return string|null
     */
    public function getOrderNum(): ?string
    {
        return $this->orderNum;
    }

    /**
    * Sets orderNum.
    *
    * @param string|null $orderNum  Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина.
    *
    * @return $this
    */
    public function setOrderNum(?string $orderNum): self
    {
        $this->orderNum = $orderNum;

        return $this;
    }




    /**
     * Gets recipientName.
     *
     * @return string|null
     */
    public function getRecipientName(): ?string
    {
        return $this->recipientName;
    }

    /**
    * Sets recipientName.
    *
    * @param string|null $recipientName  Фамилия и инициалы получателя заказа.
    *
    * @return $this
    */
    public function setRecipientName(?string $recipientName): self
    {
        $this->recipientName = $recipientName;

        return $this;
    }




    /**
     * Gets boxId.
     *
     * @return int|null
     */
    public function getBoxId(): ?int
    {
        return $this->boxId;
    }

    /**
    * Sets boxId.
    *
    * @param int|null $boxId  Идентификатор коробки.
    *
    * @return $this
    */
    public function setBoxId(?int $boxId): self
    {
        $this->boxId = $boxId;

        return $this;
    }




    /**
     * Gets fulfilmentId.
     *
     * @return string|null
     */
    public function getFulfilmentId(): ?string
    {
        return $this->fulfilmentId;
    }

    /**
    * Sets fulfilmentId.
    *
    * @param string|null $fulfilmentId  Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д.
    *
    * @return $this
    */
    public function setFulfilmentId(?string $fulfilmentId): self
    {
        $this->fulfilmentId = $fulfilmentId;

        return $this;
    }




    /**
     * Gets place.
     *
     * @return string|null
     */
    public function getPlace(): ?string
    {
        return $this->place;
    }

    /**
    * Sets place.
    *
    * @param string|null $place  Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`.
    *
    * @return $this
    */
    public function setPlace(?string $place): self
    {
        $this->place = $place;

        return $this;
    }




    /**
     * Gets weight.
     *
     * @return string|null
     */
    public function getWeight(): ?string
    {
        return $this->weight;
    }

    /**
    * Sets weight.
    *
    * @param string|null $weight  {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`.
    *
    * @return $this
    */
    public function setWeight(?string $weight): self
    {
        $this->weight = $weight;

        return $this;
    }




    /**
     * Gets deliveryServiceId.
     *
     * @return string|null
     */
    public function getDeliveryServiceId(): ?string
    {
        return $this->deliveryServiceId;
    }

    /**
    * Sets deliveryServiceId.
    *
    * @param string|null $deliveryServiceId  Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
    *
    * @return $this
    */
    public function setDeliveryServiceId(?string $deliveryServiceId): self
    {
        $this->deliveryServiceId = $deliveryServiceId;

        return $this;
    }




    /**
     * Gets deliveryAddress.
     *
     * @return string|null
     */
    public function getDeliveryAddress(): ?string
    {
        return $this->deliveryAddress;
    }

    /**
    * Sets deliveryAddress.
    *
    * @param string|null $deliveryAddress  Адрес получателя.
    *
    * @return $this
    */
    public function setDeliveryAddress(?string $deliveryAddress = null): self
    {
        $this->deliveryAddress = $deliveryAddress;

        return $this;
    }




    /**
     * Gets shipmentDate.
     *
     * @return string|null
     */
    public function getShipmentDate(): ?string
    {
        return $this->shipmentDate;
    }

    /**
    * Sets shipmentDate.
    *
    * @param string|null $shipmentDate  Дата отгрузки в формате `dd.MM.yyyy`.
    *
    * @return $this
    */
    public function setShipmentDate(?string $shipmentDate = null): self
    {
        $this->shipmentDate = $shipmentDate;

        return $this;
    }



}


