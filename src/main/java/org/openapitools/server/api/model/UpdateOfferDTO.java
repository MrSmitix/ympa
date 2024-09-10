package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AgeDTO;
import org.openapitools.server.api.model.BasePriceDTO;
import org.openapitools.server.api.model.OfferConditionDTO;
import org.openapitools.server.api.model.OfferManualDTO;
import org.openapitools.server.api.model.OfferParamDTO;
import org.openapitools.server.api.model.OfferType;
import org.openapitools.server.api.model.OfferWeightDimensionsDTO;
import org.openapitools.server.api.model.ParameterValueDTO;
import org.openapitools.server.api.model.TimePeriodDTO;
import org.openapitools.server.api.model.UpdatePriceWithDiscountDTO;

/**
 * Параметры товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferDTO   {
  
  private String offerId;
  private String name;
  private Long marketCategoryId;
  private String category;
  private List<String> pictures;
  private List<String> videos;
  private List<OfferManualDTO> manuals;
  private String vendor;
  private List<String> barcodes;
  private String description;
  private List<String> manufacturerCountries;
  private OfferWeightDimensionsDTO weightDimensions;
  private String vendorCode;
  private List<String> tags;
  private TimePeriodDTO shelfLife;
  private TimePeriodDTO lifeTime;
  private TimePeriodDTO guaranteePeriod;
  private String customsCommodityCode;
  private List<String> certificates;
  private Integer boxCount;
  private OfferConditionDTO condition;
  private OfferType type;
  private Boolean downloadable;
  private Boolean adult;
  private AgeDTO age;
  private List<OfferParamDTO> params;
  private List<ParameterValueDTO> parameterValues;
  private UpdatePriceWithDiscountDTO basicPrice;
  private BasePriceDTO purchasePrice;
  private BasePriceDTO additionalExpenses;
  private BasePriceDTO cofinancePrice;

  public UpdateOfferDTO () {

  }

  public UpdateOfferDTO (String offerId, String name, Long marketCategoryId, String category, List<String> pictures, List<String> videos, List<OfferManualDTO> manuals, String vendor, List<String> barcodes, String description, List<String> manufacturerCountries, OfferWeightDimensionsDTO weightDimensions, String vendorCode, List<String> tags, TimePeriodDTO shelfLife, TimePeriodDTO lifeTime, TimePeriodDTO guaranteePeriod, String customsCommodityCode, List<String> certificates, Integer boxCount, OfferConditionDTO condition, OfferType type, Boolean downloadable, Boolean adult, AgeDTO age, List<OfferParamDTO> params, List<ParameterValueDTO> parameterValues, UpdatePriceWithDiscountDTO basicPrice, BasePriceDTO purchasePrice, BasePriceDTO additionalExpenses, BasePriceDTO cofinancePrice) {
    this.offerId = offerId;
    this.name = name;
    this.marketCategoryId = marketCategoryId;
    this.category = category;
    this.pictures = pictures;
    this.videos = videos;
    this.manuals = manuals;
    this.vendor = vendor;
    this.barcodes = barcodes;
    this.description = description;
    this.manufacturerCountries = manufacturerCountries;
    this.weightDimensions = weightDimensions;
    this.vendorCode = vendorCode;
    this.tags = tags;
    this.shelfLife = shelfLife;
    this.lifeTime = lifeTime;
    this.guaranteePeriod = guaranteePeriod;
    this.customsCommodityCode = customsCommodityCode;
    this.certificates = certificates;
    this.boxCount = boxCount;
    this.condition = condition;
    this.type = type;
    this.downloadable = downloadable;
    this.adult = adult;
    this.age = age;
    this.params = params;
    this.parameterValues = parameterValues;
    this.basicPrice = basicPrice;
    this.purchasePrice = purchasePrice;
    this.additionalExpenses = additionalExpenses;
    this.cofinancePrice = cofinancePrice;
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

    
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

    
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

    
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }

    
  @JsonProperty("videos")
  public List<String> getVideos() {
    return videos;
  }
  public void setVideos(List<String> videos) {
    this.videos = videos;
  }

    
  @JsonProperty("manuals")
  public List<OfferManualDTO> getManuals() {
    return manuals;
  }
  public void setManuals(List<OfferManualDTO> manuals) {
    this.manuals = manuals;
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

    
  @JsonProperty("manufacturerCountries")
  public List<String> getManufacturerCountries() {
    return manufacturerCountries;
  }
  public void setManufacturerCountries(List<String> manufacturerCountries) {
    this.manufacturerCountries = manufacturerCountries;
  }

    
  @JsonProperty("weightDimensions")
  public OfferWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }
  public void setWeightDimensions(OfferWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

    
  @JsonProperty("vendorCode")
  public String getVendorCode() {
    return vendorCode;
  }
  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

    
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
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

    
  @JsonProperty("customsCommodityCode")
  public String getCustomsCommodityCode() {
    return customsCommodityCode;
  }
  public void setCustomsCommodityCode(String customsCommodityCode) {
    this.customsCommodityCode = customsCommodityCode;
  }

    
  @JsonProperty("certificates")
  public List<String> getCertificates() {
    return certificates;
  }
  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }

    
  @JsonProperty("boxCount")
  public Integer getBoxCount() {
    return boxCount;
  }
  public void setBoxCount(Integer boxCount) {
    this.boxCount = boxCount;
  }

    
  @JsonProperty("condition")
  public OfferConditionDTO getCondition() {
    return condition;
  }
  public void setCondition(OfferConditionDTO condition) {
    this.condition = condition;
  }

    
  @JsonProperty("type")
  public OfferType getType() {
    return type;
  }
  public void setType(OfferType type) {
    this.type = type;
  }

    
  @JsonProperty("downloadable")
  public Boolean getDownloadable() {
    return downloadable;
  }
  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }

    
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

    
  @JsonProperty("age")
  public AgeDTO getAge() {
    return age;
  }
  public void setAge(AgeDTO age) {
    this.age = age;
  }

    
  @JsonProperty("params")
  public List<OfferParamDTO> getParams() {
    return params;
  }
  public void setParams(List<OfferParamDTO> params) {
    this.params = params;
  }

    
  @JsonProperty("parameterValues")
  public List<ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

    
  @JsonProperty("basicPrice")
  public UpdatePriceWithDiscountDTO getBasicPrice() {
    return basicPrice;
  }
  public void setBasicPrice(UpdatePriceWithDiscountDTO basicPrice) {
    this.basicPrice = basicPrice;
  }

    
  @JsonProperty("purchasePrice")
  public BasePriceDTO getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(BasePriceDTO purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

    
  @JsonProperty("additionalExpenses")
  public BasePriceDTO getAdditionalExpenses() {
    return additionalExpenses;
  }
  public void setAdditionalExpenses(BasePriceDTO additionalExpenses) {
    this.additionalExpenses = additionalExpenses;
  }

    
  @JsonProperty("cofinancePrice")
  public BasePriceDTO getCofinancePrice() {
    return cofinancePrice;
  }
  public void setCofinancePrice(BasePriceDTO cofinancePrice) {
    this.cofinancePrice = cofinancePrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferDTO updateOfferDTO = (UpdateOfferDTO) o;
    return Objects.equals(offerId, updateOfferDTO.offerId) &&
        Objects.equals(name, updateOfferDTO.name) &&
        Objects.equals(marketCategoryId, updateOfferDTO.marketCategoryId) &&
        Objects.equals(category, updateOfferDTO.category) &&
        Objects.equals(pictures, updateOfferDTO.pictures) &&
        Objects.equals(videos, updateOfferDTO.videos) &&
        Objects.equals(manuals, updateOfferDTO.manuals) &&
        Objects.equals(vendor, updateOfferDTO.vendor) &&
        Objects.equals(barcodes, updateOfferDTO.barcodes) &&
        Objects.equals(description, updateOfferDTO.description) &&
        Objects.equals(manufacturerCountries, updateOfferDTO.manufacturerCountries) &&
        Objects.equals(weightDimensions, updateOfferDTO.weightDimensions) &&
        Objects.equals(vendorCode, updateOfferDTO.vendorCode) &&
        Objects.equals(tags, updateOfferDTO.tags) &&
        Objects.equals(shelfLife, updateOfferDTO.shelfLife) &&
        Objects.equals(lifeTime, updateOfferDTO.lifeTime) &&
        Objects.equals(guaranteePeriod, updateOfferDTO.guaranteePeriod) &&
        Objects.equals(customsCommodityCode, updateOfferDTO.customsCommodityCode) &&
        Objects.equals(certificates, updateOfferDTO.certificates) &&
        Objects.equals(boxCount, updateOfferDTO.boxCount) &&
        Objects.equals(condition, updateOfferDTO.condition) &&
        Objects.equals(type, updateOfferDTO.type) &&
        Objects.equals(downloadable, updateOfferDTO.downloadable) &&
        Objects.equals(adult, updateOfferDTO.adult) &&
        Objects.equals(age, updateOfferDTO.age) &&
        Objects.equals(params, updateOfferDTO.params) &&
        Objects.equals(parameterValues, updateOfferDTO.parameterValues) &&
        Objects.equals(basicPrice, updateOfferDTO.basicPrice) &&
        Objects.equals(purchasePrice, updateOfferDTO.purchasePrice) &&
        Objects.equals(additionalExpenses, updateOfferDTO.additionalExpenses) &&
        Objects.equals(cofinancePrice, updateOfferDTO.cofinancePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, name, marketCategoryId, category, pictures, videos, manuals, vendor, barcodes, description, manufacturerCountries, weightDimensions, vendorCode, tags, shelfLife, lifeTime, guaranteePeriod, customsCommodityCode, certificates, boxCount, condition, type, downloadable, adult, age, params, parameterValues, basicPrice, purchasePrice, additionalExpenses, cofinancePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
    sb.append("    manuals: ").append(toIndentedString(manuals)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    manufacturerCountries: ").append(toIndentedString(manufacturerCountries)).append("\n");
    sb.append("    weightDimensions: ").append(toIndentedString(weightDimensions)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    shelfLife: ").append(toIndentedString(shelfLife)).append("\n");
    sb.append("    lifeTime: ").append(toIndentedString(lifeTime)).append("\n");
    sb.append("    guaranteePeriod: ").append(toIndentedString(guaranteePeriod)).append("\n");
    sb.append("    customsCommodityCode: ").append(toIndentedString(customsCommodityCode)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    boxCount: ").append(toIndentedString(boxCount)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
    sb.append("    basicPrice: ").append(toIndentedString(basicPrice)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    additionalExpenses: ").append(toIndentedString(additionalExpenses)).append("\n");
    sb.append("    cofinancePrice: ").append(toIndentedString(cofinancePrice)).append("\n");
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
