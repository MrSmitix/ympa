<?php
/**
 * CampaignSettingsScheduleDTO
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
 * Class representing the CampaignSettingsScheduleDTO model.
 *
 * Расписание работы службы доставки в своем регионе.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class CampaignSettingsScheduleDTO 
{
        /**
     * Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.
     *
     * @var bool|null
     * @SerializedName("availableOnHolidays")
     * @Type("bool")
    */
    #[Assert\Type("bool")]
    protected ?bool $availableOnHolidays = null;

    /**
     * Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
     *
     * @var string[]|null
     * @SerializedName("customHolidays")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $customHolidays = null;

    /**
     * Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
     *
     * @var string[]|null
     * @SerializedName("customWorkingDays")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $customWorkingDays = null;

    /**
     * @var CampaignSettingsTimePeriodDTO|null
     * @SerializedName("period")
     * @Type("OpenAPI\Server\Model\CampaignSettingsTimePeriodDTO")
    */
    #[Assert\Type("OpenAPI\Server\Model\CampaignSettingsTimePeriodDTO")]
    protected ?CampaignSettingsTimePeriodDTO $period = null;

    /**
     * Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
     *
     * @var string[]|null
     * @SerializedName("totalHolidays")
     * @Type("array<string>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("string"),
    ])]
    protected ?array $totalHolidays = null;

    /**
     * Список выходных дней недели и государственных праздников.
     *
     * @var int[]|null
     * @SerializedName("weeklyHolidays")
     * @Type("array<int>")
    */
    #[Assert\NotNull]
    #[Assert\All([
        new Assert\Type("int"),
    ])]
    protected ?array $weeklyHolidays = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->availableOnHolidays = array_key_exists('availableOnHolidays', $data) ? $data['availableOnHolidays'] : $this->availableOnHolidays;
            $this->customHolidays = array_key_exists('customHolidays', $data) ? $data['customHolidays'] : $this->customHolidays;
            $this->customWorkingDays = array_key_exists('customWorkingDays', $data) ? $data['customWorkingDays'] : $this->customWorkingDays;
            $this->period = array_key_exists('period', $data) ? $data['period'] : $this->period;
            $this->totalHolidays = array_key_exists('totalHolidays', $data) ? $data['totalHolidays'] : $this->totalHolidays;
            $this->weeklyHolidays = array_key_exists('weeklyHolidays', $data) ? $data['weeklyHolidays'] : $this->weeklyHolidays;
        }
    }

    /**
     * Gets availableOnHolidays.
     *
     * @return bool|null
     */
    public function isAvailableOnHolidays(): ?bool
    {
        return $this->availableOnHolidays;
    }

    /**
    * Sets availableOnHolidays.
    *
    * @param bool|null $availableOnHolidays  Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.
    *
    * @return $this
    */
    public function setAvailableOnHolidays(?bool $availableOnHolidays = null): self
    {
        $this->availableOnHolidays = $availableOnHolidays;

        return $this;
    }




    /**
     * Gets customHolidays.
     *
     * @return string[]|null
     */
    public function getCustomHolidays(): ?array
    {
        return $this->customHolidays;
    }

    /**
    * Sets customHolidays.
    *
    * @param string[]|null $customHolidays  Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
    *
    * @return $this
    */
    public function setCustomHolidays(?array $customHolidays): self
    {
        $this->customHolidays = $customHolidays;

        return $this;
    }




    /**
     * Gets customWorkingDays.
     *
     * @return string[]|null
     */
    public function getCustomWorkingDays(): ?array
    {
        return $this->customWorkingDays;
    }

    /**
    * Sets customWorkingDays.
    *
    * @param string[]|null $customWorkingDays  Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
    *
    * @return $this
    */
    public function setCustomWorkingDays(?array $customWorkingDays): self
    {
        $this->customWorkingDays = $customWorkingDays;

        return $this;
    }




    /**
     * Gets period.
     *
     * @return CampaignSettingsTimePeriodDTO|null
     */
    public function getPeriod(): ?CampaignSettingsTimePeriodDTO
    {
        return $this->period;
    }

    /**
    * Sets period.
    *
    * @param CampaignSettingsTimePeriodDTO|null $period
    *
    * @return $this
    */
    public function setPeriod(?CampaignSettingsTimePeriodDTO $period = null): self
    {
        $this->period = $period;

        return $this;
    }




    /**
     * Gets totalHolidays.
     *
     * @return string[]|null
     */
    public function getTotalHolidays(): ?array
    {
        return $this->totalHolidays;
    }

    /**
    * Sets totalHolidays.
    *
    * @param string[]|null $totalHolidays  Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
    *
    * @return $this
    */
    public function setTotalHolidays(?array $totalHolidays): self
    {
        $this->totalHolidays = $totalHolidays;

        return $this;
    }




    /**
     * Gets weeklyHolidays.
     *
     * @return int[]|null
     */
    public function getWeeklyHolidays(): ?array
    {
        return $this->weeklyHolidays;
    }

    /**
    * Sets weeklyHolidays.
    *
    * @param int[]|null $weeklyHolidays  Список выходных дней недели и государственных праздников.
    *
    * @return $this
    */
    public function setWeeklyHolidays(?array $weeklyHolidays): self
    {
        $this->weeklyHolidays = $weeklyHolidays;

        return $this;
    }



}


