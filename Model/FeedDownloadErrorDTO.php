<?php
/**
 * FeedDownloadErrorDTO
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
 * Class representing the FeedDownloadErrorDTO model.
 *
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedDownloadErrorDTO  implements \JsonSerializable
{
        /**
     * HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.
     *
     * @var int|null
     * @SerializedName("httpStatusCode")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $httpStatusCode;

    /**
     * @var FeedDownloadErrorType|null
     * @SerializedName("type")
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public ?FeedDownloadErrorType $type;

    /**
     * Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.
     *
     * @var string|null
     * @SerializedName("description")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $description;

    /**
     * Constructor
     *
     * @param int|null $httpStatusCode
     * @param FeedDownloadErrorType|null $type
     * @param string|null $description
     */
    public function __construct(?int $httpStatusCode, ?FeedDownloadErrorType $type, ?string $description)
    {
        $this->httpStatusCode = $httpStatusCode;
        $this->type = $type;
        $this->description = $description;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['httpStatusCode'] ?? null, 
            isset($data['type']) ? FeedDownloadErrorType::tryFrom($data['type']) : null, 
            $data['description'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'httpStatusCode' => $this->httpStatusCode, 
            'type' => $this->type, 
            'description' => $this->description, 
        ];
    }
}


