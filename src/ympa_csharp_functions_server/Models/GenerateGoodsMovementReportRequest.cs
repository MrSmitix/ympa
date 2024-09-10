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
    /// Данные, необходимые для генерации отчета.
    /// </summary>
    [DataContract]
    public partial class GenerateGoodsMovementReportRequest : IEquatable<GenerateGoodsMovementReportRequest>
    {
        /// <summary>
        /// Идентификатор кампании.
        /// </summary>
        /// <value>Идентификатор кампании.</value>
        [Required]
        [DataMember(Name="campaignId", EmitDefaultValue=false)]
        public long CampaignId { get; set; }

        /// <summary>
        /// Начало периода, включительно.
        /// </summary>
        /// <value>Начало периода, включительно.</value>
        [Required]
        [DataMember(Name="dateFrom", EmitDefaultValue=false)]
        public DateOnly DateFrom { get; set; }

        /// <summary>
        /// Конец периода, включительно.
        /// </summary>
        /// <value>Конец периода, включительно.</value>
        [Required]
        [DataMember(Name="dateTo", EmitDefaultValue=false)]
        public DateOnly DateTo { get; set; }

        /// <summary>
        /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
        /// </summary>
        /// <value>Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) </value>
        [RegularExpression("^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")]
        [StringLength(255, MinimumLength=1)]
        [DataMember(Name="shopSku", EmitDefaultValue=false)]
        public string ShopSku { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GenerateGoodsMovementReportRequest {\n");
            sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
            sb.Append("  DateFrom: ").Append(DateFrom).Append("\n");
            sb.Append("  DateTo: ").Append(DateTo).Append("\n");
            sb.Append("  ShopSku: ").Append(ShopSku).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GenerateGoodsMovementReportRequest)obj);
        }

        /// <summary>
        /// Returns true if GenerateGoodsMovementReportRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GenerateGoodsMovementReportRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GenerateGoodsMovementReportRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CampaignId == other.CampaignId ||
                    
                    CampaignId.Equals(other.CampaignId)
                ) && 
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
                    ShopSku == other.ShopSku ||
                    ShopSku != null &&
                    ShopSku.Equals(other.ShopSku)
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
                    if (DateFrom != null)
                    hashCode = hashCode * 59 + DateFrom.GetHashCode();
                    if (DateTo != null)
                    hashCode = hashCode * 59 + DateTo.GetHashCode();
                    if (ShopSku != null)
                    hashCode = hashCode * 59 + ShopSku.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GenerateGoodsMovementReportRequest left, GenerateGoodsMovementReportRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GenerateGoodsMovementReportRequest left, GenerateGoodsMovementReportRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
