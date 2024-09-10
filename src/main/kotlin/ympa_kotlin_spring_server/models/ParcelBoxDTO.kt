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
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 * @param id {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 * @param fulfilmentId {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
 */
data class ParcelBoxDTO(

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @get:Pattern(regexp="^[\\p{Alnum}- ]*$")
    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
    @get:JsonProperty("fulfilmentId") val fulfilmentId: kotlin.String? = null
    ) {

}

