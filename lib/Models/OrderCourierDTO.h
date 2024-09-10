
/*
 * OrderCourierDTO.h
 *
 * Информация о курьере.
 */

#ifndef TINY_CPP_CLIENT_OrderCourierDTO_H_
#define TINY_CPP_CLIENT_OrderCourierDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о курьере.
 *
 *  \ingroup Models
 *
 */

class OrderCourierDTO{
public:

    /*! \brief Constructor.
	 */
    OrderCourierDTO();
    OrderCourierDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderCourierDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string fullName{};
    std::string phone{};
    std::string phoneExtension{};
    std::string vehicleNumber{};
    std::string vehicleDescription{};
};
}

#endif /* TINY_CPP_CLIENT_OrderCourierDTO_H_ */
