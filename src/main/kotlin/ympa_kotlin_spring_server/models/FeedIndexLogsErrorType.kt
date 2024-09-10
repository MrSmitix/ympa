package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Тип ошибки индексации прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре `httpStatusCode`.  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
* Values: DOWNLOAD_ERROR,DOWNLOAD_HTTP_ERROR,PARSE_ERROR,PARSE_XML_ERROR,TOO_MANY_REJECTED_OFFERS,NOT_INDEXED
*/
enum class FeedIndexLogsErrorType(@get:JsonValue val value: kotlin.String) {

    DOWNLOAD_ERROR("DOWNLOAD_ERROR"),
    DOWNLOAD_HTTP_ERROR("DOWNLOAD_HTTP_ERROR"),
    PARSE_ERROR("PARSE_ERROR"),
    PARSE_XML_ERROR("PARSE_XML_ERROR"),
    TOO_MANY_REJECTED_OFFERS("TOO_MANY_REJECTED_OFFERS"),
    NOT_INDEXED("NOT_INDEXED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): FeedIndexLogsErrorType {
                return values().first{it -> it.value == value}
        }
    }
}

