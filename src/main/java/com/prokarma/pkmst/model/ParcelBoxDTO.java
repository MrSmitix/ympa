package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */
@ApiModel(description = "Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParcelBoxDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("fulfilmentId")
  private String fulfilmentId;

  public ParcelBoxDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
   * @return id
   */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
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
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
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

