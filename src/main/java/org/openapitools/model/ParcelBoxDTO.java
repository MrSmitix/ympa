package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */

@Schema(name = "ParcelBoxDTO", description = "Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParcelBoxDTO {

  private Long id;

  private String fulfilmentId;

  public ParcelBoxDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   * @return id
   */
  
  @Schema(name = "id", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ParcelBoxDTO fulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   * @return fulfilmentId
   */
  @Pattern(regexp = "^[\\p{Alnum}- ]*$") 
  @Schema(name = "fulfilmentId", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fulfilmentId")
  public String getFulfilmentId() {
    return fulfilmentId;
  }

  public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParcelBoxDTO parcelBoxDTO = (ParcelBoxDTO) o;
    return Objects.equals(this.id, parcelBoxDTO.id) &&
        Objects.equals(this.fulfilmentId, parcelBoxDTO.fulfilmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fulfilmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelBoxDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fulfilmentId: ").append(toIndentedString(fulfilmentId)).append("\n");
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

