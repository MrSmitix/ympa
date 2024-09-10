/*
 * WarehouseAddressDTO.h
 *
 * Адрес склада.
 */

#ifndef _WarehouseAddressDTO_H_
#define _WarehouseAddressDTO_H_


#include <string>
#include "GpsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Адрес склада.
 *
 *  \ingroup Models
 *
 */

class WarehouseAddressDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	WarehouseAddressDTO();
	WarehouseAddressDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WarehouseAddressDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string getNumber();

	/*! \brief Set Номер дома.
	 */
	void setNumber(std::string  number);
	/*! \brief Get Номер строения.
	 */
	std::string getBuilding();

	/*! \brief Set Номер строения.
	 */
	void setBuilding(std::string  building);
	/*! \brief Get Номер корпуса.
	 */
	std::string getBlock();

	/*! \brief Set Номер корпуса.
	 */
	void setBlock(std::string  block);
	/*! \brief Get 
	 */
	GpsDTO getGps();

	/*! \brief Set 
	 */
	void setGps(GpsDTO  gps);

private:
	std::string city;
	std::string street;
	std::string number;
	std::string building;
	std::string block;
	GpsDTO gps;
	void __init();
	void __cleanup();

};
}
}

#endif /* _WarehouseAddressDTO_H_ */
