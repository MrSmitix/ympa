package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MechanicsType;
import org.openapitools.model.PromoParticipationType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Фильтры для получения списка акций.
 */

@Schema(name = "GetPromosRequest", description = "Фильтры для получения списка акций.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromosRequest {

  private PromoParticipationType participation;

  private MechanicsType mechanics;

  public GetPromosRequest participation(PromoParticipationType participation) {
    this.participation = participation;
    return this;
  }

  /**
   * Get participation
   * @return participation
   */
  @Valid 
  @Schema(name = "participation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("participation")
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
   */
  @Valid 
  @Schema(name = "mechanics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

