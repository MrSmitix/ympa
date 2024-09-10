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
import org.openapitools.model.CampaignDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о магазине к данным идентификатора кампании.
 */
@JsonPropertyOrder({
  GetCampaignResponse.JSON_PROPERTY_CAMPAIGN
})
@JsonTypeName("GetCampaignResponse")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class GetCampaignResponse {
    public static final String JSON_PROPERTY_CAMPAIGN = "campaign";
    private CampaignDTO campaign;

    public GetCampaignResponse() {
    }

    public GetCampaignResponse campaign(CampaignDTO campaign) {
        this.campaign = campaign;
        return this;
    }

    /**
     * Get campaign
     * @return campaign
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_CAMPAIGN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CampaignDTO getCampaign() {
        return campaign;
    }

    @JsonProperty(JSON_PROPERTY_CAMPAIGN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCampaign(CampaignDTO campaign) {
        this.campaign = campaign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCampaignResponse getCampaignResponse = (GetCampaignResponse) o;
        return Objects.equals(this.campaign, getCampaignResponse.campaign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignResponse {\n");
        sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

