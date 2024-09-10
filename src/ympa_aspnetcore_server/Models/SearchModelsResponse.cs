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
using ympa_aspnetcore_server.Converters;

namespace ympa_aspnetcore_server.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class SearchModelsResponse : IEquatable<SearchModelsResponse>
    {
        /// <summary>
        /// Список моделей товаров.
        /// </summary>
        /// <value>Список моделей товаров.</value>
        [Required]
        [DataMember(Name="models", EmitDefaultValue=false)]
        public List<ModelDTO> Models { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name="currency", EmitDefaultValue=true)]
        public CurrencyType Currency { get; set; }

        /// <summary>
        /// Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
        /// </summary>
        /// <value>Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). </value>
        [DataMember(Name="regionId", EmitDefaultValue=true)]
        public long RegionId { get; set; }

        /// <summary>
        /// Gets or Sets Pager
        /// </summary>
        [DataMember(Name="pager", EmitDefaultValue=false)]
        public FlippingPagerDTO Pager { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SearchModelsResponse {\n");
            sb.Append("  Models: ").Append(Models).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  RegionId: ").Append(RegionId).Append("\n");
            sb.Append("  Pager: ").Append(Pager).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
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
            return obj.GetType() == GetType() && Equals((SearchModelsResponse)obj);
        }

        /// <summary>
        /// Returns true if SearchModelsResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of SearchModelsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SearchModelsResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Models == other.Models ||
                    Models != null &&
                    other.Models != null &&
                    Models.SequenceEqual(other.Models)
                ) && 
                (
                    Currency == other.Currency ||
                    
                    Currency.Equals(other.Currency)
                ) && 
                (
                    RegionId == other.RegionId ||
                    
                    RegionId.Equals(other.RegionId)
                ) && 
                (
                    Pager == other.Pager ||
                    Pager != null &&
                    Pager.Equals(other.Pager)
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
                    if (Models != null)
                    hashCode = hashCode * 59 + Models.GetHashCode();
                    
                    hashCode = hashCode * 59 + Currency.GetHashCode();
                    
                    hashCode = hashCode * 59 + RegionId.GetHashCode();
                    if (Pager != null)
                    hashCode = hashCode * 59 + Pager.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(SearchModelsResponse left, SearchModelsResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(SearchModelsResponse left, SearchModelsResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
