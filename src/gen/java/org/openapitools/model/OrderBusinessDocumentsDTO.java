package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.DocumentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о документах. 
 */
@ApiModel(description="Информация о документах. ")

public class OrderBusinessDocumentsDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private DocumentDTO upd;

  @ApiModelProperty(value = "")
  @Valid
  private DocumentDTO ukd;

  @ApiModelProperty(value = "")
  @Valid
  private DocumentDTO torgTwelve;

  @ApiModelProperty(value = "")
  @Valid
  private DocumentDTO sf;

  @ApiModelProperty(value = "")
  @Valid
  private DocumentDTO ksf;
 /**
  * Get upd
  * @return upd
  */
  @JsonProperty("upd")
  public DocumentDTO getUpd() {
    return upd;
  }

  /**
   * Sets the <code>upd</code> property.
   */
 public void setUpd(DocumentDTO upd) {
    this.upd = upd;
  }

  /**
   * Sets the <code>upd</code> property.
   */
  public OrderBusinessDocumentsDTO upd(DocumentDTO upd) {
    this.upd = upd;
    return this;
  }

 /**
  * Get ukd
  * @return ukd
  */
  @JsonProperty("ukd")
  public DocumentDTO getUkd() {
    return ukd;
  }

  /**
   * Sets the <code>ukd</code> property.
   */
 public void setUkd(DocumentDTO ukd) {
    this.ukd = ukd;
  }

  /**
   * Sets the <code>ukd</code> property.
   */
  public OrderBusinessDocumentsDTO ukd(DocumentDTO ukd) {
    this.ukd = ukd;
    return this;
  }

 /**
  * Get torgTwelve
  * @return torgTwelve
  */
  @JsonProperty("torgTwelve")
  public DocumentDTO getTorgTwelve() {
    return torgTwelve;
  }

  /**
   * Sets the <code>torgTwelve</code> property.
   */
 public void setTorgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
  }

  /**
   * Sets the <code>torgTwelve</code> property.
   */
  public OrderBusinessDocumentsDTO torgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
    return this;
  }

 /**
  * Get sf
  * @return sf
  */
  @JsonProperty("sf")
  public DocumentDTO getSf() {
    return sf;
  }

  /**
   * Sets the <code>sf</code> property.
   */
 public void setSf(DocumentDTO sf) {
    this.sf = sf;
  }

  /**
   * Sets the <code>sf</code> property.
   */
  public OrderBusinessDocumentsDTO sf(DocumentDTO sf) {
    this.sf = sf;
    return this;
  }

 /**
  * Get ksf
  * @return ksf
  */
  @JsonProperty("ksf")
  public DocumentDTO getKsf() {
    return ksf;
  }

  /**
   * Sets the <code>ksf</code> property.
   */
 public void setKsf(DocumentDTO ksf) {
    this.ksf = ksf;
  }

  /**
   * Sets the <code>ksf</code> property.
   */
  public OrderBusinessDocumentsDTO ksf(DocumentDTO ksf) {
    this.ksf = ksf;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

