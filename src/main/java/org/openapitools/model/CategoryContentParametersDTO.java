package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryParameterDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о параметрах категории.
 */

@Schema(name = "CategoryContentParametersDTO", description = "Информация о параметрах категории.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CategoryContentParametersDTO {

  private Integer categoryId;

  @Valid
  private JsonNullable<List<@Valid CategoryParameterDTO>> parameters = JsonNullable.<List<@Valid CategoryParameterDTO>>undefined();

  public CategoryContentParametersDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoryContentParametersDTO(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryContentParametersDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
   * @return categoryId
   */
  @NotNull 
  @Schema(name = "categoryId", description = "Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categoryId")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public CategoryContentParametersDTO parameters(List<@Valid CategoryParameterDTO> parameters) {
    this.parameters = JsonNullable.of(parameters);
    return this;
  }

  public CategoryContentParametersDTO addParametersItem(CategoryParameterDTO parametersItem) {
    if (this.parameters == null || !this.parameters.isPresent()) {
      this.parameters = JsonNullable.of(new ArrayList<>());
    }
    this.parameters.get().add(parametersItem);
    return this;
  }

  /**
   * Список характеристик.
   * @return parameters
   */
  @Valid 
  @Schema(name = "parameters", description = "Список характеристик.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public JsonNullable<List<@Valid CategoryParameterDTO>> getParameters() {
    return parameters;
  }

  public void setParameters(JsonNullable<List<@Valid CategoryParameterDTO>> parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryContentParametersDTO categoryContentParametersDTO = (CategoryContentParametersDTO) o;
    return Objects.equals(this.categoryId, categoryContentParametersDTO.categoryId) &&
        equalsNullable(this.parameters, categoryContentParametersDTO.parameters);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, hashCodeNullable(parameters));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryContentParametersDTO {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

