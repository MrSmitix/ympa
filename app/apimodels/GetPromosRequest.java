package apimodels;

import apimodels.MechanicsType;
import apimodels.PromoParticipationType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Фильтры для получения списка акций.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromosRequest   {
  @JsonProperty("participation")
  @Valid

  private PromoParticipationType participation;

  @JsonProperty("mechanics")
  @Valid

  private MechanicsType mechanics;

  public GetPromosRequest participation(PromoParticipationType participation) {
    this.participation = participation;
    return this;
  }

   /**
   * Get participation
   * @return participation
  **/
  public PromoParticipationType getParticipation() {
    return participation;
  }

  public void setParticipation(PromoParticipationType participation) {
    this.participation = participation;
  }

  public GetPromosRequest mechanics(MechanicsType mechanics) {
    this.mechanics = mechanics;
    return this;
  }

   /**
   * Get mechanics
   * @return mechanics
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

