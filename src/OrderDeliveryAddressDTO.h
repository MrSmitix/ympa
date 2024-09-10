/*
 * OrderDeliveryAddressDTO.h
 *
 * Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
 */

#ifndef _OrderDeliveryAddressDTO_H_
#define _OrderDeliveryAddressDTO_H_


#include <string>
#include "GpsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryAddressDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderDeliveryAddressDTO();
	OrderDeliveryAddressDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderDeliveryAddressDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Страна.  Обязательный параметр. 
	 */
	std::string getCountry();

	/*! \brief Set Страна.  Обязательный параметр. 
	 */
	void setCountry(std::string  country);
	/*! \brief Get Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
	 */
	std::string getPostcode();

	/*! \brief Set Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
	 */
	void setPostcode(std::string  postcode);
	/*! \brief Get Город или населенный пункт.  Обязательный параметр. 
	 */
	std::string getCity();

	/*! \brief Set Город или населенный пункт.  Обязательный параметр. 
	 */
	void setCity(std::string  city);
	/*! \brief Get Район.
	 */
	std::string getDistrict();

	/*! \brief Set Район.
	 */
	void setDistrict(std::string  district);
	/*! \brief Get Станция метро.
	 */
	std::string getSubway();

	/*! \brief Set Станция метро.
	 */
	void setSubway(std::string  subway);
	/*! \brief Get Улица.  Обязательный параметр. 
	 */
	std::string getStreet();

	/*! \brief Set Улица.  Обязательный параметр. 
	 */
	void setStreet(std::string  street);
	/*! \brief Get Дом или владение.  Обязательный параметр. 
	 */
	std::string getHouse();

	/*! \brief Set Дом или владение.  Обязательный параметр. 
	 */
	void setHouse(std::string  house);
	/*! \brief Get Корпус или строение.
	 */
	std::string getBlock();

	/*! \brief Set Корпус или строение.
	 */
	void setBlock(std::string  block);
	/*! \brief Get Подъезд.
	 */
	std::string getEntrance();

	/*! \brief Set Подъезд.
	 */
	void setEntrance(std::string  entrance);
	/*! \brief Get Код домофона.
	 */
	std::string getEntryphone();

	/*! \brief Set Код домофона.
	 */
	void setEntryphone(std::string  entryphone);
	/*! \brief Get Этаж.
	 */
	std::string getFloor();

	/*! \brief Set Этаж.
	 */
	void setFloor(std::string  floor);
	/*! \brief Get Квартира или офис.
	 */
	std::string getApartment();

	/*! \brief Set Квартира или офис.
	 */
	void setApartment(std::string  apartment);
	/*! \brief Get Телефон получателя заказа.  Обязательный параметр. 
	 */
	std::string getPhone();

	/*! \brief Set Телефон получателя заказа.  Обязательный параметр. 
	 */
	void setPhone(std::string  phone);
	/*! \brief Get Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
	 */
	std::string getRecipient();

	/*! \brief Set Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
	 */
	void setRecipient(std::string  recipient);
	/*! \brief Get 
	 */
	GpsDTO getGps();

	/*! \brief Set 
	 */
	void setGps(GpsDTO  gps);

private:
	std::string country;
	std::string postcode;
	std::string city;
	std::string district;
	std::string subway;
	std::string street;
	std::string house;
	std::string block;
	std::string entrance;
	std::string entryphone;
	std::string floor;
	std::string apartment;
	std::string phone;
	std::string recipient;
	GpsDTO gps;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderDeliveryAddressDTO_H_ */
