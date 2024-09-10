package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.PaymentFrequencyType;
import org.openapitools.server.model.SellingProgramType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры для расчета стоимости услуг.
 */
public class CalculateTariffsParametersDTO   {

    private Long campaignId;
    private SellingProgramType sellingProgram;
    private PaymentFrequencyType frequency;

    /**
     * Default constructor.
     */
    public CalculateTariffsParametersDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculateTariffsParametersDTO.
     *
     * @param campaignId Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке. 
     * @param sellingProgram sellingProgram
     * @param frequency frequency
     */
    public CalculateTariffsParametersDTO(
        Long campaignId, 
        SellingProgramType sellingProgram, 
        PaymentFrequencyType frequency
    ) {
        this.campaignId = campaignId;
        this.sellingProgram = sellingProgram;
        this.frequency = frequency;
    }



    /**
     * Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Get sellingProgram
     * @return sellingProgram
     */
    public SellingProgramType getSellingProgram() {
        return sellingProgram;
    }

    public void setSellingProgram(SellingProgramType sellingProgram) {
        this.sellingProgram = sellingProgram;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public PaymentFrequencyType getFrequency() {
        return frequency;
    }

    public void setFrequency(PaymentFrequencyType frequency) {
        this.frequency = frequency;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CalculateTariffsParametersDTO {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    sellingProgram: ").append(toIndentedString(sellingProgram)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

