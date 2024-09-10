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

Список чатов.

.PARAMETER Chats
Информация о чатах.
.PARAMETER Paging
No description available.
.OUTPUTS

GetChatsInfoDTO<PSCustomObject>
#>

function Initialize-GetChatsInfoDTO {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject[]]
        ${Chats},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${Paging}
    )

    Process {
        'Creating PSCustomObject: ympa_powershell_client => GetChatsInfoDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Chats) {
            throw "invalid value for 'Chats', 'Chats' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "chats" = ${Chats}
            "paging" = ${Paging}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GetChatsInfoDTO<PSCustomObject>

.DESCRIPTION

Convert from JSON to GetChatsInfoDTO<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GetChatsInfoDTO<PSCustomObject>
#>
function ConvertFrom-JsonToGetChatsInfoDTO {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: ympa_powershell_client => GetChatsInfoDTO' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in GetChatsInfoDTO
        $AllProperties = ("chats", "paging")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'chats' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "chats"))) {
            throw "Error! JSON cannot be serialized due to the required property 'chats' missing."
        } else {
            $Chats = $JsonParameters.PSobject.Properties["chats"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "paging"))) { #optional property not found
            $Paging = $null
        } else {
            $Paging = $JsonParameters.PSobject.Properties["paging"].value
        }

        $PSO = [PSCustomObject]@{
            "chats" = ${Chats}
            "paging" = ${Paging}
        }

        return $PSO
    }

}

