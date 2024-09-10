/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import ympa_kotlin_client.models.ApiErrorDTO
import ympa_kotlin_client.models.ApiResponseStatusType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Внутренняя ошибка сервера.
 *
 * @param status 
 * @param errors Список ошибок.
 */


data class ApiServerErrorResponse (

    @Json(name = "status")
    val status: ApiResponseStatusType? = null,

    /* Список ошибок. */
    @Json(name = "errors")
    val errors: kotlin.collections.List<ApiErrorDTO>? = null

) {


}

