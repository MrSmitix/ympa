package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Информация об акции «Бестселлеры Маркета».
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoBestsellerInfoDTO   {
  
  private Boolean bestseller;
  private OffsetDateTime entryDeadline;

  public GetPromoBestsellerInfoDTO () {

  }

  public GetPromoBestsellerInfoDTO (Boolean bestseller, OffsetDateTime entryDeadline) {
    this.bestseller = bestseller;
    this.entryDeadline = entryDeadline;
  }

    
  @JsonProperty("bestseller")
  public Boolean getBestseller() {
    return bestseller;
  }
  public void setBestseller(Boolean bestseller) {
    this.bestseller = bestseller;
  }

    
  @JsonProperty("entryDeadline")
  public OffsetDateTime getEntryDeadline() {
    return entryDeadline;
  }
  public void setEntryDeadline(OffsetDateTime entryDeadline) {
    this.entryDeadline = entryDeadline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoBestsellerInfoDTO getPromoBestsellerInfoDTO = (GetPromoBestsellerInfoDTO) o;
    return Objects.equals(bestseller, getPromoBestsellerInfoDTO.bestseller) &&
        Objects.equals(entryDeadline, getPromoBestsellerInfoDTO.entryDeadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bestseller, entryDeadline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoBestsellerInfoDTO {\n");
    
    sb.append("    bestseller: ").append(toIndentedString(bestseller)).append("\n");
    sb.append("    entryDeadline: ").append(toIndentedString(entryDeadline)).append("\n");
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
