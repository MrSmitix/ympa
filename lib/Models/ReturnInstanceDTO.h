
/*
 * ReturnInstanceDTO.h
 *
 * Логистическая информация по возврату.
 */

#ifndef TINY_CPP_CLIENT_ReturnInstanceDTO_H_
#define TINY_CPP_CLIENT_ReturnInstanceDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ReturnInstanceStatusType.h"
#include "ReturnInstanceStockType.h"

namespace Tiny {


/*! \brief Логистическая информация по возврату.
 *
 *  \ingroup Models
 *
 */

class ReturnInstanceDTO{
public:

    /*! \brief Constructor.
	 */
    ReturnInstanceDTO();
    ReturnInstanceDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReturnInstanceDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ReturnInstanceStockType getStockType();

	/*! \brief Set 
	 */
	void setStockType(ReturnInstanceStockType  stockType);
	/*! \brief Get 
	 */
	ReturnInstanceStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ReturnInstanceStatusType  status);
	/*! \brief Get Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	 */
	std::string getCis();

	/*! \brief Set Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
	 */
	void setCis(std::string  cis);
	/*! \brief Get Международный идентификатор мобильного оборудования.
	 */
	std::string getImei();

	/*! \brief Set Международный идентификатор мобильного оборудования.
	 */
	void setImei(std::string  imei);


    private:
    ReturnInstanceStockType stockType;
    ReturnInstanceStatusType status;
    std::string cis{};
    std::string imei{};
};
}

#endif /* TINY_CPP_CLIENT_ReturnInstanceDTO_H_ */
