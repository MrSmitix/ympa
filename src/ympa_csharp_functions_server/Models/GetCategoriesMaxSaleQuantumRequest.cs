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
    /// Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
    /// </summary>
    [DataContract]
    public partial class GetCategoriesMaxSaleQuantumRequest : IEquatable<GetCategoriesMaxSaleQuantumRequest>
    {
        /// <summary>
        /// Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
        /// </summary>
        /// <value>Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.</value>
        [Required]
        [DataMember(Name="marketCategoryIds", EmitDefaultValue=false)]
        public List<long> MarketCategoryIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetCategoriesMaxSaleQuantumRequest {\n");
            sb.Append("  MarketCategoryIds: ").Append(MarketCategoryIds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetCategoriesMaxSaleQuantumRequest)obj);
        }

        /// <summary>
        /// Returns true if GetCategoriesMaxSaleQuantumRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GetCategoriesMaxSaleQuantumRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetCategoriesMaxSaleQuantumRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    MarketCategoryIds == other.MarketCategoryIds ||
                    MarketCategoryIds != null &&
                    other.MarketCategoryIds != null &&
                    MarketCategoryIds.SequenceEqual(other.MarketCategoryIds)
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
                    if (MarketCategoryIds != null)
                    hashCode = hashCode * 59 + MarketCategoryIds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetCategoriesMaxSaleQuantumRequest left, GetCategoriesMaxSaleQuantumRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetCategoriesMaxSaleQuantumRequest left, GetCategoriesMaxSaleQuantumRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
