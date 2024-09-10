package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DocumentDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о документах. 
 */

@Schema(name = "OrderBusinessDocumentsDTO", description = "Информация о документах. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBusinessDocumentsDTO {

  private DocumentDTO upd;

  private DocumentDTO ukd;

  private DocumentDTO torgTwelve;

  private DocumentDTO sf;

  private DocumentDTO ksf;

  public OrderBusinessDocumentsDTO upd(DocumentDTO upd) {
    this.upd = upd;
    return this;
  }

  /**
   * Get upd
   * @return upd
   */
  @Valid 
  @Schema(name = "upd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("upd")
  public DocumentDTO getUpd() {
    return upd;
  }

  public void setUpd(DocumentDTO upd) {
    this.upd = upd;
  }

  public OrderBusinessDocumentsDTO ukd(DocumentDTO ukd) {
    this.ukd = ukd;
    return this;
  }

  /**
   * Get ukd
   * @return ukd
   */
  @Valid 
  @Schema(name = "ukd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ukd")
  public DocumentDTO getUkd() {
    return ukd;
  }

  public void setUkd(DocumentDTO ukd) {
    this.ukd = ukd;
  }

  public OrderBusinessDocumentsDTO torgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
    return this;
  }

  /**
   * Get torgTwelve
   * @return torgTwelve
   */
  @Valid 
  @Schema(name = "torgTwelve", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("torgTwelve")
  public DocumentDTO getTorgTwelve() {
    return torgTwelve;
  }

  public void setTorgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
  }

  public OrderBusinessDocumentsDTO sf(DocumentDTO sf) {
    this.sf = sf;
    return this;
  }

  /**
   * Get sf
   * @return sf
   */
  @Valid 
  @Schema(name = "sf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sf")
  public DocumentDTO getSf() {
    return sf;
  }

  public void setSf(DocumentDTO sf) {
    this.sf = sf;
  }

  public OrderBusinessDocumentsDTO ksf(DocumentDTO ksf) {
    this.ksf = ksf;
    return this;
  }

  /**
   * Get ksf
   * @return ksf
   */
  @Valid 
  @Schema(name = "ksf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ksf")
  public DocumentDTO getKsf() {
    return ksf;
  }

  public void setKsf(DocumentDTO ksf) {
    this.ksf = ksf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBusinessDocumentsDTO orderBusinessDocumentsDTO = (OrderBusinessDocumentsDTO) o;
    return Objects.equals(this.upd, orderBusinessDocumentsDTO.upd) &&
        Objects.equals(this.ukd, orderBusinessDocumentsDTO.ukd) &&
        Objects.equals(this.torgTwelve, orderBusinessDocumentsDTO.torgTwelve) &&
        Objects.equals(this.sf, orderBusinessDocumentsDTO.sf) &&
        Objects.equals(this.ksf, orderBusinessDocumentsDTO.ksf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upd, ukd, torgTwelve, sf, ksf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBusinessDocumentsDTO {\n");
    sb.append("    upd: ").append(toIndentedString(upd)).append("\n");
    sb.append("    ukd: ").append(toIndentedString(ukd)).append("\n");
    sb.append("    torgTwelve: ").append(toIndentedString(torgTwelve)).append("\n");
    sb.append("    sf: ").append(toIndentedString(sf)).append("\n");
    sb.append("    ksf: ").append(toIndentedString(ksf)).append("\n");
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

