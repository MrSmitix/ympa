<?php
/**
 * OutletDTO
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
 * Class representing the OutletDTO model.
 *
 * Информация о точке продаж.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class OutletDTO  implements \JsonSerializable
{
        /**
     * Название точки продаж.
     *
     * @var string
     * @SerializedName("name")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $name;

    /**
     * @var OutletType
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public OutletType $type;

    /**
     * Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.
     *
     * @var string|null
     * @SerializedName("coords")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $coords;

    /**
     * Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.
     *
     * @var bool|null
     * @SerializedName("isMain")
     * @Assert\Type("bool")
     * @Type("bool")
     */
    public ?bool $isMain;

    /**
     * Идентификатор точки продаж, присвоенный магазином.
     *
     * @var string|null
     * @SerializedName("shopOutletCode")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $shopOutletCode;

    /**
     * @var OutletVisibilityType|null
     * @SerializedName("visibility")
        * @Accessor(getter="getSerializedVisibility")
        * @Type("string")
     */
    public ?OutletVisibilityType $visibility;

    /**
     * @var OutletAddressDTO
     * @SerializedName("address")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("\OpenAPIServer\Model\OutletAddressDTO")
     * @Type("\OpenAPIServer\Model\OutletAddressDTO")
     */
    public OutletAddressDTO $address;

    /**
     * Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.
     *
     * @var string[]
     * @SerializedName("phones")
     * @Assert\NotNull()
     * @Assert\All({
     *   @Assert\Type("string")
     * })
     * @Type("array<string>")
     * @Assert\Count(
     *   min = 1
     * )
     */
    public array $phones;

    /**
     * @var OutletWorkingScheduleDTO
     * @SerializedName("workingSchedule")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("\OpenAPIServer\Model\OutletWorkingScheduleDTO")
     * @Type("\OpenAPIServer\Model\OutletWorkingScheduleDTO")
     */
    public OutletWorkingScheduleDTO $workingSchedule;

    /**
     * Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.
     *
     * @var OutletDeliveryRuleDTO[]|null
     * @SerializedName("deliveryRules")
     * @Assert\All({
     *   @Assert\Type("\OpenAPIServer\Model\OutletDeliveryRuleDTO")
     * })
     * @Type("array<\OpenAPIServer\Model\OutletDeliveryRuleDTO>")
     */
    public ?array $deliveryRules;

    /**
     * Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
     *
     * @var int|null
     * @SerializedName("storagePeriod")
     * @Assert\Type("int")
     * @Type("int")
     */
    public ?int $storagePeriod;

    /**
     * Constructor
     *
     * @param string $name
     * @param OutletType $type
     * @param string|null $coords
     * @param bool|null $isMain
     * @param string|null $shopOutletCode
     * @param OutletVisibilityType|null $visibility
     * @param OutletAddressDTO $address
     * @param string[] $phones
     * @param OutletWorkingScheduleDTO $workingSchedule
     * @param OutletDeliveryRuleDTO[]|null $deliveryRules
     * @param int|null $storagePeriod
     */
    public function __construct(string $name, OutletType $type, ?string $coords, ?bool $isMain, ?string $shopOutletCode, ?OutletVisibilityType $visibility, OutletAddressDTO $address, array $phones, OutletWorkingScheduleDTO $workingSchedule, ?array $deliveryRules, ?int $storagePeriod)
    {
        $this->name = $name;
        $this->type = $type;
        $this->coords = $coords;
        $this->isMain = $isMain;
        $this->shopOutletCode = $shopOutletCode;
        $this->visibility = $visibility;
        $this->address = $address;
        $this->phones = $phones;
        $this->workingSchedule = $workingSchedule;
        $this->deliveryRules = $deliveryRules;
        $this->storagePeriod = $storagePeriod;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['name'] ?? null, 
            isset($data['type']) ? OutletType::tryFrom($data['type']) : null, 
            $data['coords'] ?? null, 
            $data['isMain'] ?? null, 
            $data['shopOutletCode'] ?? null, 
            isset($data['visibility']) ? OutletVisibilityType::tryFrom($data['visibility']) : null, 
            isset($data['address']) ? OutletAddressDTO::fromArray($data['address']) : null, 
            $data['phones'] ?? null, 
            isset($data['workingSchedule']) ? OutletWorkingScheduleDTO::fromArray($data['workingSchedule']) : null, 
            isset($data['deliveryRules']) ? array_map(fn($item) => OutletDeliveryRuleDTO::fromArray($item), $data['deliveryRules']) : null, 
            $data['storagePeriod'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'name' => $this->name, 
            'type' => $this->type, 
            'coords' => $this->coords, 
            'isMain' => $this->isMain, 
            'shopOutletCode' => $this->shopOutletCode, 
            'visibility' => $this->visibility, 
            'address' => $this->address, 
            'phones' => $this->phones, 
            'workingSchedule' => $this->workingSchedule, 
            'deliveryRules' => $this->deliveryRules, 
            'storagePeriod' => $this->storagePeriod, 
        ];
    }
}


