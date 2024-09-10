package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ChannelType;
import org.openapitools.server.api.model.GetPromoAssortmentInfoDTO;
import org.openapitools.server.api.model.GetPromoBestsellerInfoDTO;
import org.openapitools.server.api.model.GetPromoConstraintsDTO;
import org.openapitools.server.api.model.GetPromoMechanicsInfoDTO;
import org.openapitools.server.api.model.PromoPeriodDTO;

/**
 * Информация об акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoDTO   {
  
  private String id;
  private String name;
  private PromoPeriodDTO period;
  private Boolean participating;
  private GetPromoAssortmentInfoDTO assortmentInfo;
  private GetPromoMechanicsInfoDTO mechanicsInfo;
  private GetPromoBestsellerInfoDTO bestsellerInfo;
  private List<ChannelType> channels;
  private GetPromoConstraintsDTO constraints;

  public GetPromoDTO () {

  }

  public GetPromoDTO (String id, String name, PromoPeriodDTO period, Boolean participating, GetPromoAssortmentInfoDTO assortmentInfo, GetPromoMechanicsInfoDTO mechanicsInfo, GetPromoBestsellerInfoDTO bestsellerInfo, List<ChannelType> channels, GetPromoConstraintsDTO constraints) {
    this.id = id;
    this.name = name;
    this.period = period;
    this.participating = participating;
    this.assortmentInfo = assortmentInfo;
    this.mechanicsInfo = mechanicsInfo;
    this.bestsellerInfo = bestsellerInfo;
    this.channels = channels;
    this.constraints = constraints;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("period")
  public PromoPeriodDTO getPeriod() {
    return period;
  }
  public void setPeriod(PromoPeriodDTO period) {
    this.period = period;
  }

    
  @JsonProperty("participating")
  public Boolean getParticipating() {
    return participating;
  }
  public void setParticipating(Boolean participating) {
    this.participating = participating;
  }

    
  @JsonProperty("assortmentInfo")
  public GetPromoAssortmentInfoDTO getAssortmentInfo() {
    return assortmentInfo;
  }
  public void setAssortmentInfo(GetPromoAssortmentInfoDTO assortmentInfo) {
    this.assortmentInfo = assortmentInfo;
  }

    
  @JsonProperty("mechanicsInfo")
  public GetPromoMechanicsInfoDTO getMechanicsInfo() {
    return mechanicsInfo;
  }
  public void setMechanicsInfo(GetPromoMechanicsInfoDTO mechanicsInfo) {
    this.mechanicsInfo = mechanicsInfo;
  }

    
  @JsonProperty("bestsellerInfo")
  public GetPromoBestsellerInfoDTO getBestsellerInfo() {
    return bestsellerInfo;
  }
  public void setBestsellerInfo(GetPromoBestsellerInfoDTO bestsellerInfo) {
    this.bestsellerInfo = bestsellerInfo;
  }

    
  @JsonProperty("channels")
  public List<ChannelType> getChannels() {
    return channels;
  }
  public void setChannels(List<ChannelType> channels) {
    this.channels = channels;
  }

    
  @JsonProperty("constraints")
  public GetPromoConstraintsDTO getConstraints() {
    return constraints;
  }
  public void setConstraints(GetPromoConstraintsDTO constraints) {
    this.constraints = constraints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoDTO getPromoDTO = (GetPromoDTO) o;
    return Objects.equals(id, getPromoDTO.id) &&
        Objects.equals(name, getPromoDTO.name) &&
        Objects.equals(period, getPromoDTO.period) &&
        Objects.equals(participating, getPromoDTO.participating) &&
        Objects.equals(assortmentInfo, getPromoDTO.assortmentInfo) &&
        Objects.equals(mechanicsInfo, getPromoDTO.mechanicsInfo) &&
        Objects.equals(bestsellerInfo, getPromoDTO.bestsellerInfo) &&
        Objects.equals(channels, getPromoDTO.channels) &&
        Objects.equals(constraints, getPromoDTO.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, period, participating, assortmentInfo, mechanicsInfo, bestsellerInfo, channels, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    participating: ").append(toIndentedString(participating)).append("\n");
    sb.append("    assortmentInfo: ").append(toIndentedString(assortmentInfo)).append("\n");
    sb.append("    mechanicsInfo: ").append(toIndentedString(mechanicsInfo)).append("\n");
    sb.append("    bestsellerInfo: ").append(toIndentedString(bestsellerInfo)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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
