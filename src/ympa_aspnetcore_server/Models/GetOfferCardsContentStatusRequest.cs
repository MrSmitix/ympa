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
    public partial class GetOfferCardsContentStatusRequest : IEquatable<GetOfferCardsContentStatusRequest>
    {
        /// <summary>
        /// Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
        /// </summary>
        /// <value>Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. </value>
        [DataMember(Name="offerIds", EmitDefaultValue=true)]
        public List<string> OfferIds { get; set; }

        /// <summary>
        /// Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
        /// </summary>
        /// <value>Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) </value>
        [DataMember(Name="cardStatuses", EmitDefaultValue=true)]
        public List<OfferCardStatusType> CardStatuses { get; set; }

        /// <summary>
        /// Фильтр по категориям на Маркете.
        /// </summary>
        /// <value>Фильтр по категориям на Маркете.</value>
        [DataMember(Name="categoryIds", EmitDefaultValue=true)]
        public List<int> CategoryIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GetOfferCardsContentStatusRequest {\n");
            sb.Append("  OfferIds: ").Append(OfferIds).Append("\n");
            sb.Append("  CardStatuses: ").Append(CardStatuses).Append("\n");
            sb.Append("  CategoryIds: ").Append(CategoryIds).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GetOfferCardsContentStatusRequest)obj);
        }

        /// <summary>
        /// Returns true if GetOfferCardsContentStatusRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GetOfferCardsContentStatusRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetOfferCardsContentStatusRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    OfferIds == other.OfferIds ||
                    OfferIds != null &&
                    other.OfferIds != null &&
                    OfferIds.SequenceEqual(other.OfferIds)
                ) && 
                (
                    CardStatuses == other.CardStatuses ||
                    CardStatuses != null &&
                    other.CardStatuses != null &&
                    CardStatuses.SequenceEqual(other.CardStatuses)
                ) && 
                (
                    CategoryIds == other.CategoryIds ||
                    CategoryIds != null &&
                    other.CategoryIds != null &&
                    CategoryIds.SequenceEqual(other.CategoryIds)
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
                    if (OfferIds != null)
                    hashCode = hashCode * 59 + OfferIds.GetHashCode();
                    if (CardStatuses != null)
                    hashCode = hashCode * 59 + CardStatuses.GetHashCode();
                    if (CategoryIds != null)
                    hashCode = hashCode * 59 + CategoryIds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GetOfferCardsContentStatusRequest left, GetOfferCardsContentStatusRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GetOfferCardsContentStatusRequest left, GetOfferCardsContentStatusRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
