package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BasePriceDTO;

/**
 * Информация о товаре.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuggestedOfferDTO   {
  
  private String offerId;
  private String name;
  private String category;
  private String vendor;
  private List<String> barcodes;
  private String description;
  private String vendorCode;
  private BasePriceDTO basicPrice;

  public SuggestedOfferDTO () {

  }

  public SuggestedOfferDTO (String offerId, String name, String category, String vendor, List<String> barcodes, String description, String vendorCode, BasePriceDTO basicPrice) {
    this.offerId = offerId;
    this.name = name;
    this.category = category;
    this.vendor = vendor;
    this.barcodes = barcodes;
    this.description = description;
    this.vendorCode = vendorCode;
    this.basicPrice = basicPrice;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

    
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }
  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

    
  @JsonProperty("barcodes")
  public List<String> getBarcodes() {
    return barcodes;
  }
  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }
  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

    
  @JsonProperty("basicPrice")
  public BasePriceDTO getBasicPrice() {
    return basicPrice;
  }
  public void setBasicPrice(BasePriceDTO basicPrice) {
    this.basicPrice = basicPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedOfferDTO suggestedOfferDTO = (SuggestedOfferDTO) o;
    return Objects.equals(offerId, suggestedOfferDTO.offerId) &&
        Objects.equals(name, suggestedOfferDTO.name) &&
        Objects.equals(category, suggestedOfferDTO.category) &&
        Objects.equals(vendor, suggestedOfferDTO.vendor) &&
        Objects.equals(barcodes, suggestedOfferDTO.barcodes) &&
        Objects.equals(description, suggestedOfferDTO.description) &&
        Objects.equals(vendorCode, suggestedOfferDTO.vendorCode) &&
        Objects.equals(basicPrice, suggestedOfferDTO.basicPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, name, category, vendor, barcodes, description, vendorCode, basicPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    basicPrice: ").append(toIndentedString(basicPrice)).append("\n");
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
