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
* Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. 
* Values: OTHER,CONTINENT,REGION,COUNTRY,COUNTRY_DISTRICT,REPUBLIC,CITY,VILLAGE,CITY_DISTRICT,SUBWAY_STATION,REPUBLIC_AREA
*/
enum class RegionType(@get:JsonValue val value: kotlin.String) {

    OTHER("OTHER"),
    CONTINENT("CONTINENT"),
    REGION("REGION"),
    COUNTRY("COUNTRY"),
    COUNTRY_DISTRICT("COUNTRY_DISTRICT"),
    REPUBLIC("REPUBLIC"),
    CITY("CITY"),
    VILLAGE("VILLAGE"),
    CITY_DISTRICT("CITY_DISTRICT"),
    SUBWAY_STATION("SUBWAY_STATION"),
    REPUBLIC_AREA("REPUBLIC_AREA");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): RegionType {
                return values().first{it -> it.value == value}
        }
    }
}

