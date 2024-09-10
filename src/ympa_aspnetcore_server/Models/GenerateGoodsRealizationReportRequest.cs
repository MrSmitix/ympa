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
    /// Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
    /// </summary>
    [DataContract]
    public partial class GenerateGoodsRealizationReportRequest : IEquatable<GenerateGoodsRealizationReportRequest>
    {
        /// <summary>
        /// Идентификатор кампании.
        /// </summary>
        /// <value>Идентификатор кампании.</value>
        [Required]
        [DataMember(Name="campaignId", EmitDefaultValue=true)]
        public long CampaignId { get; set; }

        /// <summary>
        /// Год.
        /// </summary>
        /// <value>Год.</value>
        [Required]
        [DataMember(Name="year", EmitDefaultValue=true)]
        public int Year { get; set; }

        /// <summary>
        /// Номер месяца.
        /// </summary>
        /// <value>Номер месяца.</value>
        [Required]
        [Range(1, 12)]
        [DataMember(Name="month", EmitDefaultValue=true)]
        public int Month { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GenerateGoodsRealizationReportRequest {\n");
            sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
            sb.Append("  Year: ").Append(Year).Append("\n");
            sb.Append("  Month: ").Append(Month).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GenerateGoodsRealizationReportRequest)obj);
        }

        /// <summary>
        /// Returns true if GenerateGoodsRealizationReportRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GenerateGoodsRealizationReportRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GenerateGoodsRealizationReportRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CampaignId == other.CampaignId ||
                    
                    CampaignId.Equals(other.CampaignId)
                ) && 
                (
                    Year == other.Year ||
                    
                    Year.Equals(other.Year)
                ) && 
                (
                    Month == other.Month ||
                    
                    Month.Equals(other.Month)
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
                    
                    hashCode = hashCode * 59 + CampaignId.GetHashCode();
                    
                    hashCode = hashCode * 59 + Year.GetHashCode();
                    
                    hashCode = hashCode * 59 + Month.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GenerateGoodsRealizationReportRequest left, GenerateGoodsRealizationReportRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GenerateGoodsRealizationReportRequest left, GenerateGoodsRealizationReportRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
