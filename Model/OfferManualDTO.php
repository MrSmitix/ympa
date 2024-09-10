<?php
/**
 * OfferManualDTO
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
 * Class representing the OfferManualDTO model.
 *
 * Инструкция по использованию товара.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OfferManualDTO  implements \JsonSerializable
{
        /**
     * Ссылка на инструкцию.
     *
     * @var string
     * @SerializedName("url")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $url;

    /**
     * Название инструкции, которое будет отображаться на карточке товара.
     *
     * @var string|null
     * @SerializedName("title")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $title;

    /**
     * Constructor
     *
     * @param string $url
     * @param string|null $title
     */
    public function __construct(string $url, ?string $title)
    {
        $this->url = $url;
        $this->title = $title;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['url'] ?? null, 
            $data['title'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'url' => $this->url, 
            'title' => $this->title, 
        ];
    }
}


