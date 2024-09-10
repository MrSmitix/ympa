package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.LogisticPointType;
import org.openapitools.server.model.PickupAddressDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Описание пункта вывоза для возврата.
 */
public class LogisticPickupPointDTO   {

    private Long id;
    private String name;
    private PickupAddressDTO address;
    private String instruction;
    private LogisticPointType type;
    private Long logisticPartnerId;

    /**
     * Default constructor.
     */
    public LogisticPickupPointDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create LogisticPickupPointDTO.
     *
     * @param id Идентификатор пункта вывоза.
     * @param name Название пункта вывоза.
     * @param address address
     * @param instruction Дополнительные инструкции к вывозу.
     * @param type type
     * @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.
     */
    public LogisticPickupPointDTO(
        Long id, 
        String name, 
        PickupAddressDTO address, 
        String instruction, 
        LogisticPointType type, 
        Long logisticPartnerId
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.instruction = instruction;
        this.type = type;
        this.logisticPartnerId = logisticPartnerId;
    }



    /**
     * Идентификатор пункта вывоза.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название пункта вывоза.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address
     * @return address
     */
    public PickupAddressDTO getAddress() {
        return address;
    }

    public void setAddress(PickupAddressDTO address) {
        this.address = address;
    }

    /**
     * Дополнительные инструкции к вывозу.
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Get type
     * @return type
     */
    public LogisticPointType getType() {
        return type;
    }

    public void setType(LogisticPointType type) {
        this.type = type;
    }

    /**
     * Идентификатор логистического партнера, к которому относится логистическая точка.
     * @return logisticPartnerId
     */
    public Long getLogisticPartnerId() {
        return logisticPartnerId;
    }

    public void setLogisticPartnerId(Long logisticPartnerId) {
        this.logisticPartnerId = logisticPartnerId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogisticPickupPointDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    logisticPartnerId: ").append(toIndentedString(logisticPartnerId)).append("\n");
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

