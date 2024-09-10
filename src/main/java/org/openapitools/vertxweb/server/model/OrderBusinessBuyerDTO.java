package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о покупателе. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderBusinessBuyerDTO   {
  
  private String inn;
  private String kpp;
  private String organizationName;
  private String organizationJurAddress;

  public OrderBusinessBuyerDTO () {

  }

  public OrderBusinessBuyerDTO (String inn, String kpp, String organizationName, String organizationJurAddress) {
    this.inn = inn;
    this.kpp = kpp;
    this.organizationName = organizationName;
    this.organizationJurAddress = organizationJurAddress;
  }

    
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }
  public void setInn(String inn) {
    this.inn = inn;
  }

    
  @JsonProperty("kpp")
  public String getKpp() {
    return kpp;
  }
  public void setKpp(String kpp) {
    this.kpp = kpp;
  }

    
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }
  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

    
  @JsonProperty("organizationJurAddress")
  public String getOrganizationJurAddress() {
    return organizationJurAddress;
  }
  public void setOrganizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBusinessBuyerDTO orderBusinessBuyerDTO = (OrderBusinessBuyerDTO) o;
    return Objects.equals(inn, orderBusinessBuyerDTO.inn) &&
        Objects.equals(kpp, orderBusinessBuyerDTO.kpp) &&
        Objects.equals(organizationName, orderBusinessBuyerDTO.organizationName) &&
        Objects.equals(organizationJurAddress, orderBusinessBuyerDTO.organizationJurAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inn, kpp, organizationName, organizationJurAddress);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
