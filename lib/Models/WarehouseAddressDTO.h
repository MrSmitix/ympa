
/*
 * WarehouseAddressDTO.h
 *
 * Адрес склада.
 */

#ifndef TINY_CPP_CLIENT_WarehouseAddressDTO_H_
#define TINY_CPP_CLIENT_WarehouseAddressDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GpsDTO.h"

namespace Tiny {


/*! \brief Адрес склада.
 *
 *  \ingroup Models
 *
 */

class WarehouseAddressDTO{
public:

    /*! \brief Constructor.
	 */
    WarehouseAddressDTO();
    WarehouseAddressDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~WarehouseAddressDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string city{};
    std::string street{};
    std::string number{};
    std::string building{};
    std::string block{};
    GpsDTO gps;
};
}

#endif /* TINY_CPP_CLIENT_WarehouseAddressDTO_H_ */
