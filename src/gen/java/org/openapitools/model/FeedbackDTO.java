package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 **/
@ApiModel(description = "Отзыв пользователя Яндекс Маркета об указанном магазине.")
@JsonTypeName("FeedbackDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FeedbackDTO   {
  private Long id;
  private Date createdAt;
  private String text;
  private FeedbackStateType state;
  private FeedbackAuthorDTO author;
  private String pro;
  private String contra;
  private @Valid List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();
  private FeedbackShopDTO shop;
  private Boolean resolved;
  private Boolean verified;
  private Boolean recommend;
  private FeedbackGradesDTO grades;
  private FeedbackOrderDTO order;

  /**
   * Идентификатор отзыва.
   **/
  public FeedbackDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор отзыва.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
   **/
  public FeedbackDTO createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("createdAt")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Комментарий автора отзыва.
   **/
  public FeedbackDTO text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Комментарий автора отзыва.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  @JsonProperty("text")
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public FeedbackDTO state(FeedbackStateType state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("state")
  public FeedbackStateType getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(FeedbackStateType state) {
    this.state = state;
  }

  /**
   **/
  public FeedbackDTO author(FeedbackAuthorDTO author) {
    this.author = author;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("author")
  @Valid public FeedbackAuthorDTO getAuthor() {
    return author;
  }

  @JsonProperty("author")
  public void setAuthor(FeedbackAuthorDTO author) {
    this.author = author;
  }

  /**
   * Достоинства магазина, описанные в отзыве.
   **/
  public FeedbackDTO pro(String pro) {
    this.pro = pro;
    return this;
  }

  
  @ApiModelProperty(value = "Достоинства магазина, описанные в отзыве.")
  @JsonProperty("pro")
  public String getPro() {
    return pro;
  }

  @JsonProperty("pro")
  public void setPro(String pro) {
    this.pro = pro;
  }

  /**
   * Недостатки магазина, описанные в отзыве.
   **/
  public FeedbackDTO contra(String contra) {
    this.contra = contra;
    return this;
  }

  
  @ApiModelProperty(value = "Недостатки магазина, описанные в отзыве.")
  @JsonProperty("contra")
  public String getContra() {
    return contra;
  }

  @JsonProperty("contra")
  public void setContra(String contra) {
    this.contra = contra;
  }

  /**
   * Переписка автора отзыва с магазином.
   **/
  public FeedbackDTO comments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Переписка автора отзыва с магазином.")
  @JsonProperty("comments")
  @NotNull @Valid public List<@Valid FeedbackCommentDTO> getComments() {
    return comments;
  }

  @JsonProperty("comments")
  public void setComments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  public FeedbackDTO addCommentsItem(FeedbackCommentDTO commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }

    this.comments.add(commentsItem);
    return this;
  }

  public FeedbackDTO removeCommentsItem(FeedbackCommentDTO commentsItem) {
    if (commentsItem != null && this.comments != null) {
      this.comments.remove(commentsItem);
    }

    return this;
  }
  /**
   **/
  public FeedbackDTO shop(FeedbackShopDTO shop) {
    this.shop = shop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shop")
  @Valid public FeedbackShopDTO getShop() {
    return shop;
  }

  @JsonProperty("shop")
  public void setShop(FeedbackShopDTO shop) {
    this.shop = shop;
  }

  /**
   * Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
   **/
  public FeedbackDTO resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

  
  @ApiModelProperty(value = "Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ")
  @JsonProperty("resolved")
  public Boolean getResolved() {
    return resolved;
  }

  @JsonProperty("resolved")
  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  /**
   * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
   **/
  public FeedbackDTO verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  
  @ApiModelProperty(value = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. ")
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  @JsonProperty("verified")
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  /**
   * Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
   **/
  public FeedbackDTO recommend(Boolean recommend) {
    this.recommend = recommend;
    return this;
  }

  
  @ApiModelProperty(value = "Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. ")
  @JsonProperty("recommend")
  public Boolean getRecommend() {
    return recommend;
  }

  @JsonProperty("recommend")
  public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }

  /**
   **/
  public FeedbackDTO grades(FeedbackGradesDTO grades) {
    this.grades = grades;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grades")
  @Valid public FeedbackGradesDTO getGrades() {
    return grades;
  }

  @JsonProperty("grades")
  public void setGrades(FeedbackGradesDTO grades) {
    this.grades = grades;
  }

  /**
   **/
  public FeedbackDTO order(FeedbackOrderDTO order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  @Valid public FeedbackOrderDTO getOrder() {
    return order;
  }

  @JsonProperty("order")
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
    return Objects.equals(this.id, feedbackDTO.id) &&
        Objects.equals(this.createdAt, feedbackDTO.createdAt) &&
        Objects.equals(this.text, feedbackDTO.text) &&
        Objects.equals(this.state, feedbackDTO.state) &&
        Objects.equals(this.author, feedbackDTO.author) &&
        Objects.equals(this.pro, feedbackDTO.pro) &&
        Objects.equals(this.contra, feedbackDTO.contra) &&
        Objects.equals(this.comments, feedbackDTO.comments) &&
        Objects.equals(this.shop, feedbackDTO.shop) &&
        Objects.equals(this.resolved, feedbackDTO.resolved) &&
        Objects.equals(this.verified, feedbackDTO.verified) &&
        Objects.equals(this.recommend, feedbackDTO.recommend) &&
        Objects.equals(this.grades, feedbackDTO.grades) &&
        Objects.equals(this.order, feedbackDTO.order);
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

