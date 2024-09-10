/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = ympa_csharp_client.Client.OpenAPIDateConverter;

namespace ympa_csharp_client.Model
{
    /// <summary>
    /// GetRegionWithChildrenResponse
    /// </summary>
    [DataContract(Name = "GetRegionWithChildrenResponse")]
    public partial class GetRegionWithChildrenResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetRegionWithChildrenResponse" /> class.
        /// </summary>
        /// <param name="pager">pager.</param>
        /// <param name="regions">regions.</param>
        public GetRegionWithChildrenResponse(FlippingPagerDTO pager = default(FlippingPagerDTO), RegionDTO regions = default(RegionDTO))
        {
            this.Pager = pager;
            this.Regions = regions;
        }

        /// <summary>
        /// Gets or Sets Pager
        /// </summary>
        [DataMember(Name = "pager", EmitDefaultValue = false)]
        public FlippingPagerDTO Pager { get; set; }

        /// <summary>
        /// Gets or Sets Regions
        /// </summary>
        [DataMember(Name = "regions", EmitDefaultValue = false)]
        public RegionDTO Regions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetRegionWithChildrenResponse {\n");
            sb.Append("  Pager: ").Append(Pager).Append("\n");
            sb.Append("  Regions: ").Append(Regions).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
