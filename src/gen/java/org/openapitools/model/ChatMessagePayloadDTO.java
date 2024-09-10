package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о приложенных к сообщению файлах.
 **/
@ApiModel(description="Информация о приложенных к сообщению файлах.")

public class ChatMessagePayloadDTO  {
  
  @ApiModelProperty(required = true, value = "Имя файла.")
 /**
   * Имя файла.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "Ссылка для скачивания файла.")
 /**
   * Ссылка для скачивания файла.
  **/
  private String url;

  @ApiModelProperty(required = true, value = "Размер файла в байтах.")
 /**
   * Размер файла в байтах.
  **/
  private Integer size;
 /**
   * Имя файла.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatMessagePayloadDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Ссылка для скачивания файла.
   * @return url
  **/
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ChatMessagePayloadDTO url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Размер файла в байтах.
   * @return size
  **/
  @JsonProperty("size")
  @NotNull
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

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

