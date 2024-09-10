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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о страницах результатов.
 */
@JsonPropertyOrder({
  ScrollingPagerDTO.JSON_PROPERTY_NEXT_PAGE_TOKEN,
  ScrollingPagerDTO.JSON_PROPERTY_PREV_PAGE_TOKEN
})
@JsonTypeName("ScrollingPagerDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class ScrollingPagerDTO {
    public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "nextPageToken";
    private String nextPageToken;

    public static final String JSON_PROPERTY_PREV_PAGE_TOKEN = "prevPageToken";
    private String prevPageToken;

    public ScrollingPagerDTO() {
    }

    public ScrollingPagerDTO nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * Идентификатор следующей страницы результатов.
     * @return nextPageToken
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNextPageToken() {
        return nextPageToken;
    }

    @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public ScrollingPagerDTO prevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
        return this;
    }

    /**
     * Идентификатор предыдущей страницы результатов.
     * @return prevPageToken
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PREV_PAGE_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPrevPageToken() {
        return prevPageToken;
    }

    @JsonProperty(JSON_PROPERTY_PREV_PAGE_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScrollingPagerDTO scrollingPagerDTO = (ScrollingPagerDTO) o;
        return Objects.equals(this.nextPageToken, scrollingPagerDTO.nextPageToken) &&
            Objects.equals(this.prevPageToken, scrollingPagerDTO.prevPageToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextPageToken, prevPageToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrollingPagerDTO {\n");
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
        sb.append("    prevPageToken: ").append(toIndentedString(prevPageToken)).append("\n");
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

