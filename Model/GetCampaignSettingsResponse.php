<?php
/**
 * GetCampaignSettingsResponse
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
 * Class representing the GetCampaignSettingsResponse model.
 *
 * Ответ на запрос настроек магазина.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GetCampaignSettingsResponse  implements \JsonSerializable
{
        /**
     * @var CampaignSettingsDTO|null
     * @SerializedName("settings")
     * @Assert\Type("\OpenAPIServer\Model\CampaignSettingsDTO")
     * @Type("\OpenAPIServer\Model\CampaignSettingsDTO")
     */
    public ?CampaignSettingsDTO $settings;

    /**
     * Constructor
     *
     * @param CampaignSettingsDTO|null $settings
     */
    public function __construct(?CampaignSettingsDTO $settings)
    {
        $this->settings = $settings;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['settings']) ? CampaignSettingsDTO::fromArray($data['settings']) : null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'settings' => $this->settings, 
        ];
    }
}


