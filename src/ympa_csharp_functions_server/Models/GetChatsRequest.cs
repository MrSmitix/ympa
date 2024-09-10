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
    /// Фильтры по чатам, которые нужно вернуть. 
    /// </summary>
    [DataContract]
    public partial class GetChatsRequest : IEquatable<GetChatsRequest>
    {
        /// <summary>
        /// Фильтр по идентификаторам заказов на Маркете.
        /// </summary>
        /// <value>Фильтр по идентификаторам заказов на Маркете.</value>
        [DataMember(Name="orderIds", EmitDefaultValue=true)]
        public List<long> OrderIds { get; set; }

        /// <summary>
        /// Фильтр по типам чатов.
        /// </summary>
        /// <value>Фильтр по типам чатов.</value>
        [DataMember(Name="types", EmitDefaultValue=true)]
        public List<ChatType> Types { get; set; }

        /// <summary>
        /// Фильтр по статусам чатов.
        /// </summary>
        /// <value>Фильтр по статусам чатов.</value>
        [DataMember(Name="statuses", EmitDefaultValue=true)]
        public List<ChatStatusType> Statuses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetChatsRequest {\n");
            sb.Append("  OrderIds: ").Append(OrderIds).Append("\n");
            sb.Append("  Types: ").Append(Types).Append("\n");
            sb.Append("  Statuses: ").Append(Statuses).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetChatsRequest)obj);
        }

        /// <summary>
        /// Returns true if GetChatsRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GetChatsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetChatsRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    OrderIds == other.OrderIds ||
                    OrderIds != null &&
                    other.OrderIds != null &&
                    OrderIds.SequenceEqual(other.OrderIds)
                ) && 
                (
                    Types == other.Types ||
                    Types != null &&
                    other.Types != null &&
                    Types.SequenceEqual(other.Types)
                ) && 
                (
                    Statuses == other.Statuses ||
                    Statuses != null &&
                    other.Statuses != null &&
                    Statuses.SequenceEqual(other.Statuses)
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
                    if (OrderIds != null)
                    hashCode = hashCode * 59 + OrderIds.GetHashCode();
                    if (Types != null)
                    hashCode = hashCode * 59 + Types.GetHashCode();
                    if (Statuses != null)
                    hashCode = hashCode * 59 + Statuses.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetChatsRequest left, GetChatsRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetChatsRequest left, GetChatsRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
