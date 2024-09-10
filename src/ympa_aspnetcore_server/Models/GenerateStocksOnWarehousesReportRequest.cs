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
    /// Данные, необходимые для генерации отчета. 
    /// </summary>
    [DataContract]
    public partial class GenerateStocksOnWarehousesReportRequest : IEquatable<GenerateStocksOnWarehousesReportRequest>
    {
        /// <summary>
        /// Идентификатор магазина.
        /// </summary>
        /// <value>Идентификатор магазина.</value>
        [Required]
        [DataMember(Name="campaignId", EmitDefaultValue=true)]
        public long CampaignId { get; set; }

        /// <summary>
        /// Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
        /// </summary>
        /// <value>Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).</value>
        [DataMember(Name="warehouseIds", EmitDefaultValue=true)]
        public List<long> WarehouseIds { get; set; }

        /// <summary>
        /// Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
        /// </summary>
        /// <value>Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.</value>
        [DataMember(Name="reportDate", EmitDefaultValue=true)]
        public DateOnly ReportDate { get; set; }

        /// <summary>
        /// Фильтр по категориям на Маркете (кроме модели FBY).
        /// </summary>
        /// <value>Фильтр по категориям на Маркете (кроме модели FBY).</value>
        [DataMember(Name="categoryIds", EmitDefaultValue=true)]
        public List<long> CategoryIds { get; set; }

        /// <summary>
        /// Фильтр по наличию остатков (кроме модели FBY).
        /// </summary>
        /// <value>Фильтр по наличию остатков (кроме модели FBY).</value>
        [DataMember(Name="hasStocks", EmitDefaultValue=true)]
        public bool HasStocks { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GenerateStocksOnWarehousesReportRequest {\n");
            sb.Append("  CampaignId: ").Append(CampaignId).Append("\n");
            sb.Append("  WarehouseIds: ").Append(WarehouseIds).Append("\n");
            sb.Append("  ReportDate: ").Append(ReportDate).Append("\n");
            sb.Append("  CategoryIds: ").Append(CategoryIds).Append("\n");
            sb.Append("  HasStocks: ").Append(HasStocks).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GenerateStocksOnWarehousesReportRequest)obj);
        }

        /// <summary>
        /// Returns true if GenerateStocksOnWarehousesReportRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of GenerateStocksOnWarehousesReportRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GenerateStocksOnWarehousesReportRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CampaignId == other.CampaignId ||
                    
                    CampaignId.Equals(other.CampaignId)
                ) && 
                (
                    WarehouseIds == other.WarehouseIds ||
                    WarehouseIds != null &&
                    other.WarehouseIds != null &&
                    WarehouseIds.SequenceEqual(other.WarehouseIds)
                ) && 
                (
                    ReportDate == other.ReportDate ||
                    
                    ReportDate.Equals(other.ReportDate)
                ) && 
                (
                    CategoryIds == other.CategoryIds ||
                    CategoryIds != null &&
                    other.CategoryIds != null &&
                    CategoryIds.SequenceEqual(other.CategoryIds)
                ) && 
                (
                    HasStocks == other.HasStocks ||
                    
                    HasStocks.Equals(other.HasStocks)
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
                    if (WarehouseIds != null)
                    hashCode = hashCode * 59 + WarehouseIds.GetHashCode();
                    
                    hashCode = hashCode * 59 + ReportDate.GetHashCode();
                    if (CategoryIds != null)
                    hashCode = hashCode * 59 + CategoryIds.GetHashCode();
                    
                    hashCode = hashCode * 59 + HasStocks.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GenerateStocksOnWarehousesReportRequest left, GenerateStocksOnWarehousesReportRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GenerateStocksOnWarehousesReportRequest left, GenerateStocksOnWarehousesReportRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
