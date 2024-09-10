<?php
/**
 * GetWarehouseStocksRequest
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
 * Class representing the GetWarehouseStocksRequest model.
 *
 * Фильтры для запроса остатков.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GetWarehouseStocksRequest 
{
        /**
     * **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — &#x60;false&#x60;. Если информация нужна, передайте значение &#x60;true&#x60;.
     *
     * @var bool|null
     * @SerializedName("withTurnover")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $withTurnover = false;

    /**
     * Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращается информация о товарах, которые не находятся в архиве.
     *
     * @var bool|null
     * @SerializedName("archived")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $archived = null;

    /**
     * Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60; * &#x60;archived&#x60;  {% endnote %}   
     *
     * @var string[]|null
     * @SerializedName("offerIds")
     * @Type("array<string>")
    */
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    #[Assert\Count(max: 500)]
    protected ?array $offerIds = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->withTurnover = array_key_exists('withTurnover', $data) ? $data['withTurnover'] : $this->withTurnover;
            $this->archived = array_key_exists('archived', $data) ? $data['archived'] : $this->archived;
            $this->offerIds = array_key_exists('offerIds', $data) ? $data['offerIds'] : $this->offerIds;
        }
    }

    /**
     * Gets withTurnover.
     *
     * @return bool|null
     */
    public function isWithTurnover(): ?bool
    {
        return $this->withTurnover;
    }

    /**
    * Sets withTurnover.
    *
    * @param bool|null $withTurnover  **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`.
    *
    * @return $this
    */
    public function setWithTurnover(?bool $withTurnover = null): self
    {
        $this->withTurnover = $withTurnover;

        return $this;
    }




    /**
     * Gets archived.
     *
     * @return bool|null
     */
    public function isArchived(): ?bool
    {
        return $this->archived;
    }

    /**
    * Sets archived.
    *
    * @param bool|null $archived  Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве.
    *
    * @return $this
    */
    public function setArchived(?bool $archived = null): self
    {
        $this->archived = $archived;

        return $this;
    }




    /**
     * Gets offerIds.
     *
     * @return string[]|null
     */
    public function getOfferIds(): ?array
    {
        return $this->offerIds;
    }

    /**
    * Sets offerIds.
    *
    * @param string[]|null $offerIds  Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}   
    *
    * @return $this
    */
    public function setOfferIds(?array $offerIds = null): self
    {
        $this->offerIds = $offerIds;

        return $this;
    }



}


