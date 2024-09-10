
/*
 * OrderBuyerInfoDTO.h
 *
 * Информация о покупателе и его номере телефона.
 */

#ifndef TINY_CPP_CLIENT_OrderBuyerInfoDTO_H_
#define TINY_CPP_CLIENT_OrderBuyerInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderBuyerType.h"

namespace Tiny {


/*! \brief Информация о покупателе и его номере телефона.
 *
 *  \ingroup Models
 *
 */

class OrderBuyerInfoDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBuyerInfoDTO();
    OrderBuyerInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBuyerInfoDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор покупателя.
	 */
	std::string getId();

	/*! \brief Set Идентификатор покупателя.
	 */
	void setId(std::string  id);
	/*! \brief Get Фамилия покупателя.
	 */
	std::string getLastName();

	/*! \brief Set Фамилия покупателя.
	 */
	void setLastName(std::string  lastName);
	/*! \brief Get Имя покупателя.
	 */
	std::string getFirstName();

	/*! \brief Set Имя покупателя.
	 */
	void setFirstName(std::string  firstName);
	/*! \brief Get Отчество покупателя.
	 */
	std::string getMiddleName();

	/*! \brief Set Отчество покупателя.
	 */
	void setMiddleName(std::string  middleName);
	/*! \brief Get 
	 */
	OrderBuyerType getType();

	/*! \brief Set 
	 */
	void setType(OrderBuyerType  type);
	/*! \brief Get Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
	 */
	std::string getPhone();

	/*! \brief Set Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
	 */
	void setPhone(std::string  phone);


    private:
    std::string id{};
    std::string lastName{};
    std::string firstName{};
    std::string middleName{};
    OrderBuyerType type;
    std::string phone{};
};
}

#endif /* TINY_CPP_CLIENT_OrderBuyerInfoDTO_H_ */
