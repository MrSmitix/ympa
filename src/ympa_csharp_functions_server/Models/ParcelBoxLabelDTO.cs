/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using ympa_csharp_functions_server.Converters;

namespace ympa_csharp_functions_server.Models
{ 
    /// <summary>
    /// Информация о ярлыке для коробки.
    /// </summary>
    [DataContract]
    public partial class ParcelBoxLabelDTO : IEquatable<ParcelBoxLabelDTO>
    {
        /// <summary>
        /// Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
        /// </summary>
        /// <value>Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). </value>
        [Required]
        [DataMember(Name="url", EmitDefaultValue=false)]
        public string Url { get; set; }

        /// <summary>
        /// Юридическое название магазина.
        /// </summary>
        /// <value>Юридическое название магазина.</value>
        [Required]
        [DataMember(Name="supplierName", EmitDefaultValue=false)]
        public string SupplierName { get; set; }

        /// <summary>
        /// Юридическое название службы доставки.
        /// </summary>
        /// <value>Юридическое название службы доставки.</value>
        [Required]
        [DataMember(Name="deliveryServiceName", EmitDefaultValue=false)]
        public string DeliveryServiceName { get; set; }

        /// <summary>
        /// Идентификатор заказа в системе Маркета.
        /// </summary>
        /// <value>Идентификатор заказа в системе Маркета.</value>
        [Required]
        [DataMember(Name="orderId", EmitDefaultValue=false)]
        public long OrderId { get; set; }

        /// <summary>
        /// Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. 
        /// </summary>
        /// <value>Идентификатор заказа в информационной системе магазина.  Совпадает с &#x60;orderId&#x60;, если Маркету неизвестен номер заказа в системе магазина. </value>
        [Required]
        [DataMember(Name="orderNum", EmitDefaultValue=false)]
        public string OrderNum { get; set; }

        /// <summary>
        /// Фамилия и инициалы получателя заказа.
        /// </summary>
        /// <value>Фамилия и инициалы получателя заказа.</value>
        [Required]
        [DataMember(Name="recipientName", EmitDefaultValue=false)]
        public string RecipientName { get; set; }

        /// <summary>
        /// Идентификатор коробки.
        /// </summary>
        /// <value>Идентификатор коробки.</value>
        [Required]
        [DataMember(Name="boxId", EmitDefaultValue=false)]
        public long BoxId { get; set; }

        /// <summary>
        /// Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. 
        /// </summary>
        /// <value>Идентификатор коробки в информационной системе магазина.  Возвращается в формате: &#x60;номер заказа на Маркете-номер коробки&#x60;. Например, &#x60;7206821‑1&#x60;, &#x60;7206821‑2&#x60; и т. д. </value>
        [Required]
        [DataMember(Name="fulfilmentId", EmitDefaultValue=false)]
        public string FulfilmentId { get; set; }

        /// <summary>
        /// Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. 
        /// </summary>
        /// <value>Номер коробки в заказе. Возвращается в формате: &#x60;номер места/общее количество мест&#x60;. </value>
        [Required]
        [DataMember(Name="place", EmitDefaultValue=false)]
        public string Place { get; set; }

        /// <summary>
        /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. 
        /// </summary>
        /// <value>{% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: &#x60;weight кг&#x60;. </value>
        [Required]
        [DataMember(Name="weight", EmitDefaultValue=false)]
        public string Weight { get; set; }

        /// <summary>
        /// Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
        /// </summary>
        /// <value>Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).</value>
        [Required]
        [DataMember(Name="deliveryServiceId", EmitDefaultValue=false)]
        public string DeliveryServiceId { get; set; }

        /// <summary>
        /// Адрес получателя.
        /// </summary>
        /// <value>Адрес получателя.</value>
        [DataMember(Name="deliveryAddress", EmitDefaultValue=false)]
        public string DeliveryAddress { get; set; }

        /// <summary>
        /// Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.
        /// </summary>
        /// <value>Дата отгрузки в формате &#x60;dd.MM.yyyy&#x60;.</value>
        [DataMember(Name="shipmentDate", EmitDefaultValue=false)]
        public string ShipmentDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ParcelBoxLabelDTO {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  SupplierName: ").Append(SupplierName).Append("\n");
            sb.Append("  DeliveryServiceName: ").Append(DeliveryServiceName).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  OrderNum: ").Append(OrderNum).Append("\n");
            sb.Append("  RecipientName: ").Append(RecipientName).Append("\n");
            sb.Append("  BoxId: ").Append(BoxId).Append("\n");
            sb.Append("  FulfilmentId: ").Append(FulfilmentId).Append("\n");
            sb.Append("  Place: ").Append(Place).Append("\n");
            sb.Append("  Weight: ").Append(Weight).Append("\n");
            sb.Append("  DeliveryServiceId: ").Append(DeliveryServiceId).Append("\n");
            sb.Append("  DeliveryAddress: ").Append(DeliveryAddress).Append("\n");
            sb.Append("  ShipmentDate: ").Append(ShipmentDate).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((ParcelBoxLabelDTO)obj);
        }

        /// <summary>
        /// Returns true if ParcelBoxLabelDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of ParcelBoxLabelDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ParcelBoxLabelDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Url == other.Url ||
                    Url != null &&
                    Url.Equals(other.Url)
                ) && 
                (
                    SupplierName == other.SupplierName ||
                    SupplierName != null &&
                    SupplierName.Equals(other.SupplierName)
                ) && 
                (
                    DeliveryServiceName == other.DeliveryServiceName ||
                    DeliveryServiceName != null &&
                    DeliveryServiceName.Equals(other.DeliveryServiceName)
                ) && 
                (
                    OrderId == other.OrderId ||
                    
                    OrderId.Equals(other.OrderId)
                ) && 
                (
                    OrderNum == other.OrderNum ||
                    OrderNum != null &&
                    OrderNum.Equals(other.OrderNum)
                ) && 
                (
                    RecipientName == other.RecipientName ||
                    RecipientName != null &&
                    RecipientName.Equals(other.RecipientName)
                ) && 
                (
                    BoxId == other.BoxId ||
                    
                    BoxId.Equals(other.BoxId)
                ) && 
                (
                    FulfilmentId == other.FulfilmentId ||
                    FulfilmentId != null &&
                    FulfilmentId.Equals(other.FulfilmentId)
                ) && 
                (
                    Place == other.Place ||
                    Place != null &&
                    Place.Equals(other.Place)
                ) && 
                (
                    Weight == other.Weight ||
                    Weight != null &&
                    Weight.Equals(other.Weight)
                ) && 
                (
                    DeliveryServiceId == other.DeliveryServiceId ||
                    DeliveryServiceId != null &&
                    DeliveryServiceId.Equals(other.DeliveryServiceId)
                ) && 
                (
                    DeliveryAddress == other.DeliveryAddress ||
                    DeliveryAddress != null &&
                    DeliveryAddress.Equals(other.DeliveryAddress)
                ) && 
                (
                    ShipmentDate == other.ShipmentDate ||
                    ShipmentDate != null &&
                    ShipmentDate.Equals(other.ShipmentDate)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Url != null)
                    hashCode = hashCode * 59 + Url.GetHashCode();
                    if (SupplierName != null)
                    hashCode = hashCode * 59 + SupplierName.GetHashCode();
                    if (DeliveryServiceName != null)
                    hashCode = hashCode * 59 + DeliveryServiceName.GetHashCode();
                    
                    hashCode = hashCode * 59 + OrderId.GetHashCode();
                    if (OrderNum != null)
                    hashCode = hashCode * 59 + OrderNum.GetHashCode();
                    if (RecipientName != null)
                    hashCode = hashCode * 59 + RecipientName.GetHashCode();
                    
                    hashCode = hashCode * 59 + BoxId.GetHashCode();
                    if (FulfilmentId != null)
                    hashCode = hashCode * 59 + FulfilmentId.GetHashCode();
                    if (Place != null)
                    hashCode = hashCode * 59 + Place.GetHashCode();
                    if (Weight != null)
                    hashCode = hashCode * 59 + Weight.GetHashCode();
                    if (DeliveryServiceId != null)
                    hashCode = hashCode * 59 + DeliveryServiceId.GetHashCode();
                    if (DeliveryAddress != null)
                    hashCode = hashCode * 59 + DeliveryAddress.GetHashCode();
                    if (ShipmentDate != null)
                    hashCode = hashCode * 59 + ShipmentDate.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ParcelBoxLabelDTO left, ParcelBoxLabelDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ParcelBoxLabelDTO left, ParcelBoxLabelDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
