package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TariffParameterDTO;
import org.openapitools.server.model.TariffType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 */
public class TariffDTO   {

    private TariffType type;
    private BigDecimal percent;
    private BigDecimal amount;
    private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TariffDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create TariffDTO.
     *
     * @param type type
     * @param percent {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
     * @param amount Значение тарифа в рублях.
     * @param parameters Параметры расчета тарифа.
     */
    public TariffDTO(
        TariffType type, 
        BigDecimal percent, 
        BigDecimal amount, 
        List<@Valid TariffParameterDTO> parameters
    ) {
        this.type = type;
        this.percent = percent;
        this.amount = amount;
        this.parameters = parameters;
    }



    /**
     * Get type
     * @return type
     */
    public TariffType getType() {
        return type;
    }

    public void setType(TariffType type) {
        this.type = type;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
     * @return percent
     */
    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /**
     * Значение тарифа в рублях.
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Параметры расчета тарифа.
     * @return parameters
     */
    public List<@Valid TariffParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<@Valid TariffParameterDTO> parameters) {
        this.parameters = parameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TariffDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

