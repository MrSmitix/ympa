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
    /// Запрос информации по заказам.
    /// </summary>
    [DataContract]
    public partial class GetOrdersStatsRequest : IEquatable<GetOrdersStatsRequest>
    {
        /// <summary>
        /// Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
        /// </summary>
        /// <value>Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. </value>
        [DataMember(Name="dateFrom", EmitDefaultValue=false)]
        public DateOnly DateFrom { get; set; }

        /// <summary>
        /// Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
        /// </summary>
        /// <value>Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. </value>
        [DataMember(Name="dateTo", EmitDefaultValue=false)]
        public DateOnly DateTo { get; set; }

        /// <summary>
        /// Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
        /// </summary>
        /// <value>Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. </value>
        [DataMember(Name="updateFrom", EmitDefaultValue=false)]
        public DateOnly UpdateFrom { get; set; }

        /// <summary>
        /// Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
        /// </summary>
        /// <value>Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. </value>
        [DataMember(Name="updateTo", EmitDefaultValue=false)]
        public DateOnly UpdateTo { get; set; }

        /// <summary>
        /// Список идентификаторов заказов.
        /// </summary>
        /// <value>Список идентификаторов заказов.</value>
        [DataMember(Name="orders", EmitDefaultValue=true)]
        public List<long> Orders { get; set; }

        /// <summary>
        /// Список статусов заказов.
        /// </summary>
        /// <value>Список статусов заказов.</value>
        [DataMember(Name="statuses", EmitDefaultValue=true)]
        public List<OrderStatsStatusType> Statuses { get; set; }

        /// <summary>
        /// Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
        /// </summary>
        /// <value>Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. </value>
        [DataMember(Name="hasCis", EmitDefaultValue=false)]
        public bool HasCis { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetOrdersStatsRequest {\n");
            sb.Append("  DateFrom: ").Append(DateFrom).Append("\n");
            sb.Append("  DateTo: ").Append(DateTo).Append("\n");
            sb.Append("  UpdateFrom: ").Append(UpdateFrom).Append("\n");
            sb.Append("  UpdateTo: ").Append(UpdateTo).Append("\n");
            sb.Append("  Orders: ").Append(Orders).Append("\n");
            sb.Append("  Statuses: ").Append(Statuses).Append("\n");
            sb.Append("  HasCis: ").Append(HasCis).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetOrdersStatsRequest)obj);
        }

        /// <summary>
        /// Returns true if GetOrdersStatsRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GetOrdersStatsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetOrdersStatsRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DateFrom == other.DateFrom ||
                    DateFrom != null &&
                    DateFrom.Equals(other.DateFrom)
                ) && 
                (
                    DateTo == other.DateTo ||
                    DateTo != null &&
                    DateTo.Equals(other.DateTo)
                ) && 
                (
                    UpdateFrom == other.UpdateFrom ||
                    UpdateFrom != null &&
                    UpdateFrom.Equals(other.UpdateFrom)
                ) && 
                (
                    UpdateTo == other.UpdateTo ||
                    UpdateTo != null &&
                    UpdateTo.Equals(other.UpdateTo)
                ) && 
                (
                    Orders == other.Orders ||
                    Orders != null &&
                    other.Orders != null &&
                    Orders.SequenceEqual(other.Orders)
                ) && 
                (
                    Statuses == other.Statuses ||
                    Statuses != null &&
                    other.Statuses != null &&
                    Statuses.SequenceEqual(other.Statuses)
                ) && 
                (
                    HasCis == other.HasCis ||
                    
                    HasCis.Equals(other.HasCis)
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
                    if (DateFrom != null)
                    hashCode = hashCode * 59 + DateFrom.GetHashCode();
                    if (DateTo != null)
                    hashCode = hashCode * 59 + DateTo.GetHashCode();
                    if (UpdateFrom != null)
                    hashCode = hashCode * 59 + UpdateFrom.GetHashCode();
                    if (UpdateTo != null)
                    hashCode = hashCode * 59 + UpdateTo.GetHashCode();
                    if (Orders != null)
                    hashCode = hashCode * 59 + Orders.GetHashCode();
                    if (Statuses != null)
                    hashCode = hashCode * 59 + Statuses.GetHashCode();
                    
                    hashCode = hashCode * 59 + HasCis.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetOrdersStatsRequest left, GetOrdersStatsRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetOrdersStatsRequest left, GetOrdersStatsRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
