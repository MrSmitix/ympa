package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о приложенных к сообщению файлах.
 */
@ApiModel(description="Информация о приложенных к сообщению файлах.")

public class ChatMessagePayloadDTO  {
  
 /**
  * Имя файла.
  */
  @ApiModelProperty(required = true, value = "Имя файла.")
  private String name;

 /**
  * Ссылка для скачивания файла.
  */
  @ApiModelProperty(required = true, value = "Ссылка для скачивания файла.")
  private String url;

 /**
  * Размер файла в байтах.
  */
  @ApiModelProperty(required = true, value = "Размер файла в байтах.")
  private Integer size;
 /**
  * Имя файла.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ChatMessagePayloadDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Ссылка для скачивания файла.
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public ChatMessagePayloadDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Размер файла в байтах.
  * @return size
  */
  @JsonProperty("size")
  @NotNull
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public ChatMessagePayloadDTO size(Integer size) {
    this.size = size;
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
    ChatMessagePayloadDTO chatMessagePayloadDTO = (ChatMessagePayloadDTO) o;
    return Objects.equals(this.name, chatMessagePayloadDTO.name) &&
        Objects.equals(this.url, chatMessagePayloadDTO.url) &&
        Objects.equals(this.size, chatMessagePayloadDTO.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMessagePayloadDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

