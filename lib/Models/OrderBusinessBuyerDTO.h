
/*
 * OrderBusinessBuyerDTO.h
 *
 * Информация о покупателе. 
 */

#ifndef TINY_CPP_CLIENT_OrderBusinessBuyerDTO_H_
#define TINY_CPP_CLIENT_OrderBusinessBuyerDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация о покупателе. 
 *
 *  \ingroup Models
 *
 */

class OrderBusinessBuyerDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBusinessBuyerDTO();
    OrderBusinessBuyerDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBusinessBuyerDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string inn{};
    std::string kpp{};
    std::string organizationName{};
    std::string organizationJurAddress{};
};
}

#endif /* TINY_CPP_CLIENT_OrderBusinessBuyerDTO_H_ */
