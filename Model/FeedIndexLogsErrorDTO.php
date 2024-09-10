<?php
/**
 * FeedIndexLogsErrorDTO
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
 * Class representing the FeedIndexLogsErrorDTO model.
 *
 * Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;).
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class FeedIndexLogsErrorDTO  implements \JsonSerializable
{
        /**
     * HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.
     *
     * @var int|null
     * @SerializedName("httpStatusCode")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $httpStatusCode;

    /**
     * @var FeedIndexLogsErrorType|null
     * @SerializedName("type")
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public ?FeedIndexLogsErrorType $type;

    /**
     * Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.
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
     * @param FeedIndexLogsErrorType|null $type
     * @param string|null $description
     */
    public function __construct(?int $httpStatusCode, ?FeedIndexLogsErrorType $type, ?string $description)
    {
        $this->httpStatusCode = $httpStatusCode;
        $this->type = $type;
        $this->description = $description;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['httpStatusCode'] ?? null, 
            isset($data['type']) ? FeedIndexLogsErrorType::tryFrom($data['type']) : null, 
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


