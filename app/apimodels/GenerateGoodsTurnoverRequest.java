package apimodels;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Данные, необходимые для генерации отчета. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GenerateGoodsTurnoverRequest   {
  @JsonProperty("campaignId")
  @NotNull

  private Long campaignId;

  @JsonProperty("date")
  @Valid

  private LocalDate date;

  public GenerateGoodsTurnoverRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Идентификатор кампании.
   * @return campaignId
  **/
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsTurnoverRequest date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
   * @return date
  **/
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = (GenerateGoodsTurnoverRequest) o;
    return Objects.equals(campaignId, generateGoodsTurnoverRequest.campaignId) &&
        Objects.equals(date, generateGoodsTurnoverRequest.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, date);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateGoodsTurnoverRequest {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

