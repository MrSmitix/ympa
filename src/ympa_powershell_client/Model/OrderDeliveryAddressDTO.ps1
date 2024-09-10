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

Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 

.PARAMETER Country
Страна.  Обязательный параметр. 
.PARAMETER Postcode
Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
.PARAMETER City
Город или населенный пункт.  Обязательный параметр. 
.PARAMETER District
Район.
.PARAMETER Subway
Станция метро.
.PARAMETER Street
Улица.  Обязательный параметр. 
.PARAMETER House
Дом или владение.  Обязательный параметр. 
.PARAMETER Block
Корпус или строение.
.PARAMETER Entrance
Подъезд.
.PARAMETER Entryphone
Код домофона.
.PARAMETER Floor
Этаж.
.PARAMETER Apartment
Квартира или офис.
.PARAMETER Phone
Телефон получателя заказа.  Обязательный параметр. 
.PARAMETER Recipient
Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
.PARAMETER Gps
No description available.
.OUTPUTS

OrderDeliveryAddressDTO<PSCustomObject>
#>

function Initialize-OrderDeliveryAddressDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Country},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Postcode},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${City},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${District},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Subway},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Street},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${House},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Block},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Entrance},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Entryphone},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Floor},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Apartment},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Phone},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Recipient},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Gps}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OrderDeliveryAddressDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "country" = ${Country}
            "postcode" = ${Postcode}
            "city" = ${City}
            "district" = ${District}
            "subway" = ${Subway}
            "street" = ${Street}
            "house" = ${House}
            "block" = ${Block}
            "entrance" = ${Entrance}
            "entryphone" = ${Entryphone}
            "floor" = ${Floor}
            "apartment" = ${Apartment}
            "phone" = ${Phone}
            "recipient" = ${Recipient}
            "gps" = ${Gps}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OrderDeliveryAddressDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OrderDeliveryAddressDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OrderDeliveryAddressDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOrderDeliveryAddressDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OrderDeliveryAddressDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OrderDeliveryAddressDTO
        $AllProperties = ("country", "postcode", "city", "district", "subway", "street", "house", "block", "entrance", "entryphone", "floor", "apartment", "phone", "recipient", "gps")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "country"))) { #optional property not found
            $Country = $null
        } else {
            $Country = $JsonParameters.PSobject.Properties["country"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "postcode"))) { #optional property not found
            $Postcode = $null
        } else {
            $Postcode = $JsonParameters.PSobject.Properties["postcode"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "city"))) { #optional property not found
            $City = $null
        } else {
            $City = $JsonParameters.PSobject.Properties["city"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "district"))) { #optional property not found
            $District = $null
        } else {
            $District = $JsonParameters.PSobject.Properties["district"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "subway"))) { #optional property not found
            $Subway = $null
        } else {
            $Subway = $JsonParameters.PSobject.Properties["subway"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "street"))) { #optional property not found
            $Street = $null
        } else {
            $Street = $JsonParameters.PSobject.Properties["street"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "house"))) { #optional property not found
            $House = $null
        } else {
            $House = $JsonParameters.PSobject.Properties["house"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "block"))) { #optional property not found
            $Block = $null
        } else {
            $Block = $JsonParameters.PSobject.Properties["block"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "entrance"))) { #optional property not found
            $Entrance = $null
        } else {
            $Entrance = $JsonParameters.PSobject.Properties["entrance"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "entryphone"))) { #optional property not found
            $Entryphone = $null
        } else {
            $Entryphone = $JsonParameters.PSobject.Properties["entryphone"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "floor"))) { #optional property not found
            $Floor = $null
        } else {
            $Floor = $JsonParameters.PSobject.Properties["floor"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "apartment"))) { #optional property not found
            $Apartment = $null
        } else {
            $Apartment = $JsonParameters.PSobject.Properties["apartment"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "phone"))) { #optional property not found
            $Phone = $null
        } else {
            $Phone = $JsonParameters.PSobject.Properties["phone"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "recipient"))) { #optional property not found
            $Recipient = $null
        } else {
            $Recipient = $JsonParameters.PSobject.Properties["recipient"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "gps"))) { #optional property not found
            $Gps = $null
        } else {
            $Gps = $JsonParameters.PSobject.Properties["gps"].value
        }

        $PSO = [PSCustomObject]@{
            "country" = ${Country}
            "postcode" = ${Postcode}
            "city" = ${City}
            "district" = ${District}
            "subway" = ${Subway}
            "street" = ${Street}
            "house" = ${House}
            "block" = ${Block}
            "entrance" = ${Entrance}
            "entryphone" = ${Entryphone}
            "floor" = ${Floor}
            "apartment" = ${Apartment}
            "phone" = ${Phone}
            "recipient" = ${Recipient}
            "gps" = ${Gps}
        }

        return $PSO
    }

}

