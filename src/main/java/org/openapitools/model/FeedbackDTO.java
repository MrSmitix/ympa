/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.FeedbackAuthorDTO;
import org.openapitools.model.FeedbackCommentDTO;
import org.openapitools.model.FeedbackGradesDTO;
import org.openapitools.model.FeedbackOrderDTO;
import org.openapitools.model.FeedbackShopDTO;
import org.openapitools.model.FeedbackStateType;



/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */

@ApiModel(description = "Отзыв пользователя Яндекс Маркета об указанном магазине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackDTO   {
  
  private Long id;
  private Date createdAt;
  private String text;
  private FeedbackStateType state;
  private FeedbackAuthorDTO author;
  private String pro;
  private String contra;
  private List<FeedbackCommentDTO> comments = new ArrayList<>();
  private FeedbackShopDTO shop;
  private Boolean resolved;
  private Boolean verified;
  private Boolean recommend;
  private FeedbackGradesDTO grades;
  private FeedbackOrderDTO order;

  /**
   * Идентификатор отзыва.
   */
  public FeedbackDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор отзыва.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   */
  public FeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Комментарий автора отзыва.
   */
  public FeedbackDTO text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Комментарий автора отзыва.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   */
  public FeedbackDTO state(FeedbackStateType state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public FeedbackStateType getState() {
    return state;
  }
  public void setState(FeedbackStateType state) {
    this.state = state;
  }

  /**
   */
  public FeedbackDTO author(FeedbackAuthorDTO author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("author")
  public FeedbackAuthorDTO getAuthor() {
    return author;
  }
  public void setAuthor(FeedbackAuthorDTO author) {
    this.author = author;
  }

  /**
   * Достоинства магазина, описанные в отзыве.
   */
  public FeedbackDTO pro(String pro) {
    this.pro = pro;
    return this;
  }

  
  @ApiModelProperty(value = "Достоинства магазина, описанные в отзыве.")
  @JsonProperty("pro")
  public String getPro() {
    return pro;
  }
  public void setPro(String pro) {
    this.pro = pro;
  }

  /**
   * Недостатки магазина, описанные в отзыве.
   */
  public FeedbackDTO contra(String contra) {
    this.contra = contra;
    return this;
  }

  
  @ApiModelProperty(value = "Недостатки магазина, описанные в отзыве.")
  @JsonProperty("contra")
  public String getContra() {
    return contra;
  }
  public void setContra(String contra) {
    this.contra = contra;
  }

  /**
   * Переписка автора отзыва с магазином.
   */
  public FeedbackDTO comments(List<FeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Переписка автора отзыва с магазином.")
  @JsonProperty("comments")
  public List<FeedbackCommentDTO> getComments() {
    return comments;
  }
  public void setComments(List<FeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  /**
   */
  public FeedbackDTO shop(FeedbackShopDTO shop) {
    this.shop = shop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shop")
  public FeedbackShopDTO getShop() {
    return shop;
  }
  public void setShop(FeedbackShopDTO shop) {
    this.shop = shop;
  }

  /**
   * Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
   */
  public FeedbackDTO resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

  
  @ApiModelProperty(value = "Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ")
  @JsonProperty("resolved")
  public Boolean getResolved() {
    return resolved;
  }
  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
   */
  public FeedbackDTO verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. ")
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  /**
   * Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
   */
  public FeedbackDTO recommend(Boolean recommend) {
    this.recommend = recommend;
    return this;
  }

  
  @ApiModelProperty(value = "Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. ")
  @JsonProperty("recommend")
  public Boolean getRecommend() {
    return recommend;
  }
  public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }

  /**
   */
  public FeedbackDTO grades(FeedbackGradesDTO grades) {
    this.grades = grades;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grades")
  public FeedbackGradesDTO getGrades() {
    return grades;
  }
  public void setGrades(FeedbackGradesDTO grades) {
    this.grades = grades;
  }

  /**
   */
  public FeedbackDTO order(FeedbackOrderDTO order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public FeedbackOrderDTO getOrder() {
    return order;
  }
  public void setOrder(FeedbackOrderDTO order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackDTO feedbackDTO = (FeedbackDTO) o;
    return Objects.equals(id, feedbackDTO.id) &&
        Objects.equals(createdAt, feedbackDTO.createdAt) &&
        Objects.equals(text, feedbackDTO.text) &&
        Objects.equals(state, feedbackDTO.state) &&
        Objects.equals(author, feedbackDTO.author) &&
        Objects.equals(pro, feedbackDTO.pro) &&
        Objects.equals(contra, feedbackDTO.contra) &&
        Objects.equals(comments, feedbackDTO.comments) &&
        Objects.equals(shop, feedbackDTO.shop) &&
        Objects.equals(resolved, feedbackDTO.resolved) &&
        Objects.equals(verified, feedbackDTO.verified) &&
        Objects.equals(recommend, feedbackDTO.recommend) &&
        Objects.equals(grades, feedbackDTO.grades) &&
        Objects.equals(order, feedbackDTO.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, text, state, author, pro, contra, comments, shop, resolved, verified, recommend, grades, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    pro: ").append(toIndentedString(pro)).append("\n");
    sb.append("    contra: ").append(toIndentedString(contra)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

