package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Данные, необходимые для генерации отчета. 
 */

@Schema(name = "GenerateGoodsTurnoverRequest", description = "Данные, необходимые для генерации отчета. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateGoodsTurnoverRequest {

  private Long campaignId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date date;

  public GenerateGoodsTurnoverRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateGoodsTurnoverRequest(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsTurnoverRequest campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании.
   * @return campaignId
   */
  @NotNull 
  @Schema(name = "campaignId", description = "Идентификатор кампании.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GenerateGoodsTurnoverRequest date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
   * @return date
   */
  @Valid 
  @Schema(name = "date", description = "Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
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
    return Objects.equals(this.campaignId, generateGoodsTurnoverRequest.campaignId) &&
        Objects.equals(this.date, generateGoodsTurnoverRequest.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, date);
  }

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

