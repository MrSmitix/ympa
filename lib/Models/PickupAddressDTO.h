
/*
 * PickupAddressDTO.h
 *
 * Адрес доставки.
 */

#ifndef TINY_CPP_CLIENT_PickupAddressDTO_H_
#define TINY_CPP_CLIENT_PickupAddressDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Адрес доставки.
 *
 *  \ingroup Models
 *
 */

class PickupAddressDTO{
public:

    /*! \brief Constructor.
	 */
    PickupAddressDTO();
    PickupAddressDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PickupAddressDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string country{};
    std::string city{};
    std::string street{};
    std::string house{};
    std::string postcode{};
};
}

#endif /* TINY_CPP_CLIENT_PickupAddressDTO_H_ */
