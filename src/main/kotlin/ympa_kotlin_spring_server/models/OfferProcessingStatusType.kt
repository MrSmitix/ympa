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
* Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
* Values: UNKNOWN,READY,IN_WORK,NEED_INFO,NEED_MAPPING,NEED_CONTENT,CONTENT_PROCESSING,SUSPENDED,REJECTED,REVIEW,CREATE_ERROR,UPDATE_ERROR
*/
enum class OfferProcessingStatusType(@get:JsonValue val value: kotlin.String) {

    UNKNOWN("UNKNOWN"),
    READY("READY"),
    IN_WORK("IN_WORK"),
    NEED_INFO("NEED_INFO"),
    NEED_MAPPING("NEED_MAPPING"),
    NEED_CONTENT("NEED_CONTENT"),
    CONTENT_PROCESSING("CONTENT_PROCESSING"),
    SUSPENDED("SUSPENDED"),
    REJECTED("REJECTED"),
    REVIEW("REVIEW"),
    CREATE_ERROR("CREATE_ERROR"),
    UPDATE_ERROR("UPDATE_ERROR");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OfferProcessingStatusType {
                return values().first{it -> it.value == value}
        }
    }
}

