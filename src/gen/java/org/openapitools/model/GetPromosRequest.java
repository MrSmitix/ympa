package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.MechanicsType;
import org.openapitools.model.PromoParticipationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Фильтры для получения списка акций.
 */
@ApiModel(description="Фильтры для получения списка акций.")

public class GetPromosRequest  {
  
  @ApiModelProperty(value = "")
  @Valid
  private PromoParticipationType participation;

  @ApiModelProperty(value = "")
  @Valid
  private MechanicsType mechanics;
 /**
  * Get participation
  * @return participation
  */
  @JsonProperty("participation")
  public PromoParticipationType getParticipation() {
    return participation;
  }

  /**
   * Sets the <code>participation</code> property.
   */
 public void setParticipation(PromoParticipationType participation) {
    this.participation = participation;
  }

  /**
   * Sets the <code>participation</code> property.
   */
  public GetPromosRequest participation(PromoParticipationType participation) {
    this.participation = participation;
    return this;
  }

 /**
  * Get mechanics
  * @return mechanics
  */
  @JsonProperty("mechanics")
  public MechanicsType getMechanics() {
    return mechanics;
  }

  /**
   * Sets the <code>mechanics</code> property.
   */
 public void setMechanics(MechanicsType mechanics) {
    this.mechanics = mechanics;
  }

  /**
   * Sets the <code>mechanics</code> property.
   */
  public GetPromosRequest mechanics(MechanicsType mechanics) {
    this.mechanics = mechanics;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

