
/*
 * OutletDTO.h
 *
 * Информация о точке продаж.
 */

#ifndef TINY_CPP_CLIENT_OutletDTO_H_
#define TINY_CPP_CLIENT_OutletDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OutletAddressDTO.h"
#include "OutletDeliveryRuleDTO.h"
#include "OutletType.h"
#include "OutletVisibilityType.h"
#include "OutletWorkingScheduleDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о точке продаж.
 *
 *  \ingroup Models
 *
 */

class OutletDTO{
public:

    /*! \brief Constructor.
	 */
    OutletDTO();
    OutletDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Название точки продаж. 
	 */
	std::string getName();

	/*! \brief Set Название точки продаж. 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	OutletType getType();

	/*! \brief Set 
	 */
	void setType(OutletType  type);
	/*! \brief Get Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
	 */
	std::string getCoords();

	/*! \brief Set Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
	 */
	void setCoords(std::string  coords);
	/*! \brief Get Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
	 */
	bool isIsMain();

	/*! \brief Set Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
	 */
	void setIsMain(bool  isMain);
	/*! \brief Get Идентификатор точки продаж, присвоенный магазином.
	 */
	std::string getShopOutletCode();

	/*! \brief Set Идентификатор точки продаж, присвоенный магазином.
	 */
	void setShopOutletCode(std::string  shopOutletCode);
	/*! \brief Get 
	 */
	OutletVisibilityType getVisibility();

	/*! \brief Set 
	 */
	void setVisibility(OutletVisibilityType  visibility);
	/*! \brief Get 
	 */
	OutletAddressDTO getAddress();

	/*! \brief Set 
	 */
	void setAddress(OutletAddressDTO  address);
	/*! \brief Get Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
	 */
	std::list<std::string> getPhones();

	/*! \brief Set Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
	 */
	void setPhones(std::list <std::string> phones);
	/*! \brief Get 
	 */
	OutletWorkingScheduleDTO getWorkingSchedule();

	/*! \brief Set 
	 */
	void setWorkingSchedule(OutletWorkingScheduleDTO  workingSchedule);
	/*! \brief Get Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
	 */
	std::list<OutletDeliveryRuleDTO> getDeliveryRules();

	/*! \brief Set Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
	 */
	void setDeliveryRules(std::list <OutletDeliveryRuleDTO> deliveryRules);
	/*! \brief Get Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
	 */
	long getStoragePeriod();

	/*! \brief Set Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
	 */
	void setStoragePeriod(long  storagePeriod);


    private:
    std::string name{};
    OutletType type;
    std::string coords{};
    bool isMain{};
    std::string shopOutletCode{};
    OutletVisibilityType visibility;
    OutletAddressDTO address;
    std::list<std::string> phones;
    OutletWorkingScheduleDTO workingSchedule;
    std::list<OutletDeliveryRuleDTO> deliveryRules;
    long storagePeriod{};
};
}

#endif /* TINY_CPP_CLIENT_OutletDTO_H_ */
