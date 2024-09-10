package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeliveryServiceInfoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о службах доставки.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DeliveryServicesDTO   {
  
  private List<@Valid DeliveryServiceInfoDTO> deliveryService = new ArrayList<>();

  /**
   * Информация о службе доставки.
   **/
  
  @ApiModelProperty(required = true, value = "Информация о службе доставки.")
  @JsonProperty("deliveryService")
  @NotNull
  @Valid
  public List<@Valid DeliveryServiceInfoDTO> getDeliveryService() {
    return deliveryService;
  }
  public void setDeliveryService(List<@Valid DeliveryServiceInfoDTO> deliveryService) {
    this.deliveryService = deliveryService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryServicesDTO deliveryServicesDTO = (DeliveryServicesDTO) o;
    return Objects.equals(this.deliveryService, deliveryServicesDTO.deliveryService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryServicesDTO {\n");
    
    sb.append("    deliveryService: ").append(toIndentedString(deliveryService)).append("\n");
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

