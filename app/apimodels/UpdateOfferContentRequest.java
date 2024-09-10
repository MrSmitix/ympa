package apimodels;

import apimodels.OfferContentDTO;
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
 * Запрос на установку новых значений для параметров.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOfferContentRequest   {
  @JsonProperty("offersContent")
  @NotNull
@Size(min=1,max=100)
@Valid

  private List<@Valid OfferContentDTO> offersContent = new ArrayList<>();

  public UpdateOfferContentRequest offersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
    return this;
  }

  public UpdateOfferContentRequest addOffersContentItem(OfferContentDTO offersContentItem) {
    if (this.offersContent == null) {
      this.offersContent = new ArrayList<>();
    }
    this.offersContent.add(offersContentItem);
    return this;
  }

   /**
   * Список товаров с указанными характеристиками.
   * @return offersContent
  **/
  public List<@Valid OfferContentDTO> getOffersContent() {
    return offersContent;
  }

  public void setOffersContent(List<@Valid OfferContentDTO> offersContent) {
    this.offersContent = offersContent;
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
    return Objects.equals(offersContent, updateOfferContentRequest.offersContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offersContent);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

