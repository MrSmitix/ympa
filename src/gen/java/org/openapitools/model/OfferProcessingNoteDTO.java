package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferProcessingNoteType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Причины, по которым товар не прошел модерацию.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Причины, по которым товар не прошел модерацию.")
public class OfferProcessingNoteDTO   {
  
  private OfferProcessingNoteType type;

  private String payload;

  /**
   **/
  public OfferProcessingNoteDTO type(OfferProcessingNoteType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OfferProcessingNoteType getType() {
    return type;
  }
  public void setType(OfferProcessingNoteType type) {
    this.type = type;
  }


  /**
   * Дополнительная информация о причине отклонения товара. 
   **/
  public OfferProcessingNoteDTO payload(String payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(value = "Дополнительная информация о причине отклонения товара. ")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferProcessingNoteDTO offerProcessingNoteDTO = (OfferProcessingNoteDTO) o;
    return Objects.equals(this.type, offerProcessingNoteDTO.type) &&
        Objects.equals(this.payload, offerProcessingNoteDTO.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferProcessingNoteDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

