package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DocumentDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о документах. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о документах. ")
public class OrderBusinessDocumentsDTO   {
  
  private DocumentDTO upd;

  private DocumentDTO ukd;

  private DocumentDTO torgTwelve;

  private DocumentDTO sf;

  private DocumentDTO ksf;

  /**
   **/
  public OrderBusinessDocumentsDTO upd(DocumentDTO upd) {
    this.upd = upd;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("upd")
  public DocumentDTO getUpd() {
    return upd;
  }
  public void setUpd(DocumentDTO upd) {
    this.upd = upd;
  }


  /**
   **/
  public OrderBusinessDocumentsDTO ukd(DocumentDTO ukd) {
    this.ukd = ukd;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ukd")
  public DocumentDTO getUkd() {
    return ukd;
  }
  public void setUkd(DocumentDTO ukd) {
    this.ukd = ukd;
  }


  /**
   **/
  public OrderBusinessDocumentsDTO torgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("torgTwelve")
  public DocumentDTO getTorgTwelve() {
    return torgTwelve;
  }
  public void setTorgTwelve(DocumentDTO torgTwelve) {
    this.torgTwelve = torgTwelve;
  }


  /**
   **/
  public OrderBusinessDocumentsDTO sf(DocumentDTO sf) {
    this.sf = sf;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sf")
  public DocumentDTO getSf() {
    return sf;
  }
  public void setSf(DocumentDTO sf) {
    this.sf = sf;
  }


  /**
   **/
  public OrderBusinessDocumentsDTO ksf(DocumentDTO ksf) {
    this.ksf = ksf;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

