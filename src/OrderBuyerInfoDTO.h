/*
 * OrderBuyerInfoDTO.h
 *
 * Информация о покупателе и его номере телефона.
 */

#ifndef _OrderBuyerInfoDTO_H_
#define _OrderBuyerInfoDTO_H_


#include <string>
#include "OrderBuyerType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о покупателе и его номере телефона.
 *
 *  \ingroup Models
 *
 */

class OrderBuyerInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBuyerInfoDTO();
	OrderBuyerInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBuyerInfoDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string id;
	std::string lastName;
	std::string firstName;
	std::string middleName;
	OrderBuyerType type;
	std::string phone;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBuyerInfoDTO_H_ */
