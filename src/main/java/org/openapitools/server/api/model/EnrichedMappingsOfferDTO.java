package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.DayOfWeekType;
import org.openapitools.server.api.model.OfferAvailabilityStatusType;
import org.openapitools.server.api.model.OfferProcessingStateDTO;
import org.openapitools.server.api.model.OfferWeightDimensionsDTO;
import org.openapitools.server.api.model.TimePeriodDTO;

/**
 * Информация о рекомендованных карточках товаров.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnrichedMappingsOfferDTO   {
  
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
  private BigDecimal price;
  private Long marketCategoryId;
  private String marketCategoryName;
  private Long marketModelId;
  private String marketModelName;
  private Long marketSku;
  private String marketSkuName;

  public EnrichedMappingsOfferDTO () {

  }

  public EnrichedMappingsOfferDTO (String name, String shopSku, String category, String vendor, String vendorCode, String description, String id, Long feedId, List<String> barcodes, List<String> urls, List<String> pictures, String manufacturer, List<String> manufacturerCountries, Integer minShipment, Integer transportUnitSize, Integer quantumOfSupply, Integer deliveryDurationDays, Integer boxCount, List<String> customsCommodityCodes, OfferWeightDimensionsDTO weightDimensions, List<DayOfWeekType> supplyScheduleDays, Integer shelfLifeDays, Integer lifeTimeDays, Integer guaranteePeriodDays, OfferProcessingStateDTO processingState, OfferAvailabilityStatusType availability, TimePeriodDTO shelfLife, TimePeriodDTO lifeTime, TimePeriodDTO guaranteePeriod, String certificate, BigDecimal price, Long marketCategoryId, String marketCategoryName, Long marketModelId, String marketModelName, Long marketSku, String marketSkuName) {
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
    this.price = price;
    this.marketCategoryId = marketCategoryId;
    this.marketCategoryName = marketCategoryName;
    this.marketModelId = marketModelId;
    this.marketModelName = marketModelName;
    this.marketSku = marketSku;
    this.marketSkuName = marketSkuName;
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

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

    
  @JsonProperty("marketCategoryName")
  public String getMarketCategoryName() {
    return marketCategoryName;
  }
  public void setMarketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
  }

    
  @JsonProperty("marketModelId")
  public Long getMarketModelId() {
    return marketModelId;
  }
  public void setMarketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
  }

    
  @JsonProperty("marketModelName")
  public String getMarketModelName() {
    return marketModelName;
  }
  public void setMarketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("marketSkuName")
  public String getMarketSkuName() {
    return marketSkuName;
  }
  public void setMarketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichedMappingsOfferDTO enrichedMappingsOfferDTO = (EnrichedMappingsOfferDTO) o;
    return Objects.equals(name, enrichedMappingsOfferDTO.name) &&
        Objects.equals(shopSku, enrichedMappingsOfferDTO.shopSku) &&
        Objects.equals(category, enrichedMappingsOfferDTO.category) &&
        Objects.equals(vendor, enrichedMappingsOfferDTO.vendor) &&
        Objects.equals(vendorCode, enrichedMappingsOfferDTO.vendorCode) &&
        Objects.equals(description, enrichedMappingsOfferDTO.description) &&
        Objects.equals(id, enrichedMappingsOfferDTO.id) &&
        Objects.equals(feedId, enrichedMappingsOfferDTO.feedId) &&
        Objects.equals(barcodes, enrichedMappingsOfferDTO.barcodes) &&
        Objects.equals(urls, enrichedMappingsOfferDTO.urls) &&
        Objects.equals(pictures, enrichedMappingsOfferDTO.pictures) &&
        Objects.equals(manufacturer, enrichedMappingsOfferDTO.manufacturer) &&
        Objects.equals(manufacturerCountries, enrichedMappingsOfferDTO.manufacturerCountries) &&
        Objects.equals(minShipment, enrichedMappingsOfferDTO.minShipment) &&
        Objects.equals(transportUnitSize, enrichedMappingsOfferDTO.transportUnitSize) &&
        Objects.equals(quantumOfSupply, enrichedMappingsOfferDTO.quantumOfSupply) &&
        Objects.equals(deliveryDurationDays, enrichedMappingsOfferDTO.deliveryDurationDays) &&
        Objects.equals(boxCount, enrichedMappingsOfferDTO.boxCount) &&
        Objects.equals(customsCommodityCodes, enrichedMappingsOfferDTO.customsCommodityCodes) &&
        Objects.equals(weightDimensions, enrichedMappingsOfferDTO.weightDimensions) &&
        Objects.equals(supplyScheduleDays, enrichedMappingsOfferDTO.supplyScheduleDays) &&
        Objects.equals(shelfLifeDays, enrichedMappingsOfferDTO.shelfLifeDays) &&
        Objects.equals(lifeTimeDays, enrichedMappingsOfferDTO.lifeTimeDays) &&
        Objects.equals(guaranteePeriodDays, enrichedMappingsOfferDTO.guaranteePeriodDays) &&
        Objects.equals(processingState, enrichedMappingsOfferDTO.processingState) &&
        Objects.equals(availability, enrichedMappingsOfferDTO.availability) &&
        Objects.equals(shelfLife, enrichedMappingsOfferDTO.shelfLife) &&
        Objects.equals(lifeTime, enrichedMappingsOfferDTO.lifeTime) &&
        Objects.equals(guaranteePeriod, enrichedMappingsOfferDTO.guaranteePeriod) &&
        Objects.equals(certificate, enrichedMappingsOfferDTO.certificate) &&
        Objects.equals(price, enrichedMappingsOfferDTO.price) &&
        Objects.equals(marketCategoryId, enrichedMappingsOfferDTO.marketCategoryId) &&
        Objects.equals(marketCategoryName, enrichedMappingsOfferDTO.marketCategoryName) &&
        Objects.equals(marketModelId, enrichedMappingsOfferDTO.marketModelId) &&
        Objects.equals(marketModelName, enrichedMappingsOfferDTO.marketModelName) &&
        Objects.equals(marketSku, enrichedMappingsOfferDTO.marketSku) &&
        Objects.equals(marketSkuName, enrichedMappingsOfferDTO.marketSkuName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shopSku, category, vendor, vendorCode, description, id, feedId, barcodes, urls, pictures, manufacturer, manufacturerCountries, minShipment, transportUnitSize, quantumOfSupply, deliveryDurationDays, boxCount, customsCommodityCodes, weightDimensions, supplyScheduleDays, shelfLifeDays, lifeTimeDays, guaranteePeriodDays, processingState, availability, shelfLife, lifeTime, guaranteePeriod, certificate, price, marketCategoryId, marketCategoryName, marketModelId, marketModelName, marketSku, marketSkuName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichedMappingsOfferDTO {\n");
    
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
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    marketCategoryName: ").append(toIndentedString(marketCategoryName)).append("\n");
    sb.append("    marketModelId: ").append(toIndentedString(marketModelId)).append("\n");
    sb.append("    marketModelName: ").append(toIndentedString(marketModelName)).append("\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    marketSkuName: ").append(toIndentedString(marketSkuName)).append("\n");
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
