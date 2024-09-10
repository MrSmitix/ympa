/*
 * OrderBusinessBuyerDTO.h
 *
 * Информация о покупателе. 
 */

#ifndef _OrderBusinessBuyerDTO_H_
#define _OrderBusinessBuyerDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о покупателе. 
 *
 *  \ingroup Models
 *
 */

class OrderBusinessBuyerDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBusinessBuyerDTO();
	OrderBusinessBuyerDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBusinessBuyerDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ИНН.
	 */
	std::string getInn();

	/*! \brief Set ИНН.
	 */
	void setInn(std::string  inn);
	/*! \brief Get КПП.
	 */
	std::string getKpp();

	/*! \brief Set КПП.
	 */
	void setKpp(std::string  kpp);
	/*! \brief Get Наименование юридического лица.
	 */
	std::string getOrganizationName();

	/*! \brief Set Наименование юридического лица.
	 */
	void setOrganizationName(std::string  organizationName);
	/*! \brief Get Юридический адрес.
	 */
	std::string getOrganizationJurAddress();

	/*! \brief Set Юридический адрес.
	 */
	void setOrganizationJurAddress(std::string  organizationJurAddress);

private:
	std::string inn;
	std::string kpp;
	std::string organizationName;
	std::string organizationJurAddress;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBusinessBuyerDTO_H_ */
