package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MechanicsType;
import org.openapitools.model.PromoParticipationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Фильтры для получения списка акций.
 **/
@ApiModel(description = "Фильтры для получения списка акций.")
@JsonTypeName("GetPromosRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromosRequest   {
  private PromoParticipationType participation;
  private MechanicsType mechanics;

  /**
   **/
  public GetPromosRequest participation(PromoParticipationType participation) {
    this.participation = participation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("participation")
  public PromoParticipationType getParticipation() {
    return participation;
  }

  @JsonProperty("participation")
  public void setParticipation(PromoParticipationType participation) {
    this.participation = participation;
  }

  /**
   **/
  public GetPromosRequest mechanics(MechanicsType mechanics) {
    this.mechanics = mechanics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mechanics")
  public MechanicsType getMechanics() {
    return mechanics;
  }

  @JsonProperty("mechanics")
  public void setMechanics(MechanicsType mechanics) {
    this.mechanics = mechanics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromosRequest getPromosRequest = (GetPromosRequest) o;
    return Objects.equals(this.participation, getPromosRequest.participation) &&
        Objects.equals(this.mechanics, getPromosRequest.mechanics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participation, mechanics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromosRequest {\n");
    
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    mechanics: ").append(toIndentedString(mechanics)).append("\n");
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

