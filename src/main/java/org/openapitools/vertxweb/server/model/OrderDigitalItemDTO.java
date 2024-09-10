package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * Ключ цифрового товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDigitalItemDTO   {
  
  private Long id;
  private String code;
  private String slip;
  private LocalDate activateTill;

  public OrderDigitalItemDTO () {

  }

  public OrderDigitalItemDTO (Long id, String code, String slip, LocalDate activateTill) {
    this.id = id;
    this.code = code;
    this.slip = slip;
    this.activateTill = activateTill;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

    
  @JsonProperty("slip")
  public String getSlip() {
    return slip;
  }
  public void setSlip(String slip) {
    this.slip = slip;
  }

    
  @JsonProperty("activate_till")
  public LocalDate getActivateTill() {
    return activateTill;
  }
  public void setActivateTill(LocalDate activateTill) {
    this.activateTill = activateTill;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDigitalItemDTO orderDigitalItemDTO = (OrderDigitalItemDTO) o;
    return Objects.equals(id, orderDigitalItemDTO.id) &&
        Objects.equals(code, orderDigitalItemDTO.code) &&
        Objects.equals(slip, orderDigitalItemDTO.slip) &&
        Objects.equals(activateTill, orderDigitalItemDTO.activateTill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, slip, activateTill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDigitalItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    slip: ").append(toIndentedString(slip)).append("\n");
    sb.append("    activateTill: ").append(toIndentedString(activateTill)).append("\n");
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
