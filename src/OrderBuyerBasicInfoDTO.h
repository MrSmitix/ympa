/*
 * OrderBuyerBasicInfoDTO.h
 *
 * Информация о покупателе с базовыми полями.
 */

#ifndef _OrderBuyerBasicInfoDTO_H_
#define _OrderBuyerBasicInfoDTO_H_


#include <string>
#include "OrderBuyerType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о покупателе с базовыми полями.
 *
 *  \ingroup Models
 *
 */

class OrderBuyerBasicInfoDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBuyerBasicInfoDTO();
	OrderBuyerBasicInfoDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBuyerBasicInfoDTO();

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

private:
	std::string id;
	std::string lastName;
	std::string firstName;
	std::string middleName;
	OrderBuyerType type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBuyerBasicInfoDTO_H_ */
