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
import org.openapitools.model.FeedDownloadErrorType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
 */
@Schema(name = "FeedDownloadErrorDTO", description = "Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. ")
@JsonPropertyOrder({
  FeedDownloadErrorDTO.JSON_PROPERTY_HTTP_STATUS_CODE,
  FeedDownloadErrorDTO.JSON_PROPERTY_TYPE,
  FeedDownloadErrorDTO.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("FeedDownloadErrorDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class FeedDownloadErrorDTO {
    public static final String JSON_PROPERTY_HTTP_STATUS_CODE = "httpStatusCode";
    private Integer httpStatusCode;

    public static final String JSON_PROPERTY_TYPE = "type";
    private FeedDownloadErrorType type;

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public FeedDownloadErrorDTO() {
    }

    public FeedDownloadErrorDTO httpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }

    /**
     * HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;. 
     * @return httpStatusCode
     */
    @Nullable
    @Schema(name = "httpStatusCode", description = "HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public FeedDownloadErrorDTO type(FeedDownloadErrorType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Nullable
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public FeedDownloadErrorType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(FeedDownloadErrorType type) {
        this.type = type;
    }

    public FeedDownloadErrorDTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;. 
     * @return description
     */
    @Nullable
    @Schema(name = "description", description = "Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeedDownloadErrorDTO feedDownloadErrorDTO = (FeedDownloadErrorDTO) o;
        return Objects.equals(this.httpStatusCode, feedDownloadErrorDTO.httpStatusCode) &&
            Objects.equals(this.type, feedDownloadErrorDTO.type) &&
            Objects.equals(this.description, feedDownloadErrorDTO.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpStatusCode, type, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedDownloadErrorDTO {\n");
        sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

