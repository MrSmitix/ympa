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
    /// Информация о группе складов.
    /// </summary>
    [DataContract]
    public partial class WarehouseGroupDTO : IEquatable<WarehouseGroupDTO>
    {
        /// <summary>
        /// Название группы складов.
        /// </summary>
        /// <value>Название группы складов.</value>
        [Required]
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets MainWarehouse
        /// </summary>
        [Required]
        [DataMember(Name="mainWarehouse", EmitDefaultValue=false)]
        public WarehouseDTO MainWarehouse { get; set; }

        /// <summary>
        /// Список складов, входящих в группу.
        /// </summary>
        /// <value>Список складов, входящих в группу.</value>
        [Required]
        [DataMember(Name="warehouses", EmitDefaultValue=false)]
        public List<WarehouseDTO> Warehouses { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WarehouseGroupDTO {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  MainWarehouse: ").Append(MainWarehouse).Append("\n");
            sb.Append("  Warehouses: ").Append(Warehouses).Append("\n");
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
            return obj.GetType() == GetType() && Equals((WarehouseGroupDTO)obj);
        }

        /// <summary>
        /// Returns true if WarehouseGroupDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of WarehouseGroupDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WarehouseGroupDTO other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    MainWarehouse == other.MainWarehouse ||
                    MainWarehouse != null &&
                    MainWarehouse.Equals(other.MainWarehouse)
                ) && 
                (
                    Warehouses == other.Warehouses ||
                    Warehouses != null &&
                    other.Warehouses != null &&
                    Warehouses.SequenceEqual(other.Warehouses)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (MainWarehouse != null)
                    hashCode = hashCode * 59 + MainWarehouse.GetHashCode();
                    if (Warehouses != null)
                    hashCode = hashCode * 59 + Warehouses.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(WarehouseGroupDTO left, WarehouseGroupDTO right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(WarehouseGroupDTO left, WarehouseGroupDTO right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
