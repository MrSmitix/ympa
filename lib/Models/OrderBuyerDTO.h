
/*
 * OrderBuyerDTO.h
 *
 * Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. 
 */

#ifndef TINY_CPP_CLIENT_OrderBuyerDTO_H_
#define TINY_CPP_CLIENT_OrderBuyerDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderBuyerType.h"

namespace Tiny {


/*! \brief Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. 
 *
 *  \ingroup Models
 *
 */

class OrderBuyerDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBuyerDTO();
    OrderBuyerDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBuyerDTO();


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


    private:
    std::string id{};
    std::string lastName{};
    std::string firstName{};
    std::string middleName{};
    OrderBuyerType type;
};
}

#endif /* TINY_CPP_CLIENT_OrderBuyerDTO_H_ */
