package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о новой дате доставки заказа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderDeliveryDateDTO   {
  @JsonProperty("toDate")
  @NotNull
@Valid

  private LocalDate toDate;

  public OrderDeliveryDateDTO toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return toDate
  **/
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryDateDTO orderDeliveryDateDTO = (OrderDeliveryDateDTO) o;
    return Objects.equals(toDate, orderDeliveryDateDTO.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryDateDTO {\n");
    
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

