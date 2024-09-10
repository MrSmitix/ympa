/*
 * OrderCourierDTO.h
 *
 * Информация о курьере.
 */

#ifndef _OrderCourierDTO_H_
#define _OrderCourierDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о курьере.
 *
 *  \ingroup Models
 *
 */

class OrderCourierDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderCourierDTO();
	OrderCourierDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderCourierDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Полное имя курьера.
	 */
	std::string getFullName();

	/*! \brief Set Полное имя курьера.
	 */
	void setFullName(std::string  fullName);
	/*! \brief Get Номер телефона курьера.
	 */
	std::string getPhone();

	/*! \brief Set Номер телефона курьера.
	 */
	void setPhone(std::string  phone);
	/*! \brief Get Добавочный номер телефона.
	 */
	std::string getPhoneExtension();

	/*! \brief Set Добавочный номер телефона.
	 */
	void setPhoneExtension(std::string  phoneExtension);
	/*! \brief Get Номер транспортного средства.
	 */
	std::string getVehicleNumber();

	/*! \brief Set Номер транспортного средства.
	 */
	void setVehicleNumber(std::string  vehicleNumber);
	/*! \brief Get Описание машины. Например, модель и цвет.
	 */
	std::string getVehicleDescription();

	/*! \brief Set Описание машины. Например, модель и цвет.
	 */
	void setVehicleDescription(std::string  vehicleDescription);

private:
	std::string fullName;
	std::string phone;
	std::string phoneExtension;
	std::string vehicleNumber;
	std::string vehicleDescription;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderCourierDTO_H_ */
