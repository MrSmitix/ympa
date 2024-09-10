/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// Информация о заказе.
    /// </summary>
    [DataContract(Name = "OrdersStatsOrderDTO")]
    public partial class OrdersStatsOrderDTO : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public OrderStatsStatusType? Status { get; set; }

        /// <summary>
        /// Gets or Sets PaymentType
        /// </summary>
        [DataMember(Name = "paymentType", EmitDefaultValue = false)]
        public OrdersStatsOrderPaymentType? PaymentType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrdersStatsOrderDTO" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrdersStatsOrderDTO() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrdersStatsOrderDTO" /> class.
        /// </summary>
        /// <param name="id">Идентификатор заказа..</param>
        /// <param name="creationDate">Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. .</param>
        /// <param name="statusUpdateDate">Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). .</param>
        /// <param name="status">status.</param>
        /// <param name="partnerOrderId">Идентификатор заказа в информационной системе магазина..</param>
        /// <param name="paymentType">paymentType.</param>
        /// <param name="fake">Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. .</param>
        /// <param name="deliveryRegion">deliveryRegion.</param>
        /// <param name="items">Список товаров в заказе после возможных изменений. (required).</param>
        /// <param name="initialItems">Список товаров в заказе до изменений..</param>
        /// <param name="payments">Информация о денежных переводах по заказу. (required).</param>
        /// <param name="commissions">Информация о комиссиях за заказ. (required).</param>
        public OrdersStatsOrderDTO(long id = default(long), DateOnly creationDate = default(DateOnly), DateTime statusUpdateDate = default(DateTime), OrderStatsStatusType? status = default(OrderStatsStatusType?), string partnerOrderId = default(string), OrdersStatsOrderPaymentType? paymentType = default(OrdersStatsOrderPaymentType?), bool fake = default(bool), OrdersStatsDeliveryRegionDTO deliveryRegion = default(OrdersStatsDeliveryRegionDTO), List<OrdersStatsItemDTO> items = default(List<OrdersStatsItemDTO>), List<OrdersStatsItemDTO> initialItems = default(List<OrdersStatsItemDTO>), List<OrdersStatsPaymentDTO> payments = default(List<OrdersStatsPaymentDTO>), List<OrdersStatsCommissionDTO> commissions = default(List<OrdersStatsCommissionDTO>))
        {
            // to ensure "items" is required (not null)
            if (items == null)
            {
                throw new ArgumentNullException("items is a required property for OrdersStatsOrderDTO and cannot be null");
            }
            this.Items = items;
            // to ensure "payments" is required (not null)
            if (payments == null)
            {
                throw new ArgumentNullException("payments is a required property for OrdersStatsOrderDTO and cannot be null");
            }
            this.Payments = payments;
            // to ensure "commissions" is required (not null)
            if (commissions == null)
            {
                throw new ArgumentNullException("commissions is a required property for OrdersStatsOrderDTO and cannot be null");
            }
            this.Commissions = commissions;
            this.Id = id;
            this.CreationDate = creationDate;
            this.StatusUpdateDate = statusUpdateDate;
            this.Status = status;
            this.PartnerOrderId = partnerOrderId;
            this.PaymentType = paymentType;
            this.Fake = fake;
            this.DeliveryRegion = deliveryRegion;
            this.InitialItems = initialItems;
        }

        /// <summary>
        /// Идентификатор заказа.
        /// </summary>
        /// <value>Идентификатор заказа.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public long Id { get; set; }

        /// <summary>
        /// Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
        /// </summary>
        /// <value>Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. </value>
        [DataMember(Name = "creationDate", EmitDefaultValue = false)]
        public DateOnly CreationDate { get; set; }

        /// <summary>
        /// Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). 
        /// </summary>
        /// <value>Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). </value>
        [DataMember(Name = "statusUpdateDate", EmitDefaultValue = false)]
        public DateTime StatusUpdateDate { get; set; }

        /// <summary>
        /// Идентификатор заказа в информационной системе магазина.
        /// </summary>
        /// <value>Идентификатор заказа в информационной системе магазина.</value>
        [DataMember(Name = "partnerOrderId", EmitDefaultValue = false)]
        public string PartnerOrderId { get; set; }

        /// <summary>
        /// Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
        /// </summary>
        /// <value>Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. </value>
        [DataMember(Name = "fake", EmitDefaultValue = true)]
        public bool Fake { get; set; }

        /// <summary>
        /// Gets or Sets DeliveryRegion
        /// </summary>
        [DataMember(Name = "deliveryRegion", EmitDefaultValue = false)]
        public OrdersStatsDeliveryRegionDTO DeliveryRegion { get; set; }

        /// <summary>
        /// Список товаров в заказе после возможных изменений.
        /// </summary>
        /// <value>Список товаров в заказе после возможных изменений.</value>
        [DataMember(Name = "items", IsRequired = true, EmitDefaultValue = true)]
        public List<OrdersStatsItemDTO> Items { get; set; }

        /// <summary>
        /// Список товаров в заказе до изменений.
        /// </summary>
        /// <value>Список товаров в заказе до изменений.</value>
        [DataMember(Name = "initialItems", EmitDefaultValue = true)]
        public List<OrdersStatsItemDTO> InitialItems { get; set; }

        /// <summary>
        /// Информация о денежных переводах по заказу.
        /// </summary>
        /// <value>Информация о денежных переводах по заказу.</value>
        [DataMember(Name = "payments", IsRequired = true, EmitDefaultValue = true)]
        public List<OrdersStatsPaymentDTO> Payments { get; set; }

        /// <summary>
        /// Информация о комиссиях за заказ.
        /// </summary>
        /// <value>Информация о комиссиях за заказ.</value>
        [DataMember(Name = "commissions", IsRequired = true, EmitDefaultValue = true)]
        public List<OrdersStatsCommissionDTO> Commissions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OrdersStatsOrderDTO {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreationDate: ").Append(CreationDate).Append("\n");
            sb.Append("  StatusUpdateDate: ").Append(StatusUpdateDate).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  PartnerOrderId: ").Append(PartnerOrderId).Append("\n");
            sb.Append("  PaymentType: ").Append(PaymentType).Append("\n");
            sb.Append("  Fake: ").Append(Fake).Append("\n");
            sb.Append("  DeliveryRegion: ").Append(DeliveryRegion).Append("\n");
            sb.Append("  Items: ").Append(Items).Append("\n");
            sb.Append("  InitialItems: ").Append(InitialItems).Append("\n");
            sb.Append("  Payments: ").Append(Payments).Append("\n");
            sb.Append("  Commissions: ").Append(Commissions).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
