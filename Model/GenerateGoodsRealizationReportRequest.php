<?php
/**
 * GenerateGoodsRealizationReportRequest
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
 * Class representing the GenerateGoodsRealizationReportRequest model.
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class GenerateGoodsRealizationReportRequest 
{
        /**
     * Идентификатор кампании.
     *
     * @var int|null
     * @SerializedName("campaignId")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $campaignId = null;

    /**
     * Год.
     *
     * @var int|null
     * @SerializedName("year")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    protected ?int $year = null;

    /**
     * Номер месяца.
     *
     * @var int|null
     * @SerializedName("month")
     * @Type("int")
    */
    #[Assert\NotNull]
    #[Assert\Type("int")]
    #[Assert\GreaterThanOrEqual(1)]
    #[Assert\LessThanOrEqual(12)]
    protected ?int $month = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->campaignId = array_key_exists('campaignId', $data) ? $data['campaignId'] : $this->campaignId;
            $this->year = array_key_exists('year', $data) ? $data['year'] : $this->year;
            $this->month = array_key_exists('month', $data) ? $data['month'] : $this->month;
        }
    }

    /**
     * Gets campaignId.
     *
     * @return int|null
     */
    public function getCampaignId(): ?int
    {
        return $this->campaignId;
    }

    /**
    * Sets campaignId.
    *
    * @param int|null $campaignId  Идентификатор кампании.
    *
    * @return $this
    */
    public function setCampaignId(?int $campaignId): self
    {
        $this->campaignId = $campaignId;

        return $this;
    }




    /**
     * Gets year.
     *
     * @return int|null
     */
    public function getYear(): ?int
    {
        return $this->year;
    }

    /**
    * Sets year.
    *
    * @param int|null $year  Год.
    *
    * @return $this
    */
    public function setYear(?int $year): self
    {
        $this->year = $year;

        return $this;
    }




    /**
     * Gets month.
     *
     * @return int|null
     */
    public function getMonth(): ?int
    {
        return $this->month;
    }

    /**
    * Sets month.
    *
    * @param int|null $month  Номер месяца.
    *
    * @return $this
    */
    public function setMonth(?int $month): self
    {
        $this->month = $month;

        return $this;
    }



}


