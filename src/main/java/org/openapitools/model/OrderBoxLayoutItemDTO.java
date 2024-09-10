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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BriefOrderItemInstanceDTO;
import org.openapitools.model.OrderBoxLayoutPartialCountDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Информация о товаре в коробке.
 */
@Schema(name = "OrderBoxLayoutItemDTO", description = "Информация о товаре в коробке.")
@JsonPropertyOrder({
  OrderBoxLayoutItemDTO.JSON_PROPERTY_ID,
  OrderBoxLayoutItemDTO.JSON_PROPERTY_FULL_COUNT,
  OrderBoxLayoutItemDTO.JSON_PROPERTY_PARTIAL_COUNT,
  OrderBoxLayoutItemDTO.JSON_PROPERTY_INSTANCES
})
@JsonTypeName("OrderBoxLayoutItemDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OrderBoxLayoutItemDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_FULL_COUNT = "fullCount";
    private Integer fullCount;

    public static final String JSON_PROPERTY_PARTIAL_COUNT = "partialCount";
    private OrderBoxLayoutPartialCountDTO partialCount;

    public static final String JSON_PROPERTY_INSTANCES = "instances";
    private List<@Valid BriefOrderItemInstanceDTO> instances = null;

    public OrderBoxLayoutItemDTO(Long id) {
        this.id = id;
    }

    public OrderBoxLayoutItemDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}   
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   ", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(Long id) {
        this.id = id;
    }

    public OrderBoxLayoutItemDTO fullCount(Integer fullCount) {
        this.fullCount = fullCount;
        return this;
    }

    /**
     * Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;. 
     * minimum: 1
     * @return fullCount
     */
    @Nullable
    @Min(1)
    @Schema(name = "fullCount", description = "Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FULL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getFullCount() {
        return fullCount;
    }

    @JsonProperty(JSON_PROPERTY_FULL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFullCount(Integer fullCount) {
        this.fullCount = fullCount;
    }

    public OrderBoxLayoutItemDTO partialCount(OrderBoxLayoutPartialCountDTO partialCount) {
        this.partialCount = partialCount;
        return this;
    }

    /**
     * Get partialCount
     * @return partialCount
     */
    @Valid
    @Nullable
    @Schema(name = "partialCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PARTIAL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OrderBoxLayoutPartialCountDTO getPartialCount() {
        return partialCount;
    }

    @JsonProperty(JSON_PROPERTY_PARTIAL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPartialCount(OrderBoxLayoutPartialCountDTO partialCount) {
        this.partialCount = partialCount;
    }

    public OrderBoxLayoutItemDTO instances(List<@Valid BriefOrderItemInstanceDTO> instances) {
        this.instances = instances;
        return this;
    }

    public OrderBoxLayoutItemDTO addInstancesItem(BriefOrderItemInstanceDTO instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Переданные вами коды маркировки.
     * @return instances
     */
    @Nullable
    @Schema(name = "instances", description = "Переданные вами коды маркировки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid BriefOrderItemInstanceDTO> getInstances() {
        return instances;
    }

    @JsonProperty(JSON_PROPERTY_INSTANCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInstances(List<@Valid BriefOrderItemInstanceDTO> instances) {
        this.instances = instances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderBoxLayoutItemDTO orderBoxLayoutItemDTO = (OrderBoxLayoutItemDTO) o;
        return Objects.equals(this.id, orderBoxLayoutItemDTO.id) &&
            Objects.equals(this.fullCount, orderBoxLayoutItemDTO.fullCount) &&
            Objects.equals(this.partialCount, orderBoxLayoutItemDTO.partialCount) &&
            Objects.equals(this.instances, orderBoxLayoutItemDTO.instances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullCount, partialCount, instances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBoxLayoutItemDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fullCount: ").append(toIndentedString(fullCount)).append("\n");
        sb.append("    partialCount: ").append(toIndentedString(partialCount)).append("\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

