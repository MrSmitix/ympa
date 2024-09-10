package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */
@ApiModel(description="Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.")

public class ParcelBoxDTO  {
  
 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
  private Long id;

 /**
  * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  */
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} ")
  private String fulfilmentId;
 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ParcelBoxDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  * @return fulfilmentId
  */
  @JsonProperty("fulfilmentId")
 @Pattern(regexp="^[\\p{Alnum}- ]*$")  public String getFulfilmentId() {
    return fulfilmentId;
  }

  /**
   * Sets the <code>fulfilmentId</code> property.
   */
 public void setFulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
  }

  /**
   * Sets the <code>fulfilmentId</code> property.
   */
  public ParcelBoxDTO fulfilmentId(String fulfilmentId) {
    this.fulfilmentId = fulfilmentId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

