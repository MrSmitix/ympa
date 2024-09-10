/*
 * PartnerShipmentWarehouseDTO.h
 *
 * Данные о складе отправления.
 */

#ifndef _PartnerShipmentWarehouseDTO_H_
#define _PartnerShipmentWarehouseDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные о складе отправления.
 *
 *  \ingroup Models
 *
 */

class PartnerShipmentWarehouseDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PartnerShipmentWarehouseDTO();
	PartnerShipmentWarehouseDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PartnerShipmentWarehouseDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор склада отправления.
	 */
	long long getId();

	/*! \brief Set Идентификатор склада отправления.
	 */
	void setId(long long  id);
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
	long long id;
	std::string name;
	std::string address;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PartnerShipmentWarehouseDTO_H_ */
