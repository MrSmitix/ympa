package apimodels;

import apimodels.FlippingPagerDTO;
import apimodels.FullOutletDTO;
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
 * Ответ на запрос информации о точках продаж.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOutletsResponse   {
  @JsonProperty("outlets")
  @NotNull
@Valid

  private List<@Valid FullOutletDTO> outlets = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ScrollingPagerDTO paging;

  @JsonProperty("pager")
  @Valid

  private FlippingPagerDTO pager;

  public GetOutletsResponse outlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
    return this;
  }

  public GetOutletsResponse addOutletsItem(FullOutletDTO outletsItem) {
    if (this.outlets == null) {
      this.outlets = new ArrayList<>();
    }
    this.outlets.add(outletsItem);
    return this;
  }

   /**
   * Информация о точках продаж.
   * @return outlets
  **/
  public List<@Valid FullOutletDTO> getOutlets() {
    return outlets;
  }

  public void setOutlets(List<@Valid FullOutletDTO> outlets) {
    this.outlets = outlets;
  }

  public GetOutletsResponse paging(ScrollingPagerDTO paging) {
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

  public GetOutletsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

   /**
   * Get pager
   * @return pager
  **/
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOutletsResponse getOutletsResponse = (GetOutletsResponse) o;
    return Objects.equals(outlets, getOutletsResponse.outlets) &&
        Objects.equals(paging, getOutletsResponse.paging) &&
        Objects.equals(pager, getOutletsResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlets, paging, pager);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOutletsResponse {\n");
    
    sb.append("    outlets: ").append(toIndentedString(outlets)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

