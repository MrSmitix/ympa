package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CalculatedTariffType;
import org.openapitools.server.model.TariffParameterDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об услугах Маркета.
 */
public class CalculatedTariffDTO   {

    private CalculatedTariffType type;
    private BigDecimal amount;
    private List<@Valid TariffParameterDTO> parameters = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CalculatedTariffDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CalculatedTariffDTO.
     *
     * @param type type
     * @param amount Стоимость услуги в рублях.
     * @param parameters Параметры расчета тарифа.
     */
    public CalculatedTariffDTO(
        CalculatedTariffType type, 
        BigDecimal amount, 
        List<@Valid TariffParameterDTO> parameters
    ) {
        this.type = type;
        this.amount = amount;
        this.parameters = parameters;
    }



    /**
     * Get type
     * @return type
     */
    public CalculatedTariffType getType() {
        return type;
    }

    public void setType(CalculatedTariffType type) {
        this.type = type;
    }

    /**
     * Стоимость услуги в рублях.
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
        sb.append("class CalculatedTariffDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

