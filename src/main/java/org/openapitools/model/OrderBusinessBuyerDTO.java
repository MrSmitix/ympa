package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о покупателе. 
 */

@Schema(name = "OrderBusinessBuyerDTO", description = "Информация о покупателе. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBusinessBuyerDTO {

  private String inn;

  private String kpp;

  private String organizationName;

  private String organizationJurAddress;

  public OrderBusinessBuyerDTO inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * ИНН.
   * @return inn
   */
  
  @Schema(name = "inn", description = "ИНН.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inn")
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public OrderBusinessBuyerDTO kpp(String kpp) {
    this.kpp = kpp;
    return this;
  }

  /**
   * КПП.
   * @return kpp
   */
  
  @Schema(name = "kpp", description = "КПП.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kpp")
  public String getKpp() {
    return kpp;
  }

  public void setKpp(String kpp) {
    this.kpp = kpp;
  }

  public OrderBusinessBuyerDTO organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * Наименование юридического лица.
   * @return organizationName
   */
  
  @Schema(name = "organizationName", description = "Наименование юридического лица.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationName")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public OrderBusinessBuyerDTO organizationJurAddress(String organizationJurAddress) {
    this.organizationJurAddress = organizationJurAddress;
    return this;
  }

  /**
   * Юридический адрес.
   * @return organizationJurAddress
   */
  
  @Schema(name = "organizationJurAddress", description = "Юридический адрес.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.inn, orderBusinessBuyerDTO.inn) &&
        Objects.equals(this.kpp, orderBusinessBuyerDTO.kpp) &&
        Objects.equals(this.organizationName, orderBusinessBuyerDTO.organizationName) &&
        Objects.equals(this.organizationJurAddress, orderBusinessBuyerDTO.organizationJurAddress);
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

