package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageType;



/**
 * Параметры запроса категорий. 
 **/

@ApiModel(description = "Параметры запроса категорий. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCategoriesRequest   {
  @JsonProperty("language")
  private LanguageType language;

  /**
   **/
  public GetCategoriesRequest language(LanguageType language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("language")
  public LanguageType getLanguage() {
    return language;
  }
  public void setLanguage(LanguageType language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCategoriesRequest getCategoriesRequest = (GetCategoriesRequest) o;
    return Objects.equals(language, getCategoriesRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCategoriesRequest {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

