package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.FeedbackAuthorDTO;
import org.openapitools.vertxweb.server.model.FeedbackCommentDTO;
import org.openapitools.vertxweb.server.model.FeedbackGradesDTO;
import org.openapitools.vertxweb.server.model.FeedbackOrderDTO;
import org.openapitools.vertxweb.server.model.FeedbackShopDTO;
import org.openapitools.vertxweb.server.model.FeedbackStateType;

/**
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedbackDTO   {
  
  private Long id;
  private OffsetDateTime createdAt;
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

  public FeedbackDTO () {

  }

  public FeedbackDTO (Long id, OffsetDateTime createdAt, String text, FeedbackStateType state, FeedbackAuthorDTO author, String pro, String contra, List<FeedbackCommentDTO> comments, FeedbackShopDTO shop, Boolean resolved, Boolean verified, Boolean recommend, FeedbackGradesDTO grades, FeedbackOrderDTO order) {
    this.id = id;
    this.createdAt = createdAt;
    this.text = text;
    this.state = state;
    this.author = author;
    this.pro = pro;
    this.contra = contra;
    this.comments = comments;
    this.shop = shop;
    this.resolved = resolved;
    this.verified = verified;
    this.recommend = recommend;
    this.grades = grades;
    this.order = order;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("state")
  public FeedbackStateType getState() {
    return state;
  }
  public void setState(FeedbackStateType state) {
    this.state = state;
  }

    
  @JsonProperty("author")
  public FeedbackAuthorDTO getAuthor() {
    return author;
  }
  public void setAuthor(FeedbackAuthorDTO author) {
    this.author = author;
  }

    
  @JsonProperty("pro")
  public String getPro() {
    return pro;
  }
  public void setPro(String pro) {
    this.pro = pro;
  }

    
  @JsonProperty("contra")
  public String getContra() {
    return contra;
  }
  public void setContra(String contra) {
    this.contra = contra;
  }

    
  @JsonProperty("comments")
  public List<FeedbackCommentDTO> getComments() {
    return comments;
  }
  public void setComments(List<FeedbackCommentDTO> comments) {
    this.comments = comments;
  }

    
  @JsonProperty("shop")
  public FeedbackShopDTO getShop() {
    return shop;
  }
  public void setShop(FeedbackShopDTO shop) {
    this.shop = shop;
  }

    
  @JsonProperty("resolved")
  public Boolean getResolved() {
    return resolved;
  }
  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

    
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

    
  @JsonProperty("recommend")
  public Boolean getRecommend() {
    return recommend;
  }
  public void setRecommend(Boolean recommend) {
    this.recommend = recommend;
  }

    
  @JsonProperty("grades")
  public FeedbackGradesDTO getGrades() {
    return grades;
  }
  public void setGrades(FeedbackGradesDTO grades) {
    this.grades = grades;
  }

    
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
