package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Информация о приложенных к сообщению файлах.
 * @param name Имя файла.
 * @param url Ссылка для скачивания файла.
 * @param propertySize Размер файла в байтах.
 */
data class ChatMessagePayloadDTO(

    @Schema(example = "null", required = true, description = "Имя файла.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "Ссылка для скачивания файла.")
    @get:JsonProperty("url", required = true) val url: kotlin.String,

    @Schema(example = "null", required = true, description = "Размер файла в байтах.")
    @get:JsonProperty("size", required = true) val propertySize: kotlin.Int
    ) {

}

