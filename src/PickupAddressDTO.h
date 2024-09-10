/*
 * PickupAddressDTO.h
 *
 * Адрес доставки.
 */

#ifndef _PickupAddressDTO_H_
#define _PickupAddressDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Адрес доставки.
 *
 *  \ingroup Models
 *
 */

class PickupAddressDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PickupAddressDTO();
	PickupAddressDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PickupAddressDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Страна.
	 */
	std::string getCountry();

	/*! \brief Set Страна.
	 */
	void setCountry(std::string  country);
	/*! \brief Get Город.
	 */
	std::string getCity();

	/*! \brief Set Город.
	 */
	void setCity(std::string  city);
	/*! \brief Get Улица.
	 */
	std::string getStreet();

	/*! \brief Set Улица.
	 */
	void setStreet(std::string  street);
	/*! \brief Get Номер дома.
	 */
	std::string getHouse();

	/*! \brief Set Номер дома.
	 */
	void setHouse(std::string  house);
	/*! \brief Get Почтовый индекс.
	 */
	std::string getPostcode();

	/*! \brief Set Почтовый индекс.
	 */
	void setPostcode(std::string  postcode);

private:
	std::string country;
	std::string city;
	std::string street;
	std::string house;
	std::string postcode;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PickupAddressDTO_H_ */
