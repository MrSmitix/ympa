package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferContentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос на установку новых значений для параметров.
 */
@ApiModel(description="Запрос на установку новых значений для параметров.")

public class UpdateOfferContentRequest  {
  
 /**
  * Список товаров с указанными характеристиками.
  */
  @ApiModelProperty(required = true, value = "Список товаров с указанными характеристиками.")
  @Valid
  private List<@Valid OfferContentDTO> offersContent = new ArrayList<>();
 /**
  * Список товаров с указанными характеристиками.
  * @return offersContent
  */
  @JsonProperty("offersContent")
  @NotNull
 @Size(min=1,max=100)  public List<@Valid OfferContentDTO> getOffersContent() {
    return offersContent;
  }

  /**
   * Sets the <code>offersContent</code> property.
   */
 public void setOffersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }

  /**
   * Sets the <code>offersContent</code> property.
   */
  public UpdateOfferContentRequest offersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
    return this;
  }

  /**
   * Adds a new item to the <code>offersContent</code> list.
   */
  public UpdateOfferContentRequest addOffersContentItem(OfferContentDTO offersContentItem) {
    this.offersContent.add(offersContentItem);
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferContentRequest updateOfferContentRequest = (UpdateOfferContentRequest) o;
    return Objects.equals(this.offersContent, updateOfferContentRequest.offersContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offersContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferContentRequest {\n");
    
    sb.append("    offersContent: ").append(toIndentedString(offersContent)).append("\n");
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

