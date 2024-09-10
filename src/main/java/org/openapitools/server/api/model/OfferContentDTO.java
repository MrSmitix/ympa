package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ParameterValueDTO;

/**
 * Товар с указанными характеристиками.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferContentDTO   {
  
  private String offerId;
  private Integer categoryId;
  private List<ParameterValueDTO> parameterValues = new ArrayList<>();

  public OfferContentDTO () {

  }

  public OfferContentDTO (String offerId, Integer categoryId, List<ParameterValueDTO> parameterValues) {
    this.offerId = offerId;
    this.categoryId = categoryId;
    this.parameterValues = parameterValues;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

    
  @JsonProperty("parameterValues")
  public List<ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferContentDTO offerContentDTO = (OfferContentDTO) o;
    return Objects.equals(offerId, offerContentDTO.offerId) &&
        Objects.equals(categoryId, offerContentDTO.categoryId) &&
        Objects.equals(parameterValues, offerContentDTO.parameterValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, categoryId, parameterValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferContentDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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
