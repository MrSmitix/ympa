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

Информация о лицензии.

.PARAMETER Id
Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
.PARAMETER OutletId
Идентификатор точки продаж, для которой действительна лицензия.
.PARAMETER LicenseType
No description available.
.PARAMETER Number
Номер лицензии.
.PARAMETER DateOfIssue
Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
.PARAMETER DateOfExpiry
Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
.OUTPUTS

OutletLicenseDTO<PSCustomObject>
#>

function Initialize-OutletLicenseDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${OutletId},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("ALCOHOL", "UNKNOWN")]
        [PSCustomObject]
        ${LicenseType},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Number},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${DateOfIssue},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${DateOfExpiry}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => OutletLicenseDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "outletId" = ${OutletId}
            "licenseType" = ${LicenseType}
            "number" = ${Number}
            "dateOfIssue" = ${DateOfIssue}
            "dateOfExpiry" = ${DateOfExpiry}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to OutletLicenseDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to OutletLicenseDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

OutletLicenseDTO<PSCustomObject>
#>
function ConvertFrom-JsonToOutletLicenseDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => OutletLicenseDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in OutletLicenseDTO
        $AllProperties = ("id", "outletId", "licenseType", "number", "dateOfIssue", "dateOfExpiry")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "outletId"))) { #optional property not found
            $OutletId = $null
        } else {
            $OutletId = $JsonParameters.PSobject.Properties["outletId"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "licenseType"))) { #optional property not found
            $LicenseType = $null
        } else {
            $LicenseType = $JsonParameters.PSobject.Properties["licenseType"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "number"))) { #optional property not found
            $Number = $null
        } else {
            $Number = $JsonParameters.PSobject.Properties["number"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dateOfIssue"))) { #optional property not found
            $DateOfIssue = $null
        } else {
            $DateOfIssue = $JsonParameters.PSobject.Properties["dateOfIssue"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dateOfExpiry"))) { #optional property not found
            $DateOfExpiry = $null
        } else {
            $DateOfExpiry = $JsonParameters.PSobject.Properties["dateOfExpiry"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "outletId" = ${OutletId}
            "licenseType" = ${LicenseType}
            "number" = ${Number}
            "dateOfIssue" = ${DateOfIssue}
            "dateOfExpiry" = ${DateOfExpiry}
        }

        return $PSO
    }

}

