/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ympa_cpp_restsdk_client/model/ChangeOutletRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ChangeOutletRequest::ChangeOutletRequest()
{
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_TypeIsSet = false;
    m_Coords = utility::conversions::to_string_t("");
    m_CoordsIsSet = false;
    m_IsMain = false;
    m_IsMainIsSet = false;
    m_ShopOutletCode = utility::conversions::to_string_t("");
    m_ShopOutletCodeIsSet = false;
    m_VisibilityIsSet = false;
    m_AddressIsSet = false;
    m_PhonesIsSet = false;
    m_WorkingScheduleIsSet = false;
    m_DeliveryRulesIsSet = false;
    m_StoragePeriod = 0L;
    m_StoragePeriodIsSet = false;
}

ChangeOutletRequest::~ChangeOutletRequest()
{
}

void ChangeOutletRequest::validate()
{
    // TODO: implement validation
}

web::json::value ChangeOutletRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_CoordsIsSet)
    {
        val[utility::conversions::to_string_t(U("coords"))] = ModelBase::toJson(m_Coords);
    }
    if(m_IsMainIsSet)
    {
        val[utility::conversions::to_string_t(U("isMain"))] = ModelBase::toJson(m_IsMain);
    }
    if(m_ShopOutletCodeIsSet)
    {
        val[utility::conversions::to_string_t(U("shopOutletCode"))] = ModelBase::toJson(m_ShopOutletCode);
    }
    if(m_VisibilityIsSet)
    {
        val[utility::conversions::to_string_t(U("visibility"))] = ModelBase::toJson(m_Visibility);
    }
    if(m_AddressIsSet)
    {
        val[utility::conversions::to_string_t(U("address"))] = ModelBase::toJson(m_Address);
    }
    if(m_PhonesIsSet)
    {
        val[utility::conversions::to_string_t(U("phones"))] = ModelBase::toJson(m_Phones);
    }
    if(m_WorkingScheduleIsSet)
    {
        val[utility::conversions::to_string_t(U("workingSchedule"))] = ModelBase::toJson(m_WorkingSchedule);
    }
    if(m_DeliveryRulesIsSet)
    {
        val[utility::conversions::to_string_t(U("deliveryRules"))] = ModelBase::toJson(m_DeliveryRules);
    }
    if(m_StoragePeriodIsSet)
    {
        val[utility::conversions::to_string_t(U("storagePeriod"))] = ModelBase::toJson(m_StoragePeriod);
    }

    return val;
}

bool ChangeOutletRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OutletType> refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("coords"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("coords")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCoords;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCoords);
            setCoords(refVal_setCoords);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("isMain"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("isMain")));
        if(!fieldValue.is_null())
        {
            bool refVal_setIsMain;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIsMain);
            setIsMain(refVal_setIsMain);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("shopOutletCode"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("shopOutletCode")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setShopOutletCode;
            ok &= ModelBase::fromJson(fieldValue, refVal_setShopOutletCode);
            setShopOutletCode(refVal_setShopOutletCode);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("visibility"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("visibility")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OutletVisibilityType> refVal_setVisibility;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVisibility);
            setVisibility(refVal_setVisibility);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("address"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("address")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OutletAddressDTO> refVal_setAddress;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAddress);
            setAddress(refVal_setAddress);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("phones"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("phones")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setPhones;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPhones);
            setPhones(refVal_setPhones);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("workingSchedule"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("workingSchedule")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OutletWorkingScheduleDTO> refVal_setWorkingSchedule;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWorkingSchedule);
            setWorkingSchedule(refVal_setWorkingSchedule);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("deliveryRules"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("deliveryRules")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<OutletDeliveryRuleDTO>> refVal_setDeliveryRules;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDeliveryRules);
            setDeliveryRules(refVal_setDeliveryRules);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("storagePeriod"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("storagePeriod")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setStoragePeriod;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStoragePeriod);
            setStoragePeriod(refVal_setStoragePeriod);
        }
    }
    return ok;
}

void ChangeOutletRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_CoordsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("coords")), m_Coords));
    }
    if(m_IsMainIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("isMain")), m_IsMain));
    }
    if(m_ShopOutletCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("shopOutletCode")), m_ShopOutletCode));
    }
    if(m_VisibilityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("visibility")), m_Visibility));
    }
    if(m_AddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("address")), m_Address));
    }
    if(m_PhonesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("phones")), m_Phones));
    }
    if(m_WorkingScheduleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("workingSchedule")), m_WorkingSchedule));
    }
    if(m_DeliveryRulesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("deliveryRules")), m_DeliveryRules));
    }
    if(m_StoragePeriodIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("storagePeriod")), m_StoragePeriod));
    }
}

bool ChangeOutletRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        std::shared_ptr<OutletType> refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("coords"))))
    {
        utility::string_t refVal_setCoords;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("coords"))), refVal_setCoords );
        setCoords(refVal_setCoords);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("isMain"))))
    {
        bool refVal_setIsMain;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("isMain"))), refVal_setIsMain );
        setIsMain(refVal_setIsMain);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("shopOutletCode"))))
    {
        utility::string_t refVal_setShopOutletCode;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("shopOutletCode"))), refVal_setShopOutletCode );
        setShopOutletCode(refVal_setShopOutletCode);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("visibility"))))
    {
        std::shared_ptr<OutletVisibilityType> refVal_setVisibility;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("visibility"))), refVal_setVisibility );
        setVisibility(refVal_setVisibility);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("address"))))
    {
        std::shared_ptr<OutletAddressDTO> refVal_setAddress;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("address"))), refVal_setAddress );
        setAddress(refVal_setAddress);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("phones"))))
    {
        std::vector<utility::string_t> refVal_setPhones;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("phones"))), refVal_setPhones );
        setPhones(refVal_setPhones);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("workingSchedule"))))
    {
        std::shared_ptr<OutletWorkingScheduleDTO> refVal_setWorkingSchedule;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("workingSchedule"))), refVal_setWorkingSchedule );
        setWorkingSchedule(refVal_setWorkingSchedule);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("deliveryRules"))))
    {
        std::vector<std::shared_ptr<OutletDeliveryRuleDTO>> refVal_setDeliveryRules;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("deliveryRules"))), refVal_setDeliveryRules );
        setDeliveryRules(refVal_setDeliveryRules);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("storagePeriod"))))
    {
        int64_t refVal_setStoragePeriod;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("storagePeriod"))), refVal_setStoragePeriod );
        setStoragePeriod(refVal_setStoragePeriod);
    }
    return ok;
}

utility::string_t ChangeOutletRequest::getName() const
{
    return m_Name;
}

void ChangeOutletRequest::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool ChangeOutletRequest::nameIsSet() const
{
    return m_NameIsSet;
}

void ChangeOutletRequest::unsetName()
{
    m_NameIsSet = false;
}
std::shared_ptr<OutletType> ChangeOutletRequest::getType() const
{
    return m_Type;
}

void ChangeOutletRequest::setType(const std::shared_ptr<OutletType>& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool ChangeOutletRequest::typeIsSet() const
{
    return m_TypeIsSet;
}

void ChangeOutletRequest::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t ChangeOutletRequest::getCoords() const
{
    return m_Coords;
}

void ChangeOutletRequest::setCoords(const utility::string_t& value)
{
    m_Coords = value;
    m_CoordsIsSet = true;
}

bool ChangeOutletRequest::coordsIsSet() const
{
    return m_CoordsIsSet;
}

void ChangeOutletRequest::unsetCoords()
{
    m_CoordsIsSet = false;
}
bool ChangeOutletRequest::isIsMain() const
{
    return m_IsMain;
}

void ChangeOutletRequest::setIsMain(bool value)
{
    m_IsMain = value;
    m_IsMainIsSet = true;
}

bool ChangeOutletRequest::isMainIsSet() const
{
    return m_IsMainIsSet;
}

void ChangeOutletRequest::unsetIsMain()
{
    m_IsMainIsSet = false;
}
utility::string_t ChangeOutletRequest::getShopOutletCode() const
{
    return m_ShopOutletCode;
}

void ChangeOutletRequest::setShopOutletCode(const utility::string_t& value)
{
    m_ShopOutletCode = value;
    m_ShopOutletCodeIsSet = true;
}

bool ChangeOutletRequest::shopOutletCodeIsSet() const
{
    return m_ShopOutletCodeIsSet;
}

void ChangeOutletRequest::unsetShopOutletCode()
{
    m_ShopOutletCodeIsSet = false;
}
std::shared_ptr<OutletVisibilityType> ChangeOutletRequest::getVisibility() const
{
    return m_Visibility;
}

void ChangeOutletRequest::setVisibility(const std::shared_ptr<OutletVisibilityType>& value)
{
    m_Visibility = value;
    m_VisibilityIsSet = true;
}

bool ChangeOutletRequest::visibilityIsSet() const
{
    return m_VisibilityIsSet;
}

void ChangeOutletRequest::unsetVisibility()
{
    m_VisibilityIsSet = false;
}
std::shared_ptr<OutletAddressDTO> ChangeOutletRequest::getAddress() const
{
    return m_Address;
}

void ChangeOutletRequest::setAddress(const std::shared_ptr<OutletAddressDTO>& value)
{
    m_Address = value;
    m_AddressIsSet = true;
}

bool ChangeOutletRequest::addressIsSet() const
{
    return m_AddressIsSet;
}

void ChangeOutletRequest::unsetAddress()
{
    m_AddressIsSet = false;
}
std::vector<utility::string_t>& ChangeOutletRequest::getPhones()
{
    return m_Phones;
}

void ChangeOutletRequest::setPhones(const std::vector<utility::string_t>& value)
{
    m_Phones = value;
    m_PhonesIsSet = true;
}

bool ChangeOutletRequest::phonesIsSet() const
{
    return m_PhonesIsSet;
}

void ChangeOutletRequest::unsetPhones()
{
    m_PhonesIsSet = false;
}
std::shared_ptr<OutletWorkingScheduleDTO> ChangeOutletRequest::getWorkingSchedule() const
{
    return m_WorkingSchedule;
}

void ChangeOutletRequest::setWorkingSchedule(const std::shared_ptr<OutletWorkingScheduleDTO>& value)
{
    m_WorkingSchedule = value;
    m_WorkingScheduleIsSet = true;
}

bool ChangeOutletRequest::workingScheduleIsSet() const
{
    return m_WorkingScheduleIsSet;
}

void ChangeOutletRequest::unsetWorkingSchedule()
{
    m_WorkingScheduleIsSet = false;
}
std::vector<std::shared_ptr<OutletDeliveryRuleDTO>>& ChangeOutletRequest::getDeliveryRules()
{
    return m_DeliveryRules;
}

void ChangeOutletRequest::setDeliveryRules(const std::vector<std::shared_ptr<OutletDeliveryRuleDTO>>& value)
{
    m_DeliveryRules = value;
    m_DeliveryRulesIsSet = true;
}

bool ChangeOutletRequest::deliveryRulesIsSet() const
{
    return m_DeliveryRulesIsSet;
}

void ChangeOutletRequest::unsetDeliveryRules()
{
    m_DeliveryRulesIsSet = false;
}
int64_t ChangeOutletRequest::getStoragePeriod() const
{
    return m_StoragePeriod;
}

void ChangeOutletRequest::setStoragePeriod(int64_t value)
{
    m_StoragePeriod = value;
    m_StoragePeriodIsSet = true;
}

bool ChangeOutletRequest::storagePeriodIsSet() const
{
    return m_StoragePeriodIsSet;
}

void ChangeOutletRequest::unsetStoragePeriod()
{
    m_StoragePeriodIsSet = false;
}
}
}
}
}


