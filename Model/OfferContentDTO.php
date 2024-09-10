<?php
/**
 * OfferContentDTO
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
 * Class representing the OfferContentDTO model.
 *
 * Товар с указанными характеристиками.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class OfferContentDTO 
{
        /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     *
     * @var string|null
     * @SerializedName("offerId")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    #[Assert\Length(max: 255)]
    #[Assert\Length(min: 1)]
    #[Assert\Regex("/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/")]
    protected ?string $offerId = null;

    /**
     * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
     *
     * @var int|null
     * @SerializedName("categoryId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $categoryId = null;

    /**
     * Список характеристик с их значениями.  С &#x60;parameterValues&#x60; обязательно передавайте &#x60;marketCategoryId&#x60; — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее &#x60;parameterId&#x60; с пустым &#x60;value&#x60;.  Максимальное количество характеристик — 300.
     *
     * @var ParameterValueDTO[]|null
     * @SerializedName("parameterValues")
     * @Type("array<OpenAPI\Server\Model\ParameterValueDTO>")
    */
    #[Assert\NotNull]
    #[Assert\Valid]
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\ParameterValueDTO"),
    ])]
    #[Assert\Count(max: 300)]
    #[Assert\Count(min: 1)]
    protected ?array $parameterValues = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->offerId = array_key_exists('offerId', $data) ? $data['offerId'] : $this->offerId;
            $this->categoryId = array_key_exists('categoryId', $data) ? $data['categoryId'] : $this->categoryId;
            $this->parameterValues = array_key_exists('parameterValues', $data) ? $data['parameterValues'] : $this->parameterValues;
        }
    }

    /**
     * Gets offerId.
     *
     * @return string|null
     */
    public function getOfferId(): ?string
    {
        return $this->offerId;
    }

    /**
    * Sets offerId.
    *
    * @param string|null $offerId  Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
    *
    * @return $this
    */
    public function setOfferId(?string $offerId): self
    {
        $this->offerId = $offerId;

        return $this;
    }




    /**
     * Gets categoryId.
     *
     * @return int|null
     */
    public function getCategoryId(): ?int
    {
        return $this->categoryId;
    }

    /**
    * Sets categoryId.
    *
    * @param int|null $categoryId  Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
    *
    * @return $this
    */
    public function setCategoryId(?int $categoryId): self
    {
        $this->categoryId = $categoryId;

        return $this;
    }




    /**
     * Gets parameterValues.
     *
     * @return ParameterValueDTO[]|null
     */
    public function getParameterValues(): ?array
    {
        return $this->parameterValues;
    }

    /**
    * Sets parameterValues.
    *
    * @param ParameterValueDTO[]|null $parameterValues  Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300.
    *
    * @return $this
    */
    public function setParameterValues(?array $parameterValues): self
    {
        $this->parameterValues = $parameterValues;

        return $this;
    }



}


