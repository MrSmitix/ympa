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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация об акции «Бестселлеры Маркета».
 */
@JsonPropertyOrder({
  GetPromoBestsellerInfoDTO.JSON_PROPERTY_BESTSELLER,
  GetPromoBestsellerInfoDTO.JSON_PROPERTY_ENTRY_DEADLINE
})
@JsonTypeName("GetPromoBestsellerInfoDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetPromoBestsellerInfoDTO {
    public static final String JSON_PROPERTY_BESTSELLER = "bestseller";
    private Boolean bestseller;

    public static final String JSON_PROPERTY_ENTRY_DEADLINE = "entryDeadline";
    private OffsetDateTime entryDeadline;

    public GetPromoBestsellerInfoDTO(Boolean bestseller) {
        this.bestseller = bestseller;
    }

    public GetPromoBestsellerInfoDTO bestseller(Boolean bestseller) {
        this.bestseller = bestseller;
        return this;
    }

    /**
     * Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
     * @return bestseller
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_BESTSELLER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Boolean getBestseller() {
        return bestseller;
    }

    @JsonProperty(JSON_PROPERTY_BESTSELLER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBestseller(Boolean bestseller) {
        this.bestseller = bestseller;
    }

    public GetPromoBestsellerInfoDTO entryDeadline(OffsetDateTime entryDeadline) {
        this.entryDeadline = entryDeadline;
        return this;
    }

    /**
     * До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
     * @return entryDeadline
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ENTRY_DEADLINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getEntryDeadline() {
        return entryDeadline;
    }

    @JsonProperty(JSON_PROPERTY_ENTRY_DEADLINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setEntryDeadline(OffsetDateTime entryDeadline) {
        this.entryDeadline = entryDeadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO = (GetPromoBestsellerInfoDTO) o;
        return Objects.equals(this.bestseller, getPromoBestsellerInfoDTO.bestseller) &&
            Objects.equals(this.entryDeadline, getPromoBestsellerInfoDTO.entryDeadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bestseller, entryDeadline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoBestsellerInfoDTO {\n");
        sb.append("    bestseller: ").append(toIndentedString(bestseller)).append("\n");
        sb.append("    entryDeadline: ").append(toIndentedString(entryDeadline)).append("\n");
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

