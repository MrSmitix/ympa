package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Параметры запроса категорий. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Параметры запроса категорий. ")
public class GetCategoriesRequest   {
  
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
    return Objects.equals(this.language, getCategoriesRequest.language);
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

