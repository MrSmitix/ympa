package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedContentDTO
import ympa_kotlin_spring_server.models.FeedDownloadDTO
import ympa_kotlin_spring_server.models.FeedPlacementDTO
import ympa_kotlin_spring_server.models.FeedPublicationDTO
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Информация о прайс-листе.
 * @param id Идентификатор прайс-листа.
 * @param login Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @param name Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @param password Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
 * @param uploadDate Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
 * @param url URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
 * @param content 
 * @param download 
 * @param placement 
 * @param publication 
 */
data class FeedDTO(

    @Schema(example = "null", description = "Идентификатор прайс-листа.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
    @get:JsonProperty("login") val login: kotlin.String? = null,

    @Schema(example = "null", description = "Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. ")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. ")
    @get:JsonProperty("password") val password: kotlin.String? = null,

    @Schema(example = "null", description = "Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. ")
    @get:JsonProperty("uploadDate") val uploadDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. ")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("content") val content: FeedContentDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("download") val download: FeedDownloadDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placement") val placement: FeedPlacementDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publication") val publication: FeedPublicationDTO? = null
    ) {

}

