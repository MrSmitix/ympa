/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FeedbackDTO;
import org.openapitools.model.ScrollingPagerDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */
@Schema(name = "FeedbackListDTO", description = "Отзывы пользователей Яндекс Маркета об указанном магазине.")
@JsonPropertyOrder({
  FeedbackListDTO.JSON_PROPERTY_PAGING,
  FeedbackListDTO.JSON_PROPERTY_FEEDBACK_LIST
})
@JsonTypeName("FeedbackListDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FeedbackListDTO {
    public static final String JSON_PROPERTY_PAGING = "paging";
    private ScrollingPagerDTO paging;

    public static final String JSON_PROPERTY_FEEDBACK_LIST = "feedbackList";
    private List<@Valid FeedbackDTO> feedbackList = new ArrayList<>();

    public FeedbackListDTO(List<@Valid FeedbackDTO> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public FeedbackListDTO paging(ScrollingPagerDTO paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Get paging
     * @return paging
     */
    @Valid
    @Nullable
    @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ScrollingPagerDTO getPaging() {
        return paging;
    }

    @JsonProperty(JSON_PROPERTY_PAGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaging(ScrollingPagerDTO paging) {
        this.paging = paging;
    }

    public FeedbackListDTO feedbackList(List<@Valid FeedbackDTO> feedbackList) {
        this.feedbackList = feedbackList;
        return this;
    }

    public FeedbackListDTO addFeedbackListItem(FeedbackDTO feedbackListItem) {
        this.feedbackList.add(feedbackListItem);
        return this;
    }

    /**
     * Список отзывов.  Содержит не более 20 отзывов. 
     * @return feedbackList
     */
    @NotNull
    @Schema(name = "feedbackList", description = "Список отзывов.  Содержит не более 20 отзывов. ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_FEEDBACK_LIST)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid FeedbackDTO> getFeedbackList() {
        return feedbackList;
    }

    @JsonProperty(JSON_PROPERTY_FEEDBACK_LIST)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFeedbackList(List<@Valid FeedbackDTO> feedbackList) {
        this.feedbackList = feedbackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedbackListDTO feedbackListDTO = (FeedbackListDTO) o;
        return Objects.equals(this.paging, feedbackListDTO.paging) &&
            Objects.equals(this.feedbackList, feedbackListDTO.feedbackList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paging, feedbackList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedbackListDTO {\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    feedbackList: ").append(toIndentedString(feedbackList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

