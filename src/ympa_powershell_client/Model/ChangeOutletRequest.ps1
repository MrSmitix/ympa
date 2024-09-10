#
# Партнерский API Маркета
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# Version: LATEST
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Name
Название точки продаж. 
.PARAMETER Type
No description available.
.PARAMETER Coords
Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
.PARAMETER IsMain
Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
.PARAMETER ShopOutletCode
Идентификатор точки продаж, присвоенный магазином.
.PARAMETER Visibility
No description available.
.PARAMETER Address
No description available.
.PARAMETER Phones
Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
.PARAMETER WorkingSchedule
No description available.
.PARAMETER DeliveryRules
Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
.PARAMETER StoragePeriod
Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
.OUTPUTS

ChangeOutletRequest<PSCustomObject>
#>

function Initialize-ChangeOutletRequest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Name},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("DEPOT", "MIXED", "RETAIL", "NOT_DEFINED")]
        [PSCustomObject]
        ${Type},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Coords},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${IsMain},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${ShopOutletCode},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("HIDDEN", "VISIBLE", "UNKNOWN")]
        [PSCustomObject]
        ${Visibility},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Address},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Phones},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${WorkingSchedule},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${DeliveryRules},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${StoragePeriod}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => ChangeOutletRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Name) {
            throw "invalid value for 'Name', 'Name' cannot be null."
        }

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if ($null -eq $Address) {
            throw "invalid value for 'Address', 'Address' cannot be null."
        }

        if ($null -eq $Phones) {
            throw "invalid value for 'Phones', 'Phones' cannot be null."
        }

        if ($Phones.length -lt 1) {
            throw "invalid value for 'Phones', number of items must be greater than or equal to 1."
        }

        if ($null -eq $WorkingSchedule) {
            throw "invalid value for 'WorkingSchedule', 'WorkingSchedule' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "type" = ${Type}
            "coords" = ${Coords}
            "isMain" = ${IsMain}
            "shopOutletCode" = ${ShopOutletCode}
            "visibility" = ${Visibility}
            "address" = ${Address}
            "phones" = ${Phones}
            "workingSchedule" = ${WorkingSchedule}
            "deliveryRules" = ${DeliveryRules}
            "storagePeriod" = ${StoragePeriod}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to ChangeOutletRequest<PSCustomObject>

.DESCRIPTION

Convert from JSON to ChangeOutletRequest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

ChangeOutletRequest<PSCustomObject>
#>
function ConvertFrom-JsonToChangeOutletRequest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => ChangeOutletRequest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in ChangeOutletRequest
        $AllProperties = ("name", "type", "coords", "isMain", "shopOutletCode", "visibility", "address", "phones", "workingSchedule", "deliveryRules", "storagePeriod")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'name' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "name"))) {
            throw "Error! JSON cannot be serialized due to the required property 'name' missing."
        } else {
            $Name = $JsonParameters.PSobject.Properties["name"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "address"))) {
            throw "Error! JSON cannot be serialized due to the required property 'address' missing."
        } else {
            $Address = $JsonParameters.PSobject.Properties["address"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "phones"))) {
            throw "Error! JSON cannot be serialized due to the required property 'phones' missing."
        } else {
            $Phones = $JsonParameters.PSobject.Properties["phones"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "workingSchedule"))) {
            throw "Error! JSON cannot be serialized due to the required property 'workingSchedule' missing."
        } else {
            $WorkingSchedule = $JsonParameters.PSobject.Properties["workingSchedule"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "coords"))) { #optional property not found
            $Coords = $null
        } else {
            $Coords = $JsonParameters.PSobject.Properties["coords"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "isMain"))) { #optional property not found
            $IsMain = $null
        } else {
            $IsMain = $JsonParameters.PSobject.Properties["isMain"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "shopOutletCode"))) { #optional property not found
            $ShopOutletCode = $null
        } else {
            $ShopOutletCode = $JsonParameters.PSobject.Properties["shopOutletCode"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "visibility"))) { #optional property not found
            $Visibility = $null
        } else {
            $Visibility = $JsonParameters.PSobject.Properties["visibility"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "deliveryRules"))) { #optional property not found
            $DeliveryRules = $null
        } else {
            $DeliveryRules = $JsonParameters.PSobject.Properties["deliveryRules"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "storagePeriod"))) { #optional property not found
            $StoragePeriod = $null
        } else {
            $StoragePeriod = $JsonParameters.PSobject.Properties["storagePeriod"].value
        }

        $PSO = [PSCustomObject]@{
            "name" = ${Name}
            "type" = ${Type}
            "coords" = ${Coords}
            "isMain" = ${IsMain}
            "shopOutletCode" = ${ShopOutletCode}
            "visibility" = ${Visibility}
            "address" = ${Address}
            "phones" = ${Phones}
            "workingSchedule" = ${WorkingSchedule}
            "deliveryRules" = ${DeliveryRules}
            "storagePeriod" = ${StoragePeriod}
        }

        return $PSO
    }

}

