package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import org.openapitools.model.OrdersStatsCommissionDTO;
import org.openapitools.model.OrdersStatsDeliveryRegionDTO;
import org.openapitools.model.OrdersStatsItemDTO;
import org.openapitools.model.OrdersStatsOrderPaymentType;
import org.openapitools.model.OrdersStatsPaymentDTO;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о заказе.
 */

@Schema(name = "OrdersStatsOrderDTO", description = "Информация о заказе.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsOrderDTO {

  private Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusUpdateDate;

  private OrderStatsStatusType status;

  private String partnerOrderId;

  private OrdersStatsOrderPaymentType paymentType;

  private Boolean fake;

  private OrdersStatsDeliveryRegionDTO deliveryRegion;

  @Valid
  private List<@Valid OrdersStatsItemDTO> items = new ArrayList<>();

  @Valid
  private JsonNullable<List<@Valid OrdersStatsItemDTO>> initialItems = JsonNullable.<List<@Valid OrdersStatsItemDTO>>undefined();

  @Valid
  private List<@Valid OrdersStatsPaymentDTO> payments = new ArrayList<>();

  @Valid
  private List<@Valid OrdersStatsCommissionDTO> commissions = new ArrayList<>();

  public OrdersStatsOrderDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrdersStatsOrderDTO(List<@Valid OrdersStatsItemDTO> items, List<@Valid OrdersStatsPaymentDTO> payments, List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.items = items;
    this.payments = payments;
    this.commissions = commissions;
  }

  public OrdersStatsOrderDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrdersStatsOrderDTO creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
   * @return creationDate
   */
  @Valid 
  @Schema(name = "creationDate", description = "Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public OrdersStatsOrderDTO statusUpdateDate(OffsetDateTime statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
    return this;
  }

  /**
   * Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
   * @return statusUpdateDate
   */
  @Valid 
  @Schema(name = "statusUpdateDate", description = "Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusUpdateDate")
  public OffsetDateTime getStatusUpdateDate() {
    return statusUpdateDate;
  }

  public void setStatusUpdateDate(OffsetDateTime statusUpdateDate) {
    this.statusUpdateDate = statusUpdateDate;
  }

  public OrdersStatsOrderDTO status(OrderStatsStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public OrderStatsStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatsStatusType status) {
    this.status = status;
  }

  public OrdersStatsOrderDTO partnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
    return this;
  }

  /**
   * Идентификатор заказа в информационной системе магазина.
   * @return partnerOrderId
   */
  
  @Schema(name = "partnerOrderId", description = "Идентификатор заказа в информационной системе магазина.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partnerOrderId")
  public String getPartnerOrderId() {
    return partnerOrderId;
  }

  public void setPartnerOrderId(String partnerOrderId) {
    this.partnerOrderId = partnerOrderId;
  }

  public OrdersStatsOrderDTO paymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
   */
  @Valid 
  @Schema(name = "paymentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentType")
  public OrdersStatsOrderPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(OrdersStatsOrderPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public OrdersStatsOrderDTO fake(Boolean fake) {
    this.fake = fake;
    return this;
  }

  /**
   * Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
   * @return fake
   */
  
  @Schema(name = "fake", description = "Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fake")
  public Boolean getFake() {
    return fake;
  }

  public void setFake(Boolean fake) {
    this.fake = fake;
  }

  public OrdersStatsOrderDTO deliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
    return this;
  }

  /**
   * Get deliveryRegion
   * @return deliveryRegion
   */
  @Valid 
  @Schema(name = "deliveryRegion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryRegion")
  public OrdersStatsDeliveryRegionDTO getDeliveryRegion() {
    return deliveryRegion;
  }

  public void setDeliveryRegion(OrdersStatsDeliveryRegionDTO deliveryRegion) {
    this.deliveryRegion = deliveryRegion;
  }

  public OrdersStatsOrderDTO items(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrdersStatsOrderDTO addItemsItem(OrdersStatsItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список товаров в заказе после возможных изменений.
   * @return items
   */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список товаров в заказе после возможных изменений.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrdersStatsItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrdersStatsItemDTO> items) {
    this.items = items;
  }

  public OrdersStatsOrderDTO initialItems(List<@Valid OrdersStatsItemDTO> initialItems) {
    this.initialItems = JsonNullable.of(initialItems);
    return this;
  }

  public OrdersStatsOrderDTO addInitialItemsItem(OrdersStatsItemDTO initialItemsItem) {
    if (this.initialItems == null || !this.initialItems.isPresent()) {
      this.initialItems = JsonNullable.of(new ArrayList<>());
    }
    this.initialItems.get().add(initialItemsItem);
    return this;
  }

  /**
   * Список товаров в заказе до изменений.
   * @return initialItems
   */
  @Valid 
  @Schema(name = "initialItems", description = "Список товаров в заказе до изменений.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialItems")
  public JsonNullable<List<@Valid OrdersStatsItemDTO>> getInitialItems() {
    return initialItems;
  }

  public void setInitialItems(JsonNullable<List<@Valid OrdersStatsItemDTO>> initialItems) {
    this.initialItems = initialItems;
  }

  public OrdersStatsOrderDTO payments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
    return this;
  }

  public OrdersStatsOrderDTO addPaymentsItem(OrdersStatsPaymentDTO paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Информация о денежных переводах по заказу.
   * @return payments
   */
  @NotNull @Valid 
  @Schema(name = "payments", description = "Информация о денежных переводах по заказу.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payments")
  public List<@Valid OrdersStatsPaymentDTO> getPayments() {
    return payments;
  }

  public void setPayments(List<@Valid OrdersStatsPaymentDTO> payments) {
    this.payments = payments;
  }

  public OrdersStatsOrderDTO commissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
    return this;
  }

  public OrdersStatsOrderDTO addCommissionsItem(OrdersStatsCommissionDTO commissionsItem) {
    if (this.commissions == null) {
      this.commissions = new ArrayList<>();
    }
    this.commissions.add(commissionsItem);
    return this;
  }

  /**
   * Информация о комиссиях за заказ.
   * @return commissions
   */
  @NotNull @Valid 
  @Schema(name = "commissions", description = "Информация о комиссиях за заказ.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("commissions")
  public List<@Valid OrdersStatsCommissionDTO> getCommissions() {
    return commissions;
  }

  public void setCommissions(List<@Valid OrdersStatsCommissionDTO> commissions) {
    this.commissions = commissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsOrderDTO ordersStatsOrderDTO = (OrdersStatsOrderDTO) o;
    return Objects.equals(this.id, ordersStatsOrderDTO.id) &&
        Objects.equals(this.creationDate, ordersStatsOrderDTO.creationDate) &&
        Objects.equals(this.statusUpdateDate, ordersStatsOrderDTO.statusUpdateDate) &&
        Objects.equals(this.status, ordersStatsOrderDTO.status) &&
        Objects.equals(this.partnerOrderId, ordersStatsOrderDTO.partnerOrderId) &&
        Objects.equals(this.paymentType, ordersStatsOrderDTO.paymentType) &&
        Objects.equals(this.fake, ordersStatsOrderDTO.fake) &&
        Objects.equals(this.deliveryRegion, ordersStatsOrderDTO.deliveryRegion) &&
        Objects.equals(this.items, ordersStatsOrderDTO.items) &&
        equalsNullable(this.initialItems, ordersStatsOrderDTO.initialItems) &&
        Objects.equals(this.payments, ordersStatsOrderDTO.payments) &&
        Objects.equals(this.commissions, ordersStatsOrderDTO.commissions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, statusUpdateDate, status, partnerOrderId, paymentType, fake, deliveryRegion, items, hashCodeNullable(initialItems), payments, commissions);
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
    sb.append("class OrdersStatsOrderDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    statusUpdateDate: ").append(toIndentedString(statusUpdateDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    partnerOrderId: ").append(toIndentedString(partnerOrderId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    fake: ").append(toIndentedString(fake)).append("\n");
    sb.append("    deliveryRegion: ").append(toIndentedString(deliveryRegion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    initialItems: ").append(toIndentedString(initialItems)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    commissions: ").append(toIndentedString(commissions)).append("\n");
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

