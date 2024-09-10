/*
 * ChangeOutletRequest.h
 *
 * 
 */

#ifndef _ChangeOutletRequest_H_
#define _ChangeOutletRequest_H_


#include <string>
#include "OutletAddressDTO.h"
#include "OutletDeliveryRuleDTO.h"
#include "OutletType.h"
#include "OutletVisibilityType.h"
#include "OutletWorkingScheduleDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChangeOutletRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ChangeOutletRequest();
	ChangeOutletRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChangeOutletRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	bool getIsMain();

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
	long long getStoragePeriod();

	/*! \brief Set Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
	 */
	void setStoragePeriod(long long  storagePeriod);

private:
	std::string name;
	OutletType type;
	std::string coords;
	bool isMain;
	std::string shopOutletCode;
	OutletVisibilityType visibility;
	OutletAddressDTO address;
	std::list <std::string>phones;
	OutletWorkingScheduleDTO workingSchedule;
	std::list <OutletDeliveryRuleDTO>deliveryRules;
	long long storagePeriod;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChangeOutletRequest_H_ */
