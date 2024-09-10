package apimodels;

import apimodels.DocumentDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о документах. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderBusinessDocumentsDTO   {
  @JsonProperty("upd")
  @Valid

  private DocumentDTO upd;

  @JsonProperty("ukd")
  @Valid

  private DocumentDTO ukd;

  @JsonProperty("torgTwelve")
  @Valid

  private DocumentDTO torgTwelve;

  @JsonProperty("sf")
  @Valid

  private DocumentDTO sf;

  @JsonProperty("ksf")
  @Valid

  private DocumentDTO ksf;

  public OrderBusinessDocumentsDTO upd(DocumentDTO upd) {
    this.upd = upd;
    return this;
  }

   /**
   * Get upd
   * @return upd
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(upd, orderBusinessDocumentsDTO.upd) &&
        Objects.equals(ukd, orderBusinessDocumentsDTO.ukd) &&
        Objects.equals(torgTwelve, orderBusinessDocumentsDTO.torgTwelve) &&
        Objects.equals(sf, orderBusinessDocumentsDTO.sf) &&
        Objects.equals(ksf, orderBusinessDocumentsDTO.ksf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upd, ukd, torgTwelve, sf, ksf);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

