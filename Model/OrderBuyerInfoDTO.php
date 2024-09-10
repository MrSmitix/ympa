<?php
/**
 * OrderBuyerInfoDTO
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
 * Class representing the OrderBuyerInfoDTO model.
 *
 * Информация о покупателе и его номере телефона.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OrderBuyerInfoDTO  implements \JsonSerializable
{
        /**
     * Идентификатор покупателя.
     *
     * @var string|null
     * @SerializedName("id")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $id;

    /**
     * Фамилия покупателя.
     *
     * @var string|null
     * @SerializedName("lastName")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $lastName;

    /**
     * Имя покупателя.
     *
     * @var string|null
     * @SerializedName("firstName")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $firstName;

    /**
     * Отчество покупателя.
     *
     * @var string|null
     * @SerializedName("middleName")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $middleName;

    /**
     * @var OrderBuyerType|null
     * @SerializedName("type")
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public ?OrderBuyerType $type;

    /**
     * Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.
     *
     * @var string|null
     * @SerializedName("phone")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $phone;

    /**
     * Constructor
     *
     * @param string|null $id
     * @param string|null $lastName
     * @param string|null $firstName
     * @param string|null $middleName
     * @param OrderBuyerType|null $type
     * @param string|null $phone
     */
    public function __construct(?string $id, ?string $lastName, ?string $firstName, ?string $middleName, ?OrderBuyerType $type, ?string $phone)
    {
        $this->id = $id;
        $this->lastName = $lastName;
        $this->firstName = $firstName;
        $this->middleName = $middleName;
        $this->type = $type;
        $this->phone = $phone;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['id'] ?? null, 
            $data['lastName'] ?? null, 
            $data['firstName'] ?? null, 
            $data['middleName'] ?? null, 
            isset($data['type']) ? OrderBuyerType::tryFrom($data['type']) : null, 
            $data['phone'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'id' => $this->id, 
            'lastName' => $this->lastName, 
            'firstName' => $this->firstName, 
            'middleName' => $this->middleName, 
            'type' => $this->type, 
            'phone' => $this->phone, 
        ];
    }
}


