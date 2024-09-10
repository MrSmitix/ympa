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
 * Модель для пагинации.
 * @param total Сколько всего найдено элементов.
 * @param from Начальный номер найденного элемента на странице.
 * @param to Конечный номер найденного элемента на странице.
 * @param currentPage Текущая страница.
 * @param pagesCount Общее количество страниц.
 * @param pageSize Размер страницы.
 */
data class FlippingPagerDTO(

    @Schema(example = "null", description = "Сколько всего найдено элементов.")
    @get:JsonProperty("total") val total: kotlin.Int? = null,

    @Schema(example = "null", description = "Начальный номер найденного элемента на странице.")
    @get:JsonProperty("from") val from: kotlin.Int? = null,

    @Schema(example = "null", description = "Конечный номер найденного элемента на странице.")
    @get:JsonProperty("to") val to: kotlin.Int? = null,

    @Schema(example = "null", description = "Текущая страница.")
    @get:JsonProperty("currentPage") val currentPage: kotlin.Int? = null,

    @Schema(example = "null", description = "Общее количество страниц.")
    @get:JsonProperty("pagesCount") val pagesCount: kotlin.Int? = null,

    @Schema(example = "null", description = "Размер страницы.")
    @get:JsonProperty("pageSize") val pageSize: kotlin.Int? = null
    ) {

}

