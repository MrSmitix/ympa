package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о приложенных к сообщению файлах.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ChatMessagePayloadDTO   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("url")
  @NotNull

  private String url;

  @JsonProperty("size")
  @NotNull

  private Integer size;

  public ChatMessagePayloadDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Имя файла.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChatMessagePayloadDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Ссылка для скачивания файла.
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ChatMessagePayloadDTO size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Размер файла в байтах.
   * @return size
  **/
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
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
    return Objects.equals(name, chatMessagePayloadDTO.name) &&
        Objects.equals(url, chatMessagePayloadDTO.url) &&
        Objects.equals(size, chatMessagePayloadDTO.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, size);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

