
/*
 * PartnerShipmentWarehouseDTO.h
 *
 * Данные о складе отправления.
 */

#ifndef TINY_CPP_CLIENT_PartnerShipmentWarehouseDTO_H_
#define TINY_CPP_CLIENT_PartnerShipmentWarehouseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Данные о складе отправления.
 *
 *  \ingroup Models
 *
 */

class PartnerShipmentWarehouseDTO{
public:

    /*! \brief Constructor.
	 */
    PartnerShipmentWarehouseDTO();
    PartnerShipmentWarehouseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PartnerShipmentWarehouseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор склада отправления.
	 */
	long getId();

	/*! \brief Set Идентификатор склада отправления.
	 */
	void setId(long  id);
	/*! \brief Get Наименование склада отправления.
	 */
	std::string getName();

	/*! \brief Set Наименование склада отправления.
	 */
	void setName(std::string  name);
	/*! \brief Get Адрес склада отправления.
	 */
	std::string getAddress();

	/*! \brief Set Адрес склада отправления.
	 */
	void setAddress(std::string  address);


    private:
    long id{};
    std::string name{};
    std::string address{};
};
}

#endif /* TINY_CPP_CLIENT_PartnerShipmentWarehouseDTO_H_ */
