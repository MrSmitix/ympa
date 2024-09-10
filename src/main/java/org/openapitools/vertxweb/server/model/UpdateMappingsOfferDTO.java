package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.DayOfWeekType;
import org.openapitools.vertxweb.server.model.OfferAvailabilityStatusType;
import org.openapitools.vertxweb.server.model.OfferProcessingStateDTO;
import org.openapitools.vertxweb.server.model.OfferWeightDimensionsDTO;
import org.openapitools.vertxweb.server.model.TimePeriodDTO;

/**
 * Информация о товарах в каталоге.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateMappingsOfferDTO   {
  
  private String name;
  private String shopSku;
  private String category;
  private String vendor;
  private String vendorCode;
  private String description;
  private String id;
  private Long feedId;
  private List<String> barcodes;
  private List<String> urls;
  private List<String> pictures;
  private String manufacturer;
  private List<String> manufacturerCountries;
  private Integer minShipment;
  private Integer transportUnitSize;
  private Integer quantumOfSupply;
  private Integer deliveryDurationDays;
  private Integer boxCount;
  private List<String> customsCommodityCodes;
  private OfferWeightDimensionsDTO weightDimensions;
  private List<DayOfWeekType> supplyScheduleDays;
  private Integer shelfLifeDays;
  private Integer lifeTimeDays;
  private Integer guaranteePeriodDays;
  private OfferProcessingStateDTO processingState;
  private OfferAvailabilityStatusType availability;
  private TimePeriodDTO shelfLife;
  private TimePeriodDTO lifeTime;
  private TimePeriodDTO guaranteePeriod;
  private String certificate;

  public UpdateMappingsOfferDTO () {

  }

  public UpdateMappingsOfferDTO (String name, String shopSku, String category, String vendor, String vendorCode, String description, String id, Long feedId, List<String> barcodes, List<String> urls, List<String> pictures, String manufacturer, List<String> manufacturerCountries, Integer minShipment, Integer transportUnitSize, Integer quantumOfSupply, Integer deliveryDurationDays, Integer boxCount, List<String> customsCommodityCodes, OfferWeightDimensionsDTO weightDimensions, List<DayOfWeekType> supplyScheduleDays, Integer shelfLifeDays, Integer lifeTimeDays, Integer guaranteePeriodDays, OfferProcessingStateDTO processingState, OfferAvailabilityStatusType availability, TimePeriodDTO shelfLife, TimePeriodDTO lifeTime, TimePeriodDTO guaranteePeriod, String certificate) {
    this.name = name;
    this.shopSku = shopSku;
    this.category = category;
    this.vendor = vendor;
    this.vendorCode = vendorCode;
    this.description = description;
    this.id = id;
    this.feedId = feedId;
    this.barcodes = barcodes;
    this.urls = urls;
    this.pictures = pictures;
    this.manufacturer = manufacturer;
    this.manufacturerCountries = manufacturerCountries;
    this.minShipment = minShipment;
    this.transportUnitSize = transportUnitSize;
    this.quantumOfSupply = quantumOfSupply;
    this.deliveryDurationDays = deliveryDurationDays;
    this.boxCount = boxCount;
    this.customsCommodityCodes = customsCommodityCodes;
    this.weightDimensions = weightDimensions;
    this.supplyScheduleDays = supplyScheduleDays;
    this.shelfLifeDays = shelfLifeDays;
    this.lifeTimeDays = lifeTimeDays;
    this.guaranteePeriodDays = guaranteePeriodDays;
    this.processingState = processingState;
    this.availability = availability;
    this.shelfLife = shelfLife;
    this.lifeTime = lifeTime;
    this.guaranteePeriod = guaranteePeriod;
    this.certificate = certificate;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
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

    
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }
  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("feedId")
  public Long getFeedId() {
    return feedId;
  }
  public void setFeedId(Long feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("barcodes")
  public List<String> getBarcodes() {
    return barcodes;
  }
  public void setBarcodes(List<String> barcodes) {
    this.barcodes = barcodes;
  }

    
  @JsonProperty("urls")
  public List<String> getUrls() {
    return urls;
  }
  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

    
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

    
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

    
  @JsonProperty("manufacturerCountries")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }
  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

    
  @JsonProperty("minShipment")
  public Integer getMinShipment() {
    return minShipment;
  }
  public void setMinShipment(Integer minShipment) {
    this.minShipment = minShipment;
  }

    
  @JsonProperty("transportUnitSize")
  public Integer getTransportUnitSize() {
    return transportUnitSize;
  }
  public void setTransportUnitSize(Integer transportUnitSize) {
    this.transportUnitSize = transportUnitSize;
  }

    
  @JsonProperty("quantumOfSupply")
  public Integer getQuantumOfSupply() {
    return quantumOfSupply;
  }
  public void setQuantumOfSupply(Integer quantumOfSupply) {
    this.quantumOfSupply = quantumOfSupply;
  }

    
  @JsonProperty("deliveryDurationDays")
  public Integer getDeliveryDurationDays() {
    return deliveryDurationDays;
  }
  public void setDeliveryDurationDays(Integer deliveryDurationDays) {
    this.deliveryDurationDays = deliveryDurationDays;
  }

    
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }
  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

    
  @JsonProperty("customsCommodityCodes")
  public List<String> getCustomsCommodityCodes() {
    return customsCommodityCodes;
  }
  public void setCustomsCommodityCodes(List<String> customsCommodityCodes) {
    this.customsCommodityCodes = customsCommodityCodes;
  }

    
  @JsonProperty("weightDimensions")
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }
  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

    
  @JsonProperty("supplyScheduleDays")
  public List<DayOfWeekType> getSupplyScheduleDays() {
    return supplyScheduleDays;
  }
  public void setSupplyScheduleDays(List<DayOfWeekType> supplyScheduleDays) {
    this.supplyScheduleDays = supplyScheduleDays;
  }

    
  @JsonProperty("shelfLifeDays")
  public Integer getShelfLifeDays() {
    return shelfLifeDays;
  }
  public void setShelfLifeDays(Integer shelfLifeDays) {
    this.shelfLifeDays = shelfLifeDays;
  }

    
  @JsonProperty("lifeTimeDays")
  public Integer getLifeTimeDays() {
    return lifeTimeDays;
  }
  public void setLifeTimeDays(Integer lifeTimeDays) {
    this.lifeTimeDays = lifeTimeDays;
  }

    
  @JsonProperty("guaranteePeriodDays")
  public Integer getGuaranteePeriodDays() {
    return guaranteePeriodDays;
  }
  public void setGuaranteePeriodDays(Integer guaranteePeriodDays) {
    this.guaranteePeriodDays = guaranteePeriodDays;
  }

    
  @JsonProperty("processingState")
  public OfferProcessingStateDTO getProcessingState() {
    return processingState;
  }
  public void setProcessingState(OfferProcessingStateDTO processingState) {
    this.processingState = processingState;
  }

    
  @JsonProperty("availability")
  public OfferAvailabilityStatusType getAvailability() {
    return availability;
  }
  public void setAvailability(OfferAvailabilityStatusType availability) {
    this.availability = availability;
  }

    
  @JsonProperty("shelfLife")
  public TimePeriodDTO getShelfLife() {
    return shelfLife;
  }
  public void setShelfLife(TimePeriodDTO shelfLife) {
    this.shelfLife = shelfLife;
  }

    
  @JsonProperty("lifeTime")
  public TimePeriodDTO getLifeTime() {
    return lifeTime;
  }
  public void setLifeTime(TimePeriodDTO lifeTime) {
    this.lifeTime = lifeTime;
  }

    
  @JsonProperty("guaranteePeriod")
  public TimePeriodDTO getGuaranteePeriod() {
    return guaranteePeriod;
  }
  public void setGuaranteePeriod(TimePeriodDTO guaranteePeriod) {
    this.guaranteePeriod = guaranteePeriod;
  }

    
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMappingsOfferDTO updateMappingsOfferDTO = (UpdateMappingsOfferDTO) o;
    return Objects.equals(name, updateMappingsOfferDTO.name) &&
        Objects.equals(shopSku, updateMappingsOfferDTO.shopSku) &&
        Objects.equals(category, updateMappingsOfferDTO.category) &&
        Objects.equals(vendor, updateMappingsOfferDTO.vendor) &&
        Objects.equals(vendorCode, updateMappingsOfferDTO.vendorCode) &&
        Objects.equals(description, updateMappingsOfferDTO.description) &&
        Objects.equals(id, updateMappingsOfferDTO.id) &&
        Objects.equals(feedId, updateMappingsOfferDTO.feedId) &&
        Objects.equals(barcodes, updateMappingsOfferDTO.barcodes) &&
        Objects.equals(urls, updateMappingsOfferDTO.urls) &&
        Objects.equals(pictures, updateMappingsOfferDTO.pictures) &&
        Objects.equals(manufacturer, updateMappingsOfferDTO.manufacturer) &&
        Objects.equals(manufacturerCountries, updateMappingsOfferDTO.manufacturerCountries) &&
        Objects.equals(minShipment, updateMappingsOfferDTO.minShipment) &&
        Objects.equals(transportUnitSize, updateMappingsOfferDTO.transportUnitSize) &&
        Objects.equals(quantumOfSupply, updateMappingsOfferDTO.quantumOfSupply) &&
        Objects.equals(deliveryDurationDays, updateMappingsOfferDTO.deliveryDurationDays) &&
        Objects.equals(boxCount, updateMappingsOfferDTO.boxCount) &&
        Objects.equals(customsCommodityCodes, updateMappingsOfferDTO.customsCommodityCodes) &&
        Objects.equals(weightDimensions, updateMappingsOfferDTO.weightDimensions) &&
        Objects.equals(supplyScheduleDays, updateMappingsOfferDTO.supplyScheduleDays) &&
        Objects.equals(shelfLifeDays, updateMappingsOfferDTO.shelfLifeDays) &&
        Objects.equals(lifeTimeDays, updateMappingsOfferDTO.lifeTimeDays) &&
        Objects.equals(guaranteePeriodDays, updateMappingsOfferDTO.guaranteePeriodDays) &&
        Objects.equals(processingState, updateMappingsOfferDTO.processingState) &&
        Objects.equals(availability, updateMappingsOfferDTO.availability) &&
        Objects.equals(shelfLife, updateMappingsOfferDTO.shelfLife) &&
        Objects.equals(lifeTime, updateMappingsOfferDTO.lifeTime) &&
        Objects.equals(guaranteePeriod, updateMappingsOfferDTO.guaranteePeriod) &&
        Objects.equals(certificate, updateMappingsOfferDTO.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMappingsOfferDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerCountries: ").append(toIndentedString(manufacturerCountries)).append("\n");
    sb.append("    minShipment: ").append(toIndentedString(minShipment)).append("\n");
    sb.append("    transportUnitSize: ").append(toIndentedString(transportUnitSize)).append("\n");
    sb.append("    quantumOfSupply: ").append(toIndentedString(quantumOfSupply)).append("\n");
    sb.append("    deliveryDurationDays: ").append(toIndentedString(deliveryDurationDays)).append("\n");
    sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
    sb.append("    customsCommodityCodes: ").append(toIndentedString(customsCommodityCodes)).append("\n");
    sb.append("    weightDimensions: ").append(toIndentedString(weightDimensions)).append("\n");
    sb.append("    supplyScheduleDays: ").append(toIndentedString(supplyScheduleDays)).append("\n");
    sb.append("    shelfLifeDays: ").append(toIndentedString(shelfLifeDays)).append("\n");
    sb.append("    lifeTimeDays: ").append(toIndentedString(lifeTimeDays)).append("\n");
    sb.append("    guaranteePeriodDays: ").append(toIndentedString(guaranteePeriodDays)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    shelfLife: ").append(toIndentedString(shelfLife)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    guaranteePeriod: ").append(toIndentedString(guaranteePeriod)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
