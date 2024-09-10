package apimodels;

import apimodels.GetOfferMappingDTO;
import apimodels.ScrollingPagerDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о товарах.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOfferMappingsResultDTO   {
  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("offerMappings")
  @NotNull
@Valid

  private List<@Valid GetOfferMappingDTO> offerMappings = new ArrayList<>();

  public GetOfferMappingsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetOfferMappingsResultDTO offerMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  public GetOfferMappingsResultDTO addOfferMappingsItem(GetOfferMappingDTO offerMappingsItem) {
    if (this.offerMappings == null) {
      this.offerMappings = new ArrayList<>();
    }
    this.offerMappings.add(offerMappingsItem);
    return this;
  }

   /**
   * Информация о товарах.
   * @return offerMappings
  **/
  public List<@Valid GetOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  public void setOfferMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferMappingsResultDTO getOfferMappingsResultDTO = (GetOfferMappingsResultDTO) o;
    return Objects.equals(paging, getOfferMappingsResultDTO.paging) &&
        Objects.equals(offerMappings, getOfferMappingsResultDTO.offerMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerMappings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferMappingsResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
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

