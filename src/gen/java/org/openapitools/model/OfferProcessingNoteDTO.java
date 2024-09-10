package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferProcessingNoteType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Причины, по которым товар не прошел модерацию.
 **/
@ApiModel(description="Причины, по которым товар не прошел модерацию.")

public class OfferProcessingNoteDTO  {
  
  @ApiModelProperty(value = "")
  private OfferProcessingNoteType type;

  @ApiModelProperty(value = "Дополнительная информация о причине отклонения товара. ")
 /**
   * Дополнительная информация о причине отклонения товара. 
  **/
  private String payload;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OfferProcessingNoteType getType() {
    return type;
  }

  public void setType(OfferProcessingNoteType type) {
    this.type = type;
  }

  public OfferProcessingNoteDTO type(OfferProcessingNoteType type) {
    this.type = type;
    return this;
  }

 /**
   * Дополнительная информация о причине отклонения товара. 
   * @return payload
  **/
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public OfferProcessingNoteDTO payload(String payload) {
    this.payload = payload;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

