package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.MechanicsType;
import org.openapitools.server.api.model.PromoParticipationType;

/**
 * Фильтры для получения списка акций.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromosRequest   {
  
  private PromoParticipationType participation;
  private MechanicsType mechanics;

  public GetPromosRequest () {

  }

  public GetPromosRequest (PromoParticipationType participation, MechanicsType mechanics) {
    this.participation = participation;
    this.mechanics = mechanics;
  }

    
  @JsonProperty("participation")
  public PromoParticipationType getParticipation() {
    return participation;
  }
  public void setParticipation(PromoParticipationType participation) {
    this.participation = participation;
  }

    
  @JsonProperty("mechanics")
  public MechanicsType getMechanics() {
    return mechanics;
  }
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
    return Objects.equals(participation, getPromosRequest.participation) &&
        Objects.equals(mechanics, getPromosRequest.mechanics);
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
