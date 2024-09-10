<?php
/**
 * GetCategoriesRequest
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
 * Class representing the GetCategoriesRequest model.
 *
 * Параметры запроса категорий.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetCategoriesRequest  implements \JsonSerializable
{
        /**
     * @var LanguageType|null
     * @SerializedName("language")
        * @Accessor(getter="getSerializedLanguage")
        * @Type("string")
     */
    public ?LanguageType $language;

    /**
     * Constructor
     *
     * @param LanguageType|null $language
     */
    public function __construct(?LanguageType $language)
    {
        $this->language = $language;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['language']) ? LanguageType::tryFrom($data['language']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'language' => $this->language, 
        ];
    }
}


