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
    /// Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
    /// </summary>
    [DataContract]
    public partial class PromoOfferUpdateWarningDTO : IEquatable<PromoOfferUpdateWarningDTO>
    {
        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [Required]
        [DataMember(Name="code", EmitDefaultValue=true)]
        public PromoOfferUpdateWarningCodeType Code { get; set; }

        /// <summary>
        /// Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
        /// </summary>
        /// <value>Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. </value>
        [DataMember(Name="campaignIds", EmitDefaultValue=true)]
        public List<long> CampaignIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PromoOfferUpdateWarningDTO {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  CampaignIds: ").Append(CampaignIds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((PromoOfferUpdateWarningDTO)obj);
        }

        /// <summary>
        /// Returns true if PromoOfferUpdateWarningDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of PromoOfferUpdateWarningDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PromoOfferUpdateWarningDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Code == other.Code ||
                    
                    Code.Equals(other.Code)
                ) && 
                (
                    CampaignIds == other.CampaignIds ||
                    CampaignIds != null &&
                    other.CampaignIds != null &&
                    CampaignIds.SequenceEqual(other.CampaignIds)
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
                    
                    hashCode = hashCode * 59 + Code.GetHashCode();
                    if (CampaignIds != null)
                    hashCode = hashCode * 59 + CampaignIds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PromoOfferUpdateWarningDTO left, PromoOfferUpdateWarningDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PromoOfferUpdateWarningDTO left, PromoOfferUpdateWarningDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
