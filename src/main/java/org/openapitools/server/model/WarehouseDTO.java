package org.openapitools.server.model;

import org.openapitools.server.model.WarehouseAddressDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о складе.
 */
public class WarehouseDTO   {

    private Long id;
    private String name;
    private Long campaignId;
    private Boolean express;
    private WarehouseAddressDTO address;

    /**
     * Default constructor.
     */
    public WarehouseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehouseDTO.
     *
     * @param id Идентификатор склада.
     * @param name Название склада.
     * @param campaignId Идентификатор кампании в API и идентификатор магазина.
     * @param express Возможна ли доставка по модели Экспресс.
     * @param address address
     */
    public WarehouseDTO(
        Long id, 
        String name, 
        Long campaignId, 
        Boolean express, 
        WarehouseAddressDTO address
    ) {
        this.id = id;
        this.name = name;
        this.campaignId = campaignId;
        this.express = express;
        this.address = address;
    }



    /**
     * Идентификатор склада.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название склада.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Идентификатор кампании в API и идентификатор магазина.
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Возможна ли доставка по модели Экспресс.
     * @return express
     */
    public Boolean getExpress() {
        return express;
    }

    public void setExpress(Boolean express) {
        this.express = express;
    }

    /**
     * Get address
     * @return address
     */
    public WarehouseAddressDTO getAddress() {
        return address;
    }

    public void setAddress(WarehouseAddressDTO address) {
        this.address = address;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarehouseDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    express: ").append(toIndentedString(express)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

