package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferContentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос на установку новых значений для параметров.
 **/
@ApiModel(description = "Запрос на установку новых значений для параметров.")
@JsonTypeName("UpdateOfferContentRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOfferContentRequest   {
  private @Valid List<@Valid OfferContentDTO> offersContent = new ArrayList<>();

  /**
   * Список товаров с указанными характеристиками.
   **/
  public UpdateOfferContentRequest offersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров с указанными характеристиками.")
  @JsonProperty("offersContent")
  @NotNull @Valid  @Size(min=1,max=100)public List<@Valid OfferContentDTO> getOffersContent() {
    return offersContent;
  }

  @JsonProperty("offersContent")
  public void setOffersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
  }

  public UpdateOfferContentRequest addOffersContentItem(OfferContentDTO offersContentItem) {
    if (this.offersContent == null) {
      this.offersContent = new ArrayList<>();
    }

    this.offersContent.add(offersContentItem);
    return this;
  }

  public UpdateOfferContentRequest removeOffersContentItem(OfferContentDTO offersContentItem) {
    if (offersContentItem != null && this.offersContent != null) {
      this.offersContent.remove(offersContentItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

