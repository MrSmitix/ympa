package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о покупателе. 
 */
public class OrderBusinessBuyerDTO   {

    private String inn;
    private String kpp;
    private String organizationName;
    private String organizationJurAddress;

    /**
     * Default constructor.
     */
    public OrderBusinessBuyerDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBusinessBuyerDTO.
     *
     * @param inn ИНН.
     * @param kpp КПП.
     * @param organizationName Наименование юридического лица.
     * @param organizationJurAddress Юридический адрес.
     */
    public OrderBusinessBuyerDTO(
        String inn, 
        String kpp, 
        String organizationName, 
        String organizationJurAddress
    ) {
        this.inn = inn;
        this.kpp = kpp;
        this.organizationName = organizationName;
        this.organizationJurAddress = organizationJurAddress;
    }



    /**
     * ИНН.
     * @return inn
     */
    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    /**
     * КПП.
     * @return kpp
     */
    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    /**
     * Наименование юридического лица.
     * @return organizationName
     */
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * Юридический адрес.
     * @return organizationJurAddress
     */
    public String getOrganizationJurAddress() {
        return organizationJurAddress;
    }

    public void setOrganizationJurAddress(String organizationJurAddress) {
        this.organizationJurAddress = organizationJurAddress;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBusinessBuyerDTO {\n");
        
        sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
        sb.append("    kpp: ").append(toIndentedString(kpp)).append("\n");
        sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
        sb.append("    organizationJurAddress: ").append(toIndentedString(organizationJurAddress)).append("\n");
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

