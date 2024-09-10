package apimodels;

import apimodels.UpdateOfferMappingEntryDTO;
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
 * Запрос на обновление товаров.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOfferMappingEntryRequest   {
  @JsonProperty("offerMappingEntries")
  @NotNull
@Size(min=1,max=500)
@Valid

  private List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  public UpdateOfferMappingEntryRequest offerMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
    return this;
  }

  public UpdateOfferMappingEntryRequest addOfferMappingEntriesItem(UpdateOfferMappingEntryDTO offerMappingEntriesItem) {
    if (this.offerMappingEntries == null) {
      this.offerMappingEntries = new ArrayList<>();
    }
    this.offerMappingEntries.add(offerMappingEntriesItem);
    return this;
  }

   /**
   * Информация о товарах в каталоге.
   * @return offerMappingEntries
  **/
  public List<@Valid UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }

  public void setOfferMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = (UpdateOfferMappingEntryRequest) o;
    return Objects.equals(offerMappingEntries, updateOfferMappingEntryRequest.offerMappingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappingEntries);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingEntryRequest {\n");
    
    sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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

