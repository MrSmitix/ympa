package apimodels;

import apimodels.FeedbackAuthorDTO;
import apimodels.FeedbackCommentDTO;
import apimodels.FeedbackGradesDTO;
import apimodels.FeedbackOrderDTO;
import apimodels.FeedbackShopDTO;
import apimodels.FeedbackStateType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FeedbackDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("createdAt")
  @Valid

  private OffsetDateTime createdAt;

  @JsonProperty("text")
  
  private String text;

  @JsonProperty("state")
  @Valid

  private FeedbackStateType state;

  @JsonProperty("author")
  @Valid

  private FeedbackAuthorDTO author;

  @JsonProperty("pro")
  
  private String pro;

  @JsonProperty("contra")
  
  private String contra;

  @JsonProperty("comments")
  @NotNull
@Valid

  private List<@Valid FeedbackCommentDTO> comments = new ArrayList<>();

  @JsonProperty("shop")
  @Valid

  private FeedbackShopDTO shop;

  @JsonProperty("resolved")
  
  private Boolean resolved;

  @JsonProperty("verified")
  
  private Boolean verified;

  @JsonProperty("recommend")
  
  private Boolean recommend;

  @JsonProperty("grades")
  @Valid

  private FeedbackGradesDTO grades;

  @JsonProperty("order")
  @Valid

  private FeedbackOrderDTO order;

  public FeedbackDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор отзыва.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FeedbackDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FeedbackDTO text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Комментарий автора отзыва.
   * @return text
  **/
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public FeedbackDTO state(FeedbackStateType state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public FeedbackStateType getState() {
    return state;
  }

  public void setState(FeedbackStateType state) {
    this.state = state;
  }

  public FeedbackDTO author(FeedbackAuthorDTO author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  public FeedbackAuthorDTO getAuthor() {
    return author;
  }

  public void setAuthor(FeedbackAuthorDTO author) {
    this.author = author;
  }

  public FeedbackDTO pro(String pro) {
    this.pro = pro;
    return this;
  }

   /**
   * Достоинства магазина, описанные в отзыве.
   * @return pro
  **/
  public String getPro() {
    return pro;
  }

  public void setPro(String pro) {
    this.pro = pro;
  }

  public FeedbackDTO contra(String contra) {
    this.contra = contra;
    return this;
  }

   /**
   * Недостатки магазина, описанные в отзыве.
   * @return contra
  **/
  public String getContra() {
    return contra;
  }

  public void setContra(String contra) {
    this.contra = contra;
  }

  public FeedbackDTO comments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
    return this;
  }

  public FeedbackDTO addCommentsItem(FeedbackCommentDTO commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Переписка автора отзыва с магазином.
   * @return comments
  **/
  public List<@Valid FeedbackCommentDTO> getComments() {
    return comments;
  }

  public void setComments(List<@Valid FeedbackCommentDTO> comments) {
    this.comments = comments;
  }

  public FeedbackDTO shop(FeedbackShopDTO shop) {
    this.shop = shop;
    return this;
  }

   /**
   * Get shop
   * @return shop
  **/
  public FeedbackShopDTO getShop() {
    return shop;
  }

  public void setShop(FeedbackShopDTO shop) {
    this.shop = shop;
  }

  public FeedbackDTO resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

   /**
   * Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
   * @return resolved
  **/
  public Boolean getResolved() {
    return resolved;
  }

  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  public FeedbackDTO verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
   * @return verified
  **/
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public FeedbackDTO recommend(Boolean recommend) {
    this.recommend = recommend;
    return this;
  }

   /**
   * Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
   * @return recommend
  **/
  public Boolean getRecommend() {
    return recommend;
  }

  public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }

  public FeedbackDTO grades(FeedbackGradesDTO grades) {
    this.grades = grades;
    return this;
  }

   /**
   * Get grades
   * @return grades
  **/
  public FeedbackGradesDTO getGrades() {
    return grades;
  }

  public void setGrades(FeedbackGradesDTO grades) {
    this.grades = grades;
  }

  public FeedbackDTO order(FeedbackOrderDTO order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

