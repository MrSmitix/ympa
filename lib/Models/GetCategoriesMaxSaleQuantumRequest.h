
/*
 * GetCategoriesMaxSaleQuantumRequest.h
 *
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */

#ifndef TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumRequest_H_
#define TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesMaxSaleQuantumRequest{
public:

    /*! \brief Constructor.
	 */
    GetCategoriesMaxSaleQuantumRequest();
    GetCategoriesMaxSaleQuantumRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCategoriesMaxSaleQuantumRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
	 */
	Set<long> getMarketCategoryIds();

	/*! \brief Set Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
	 */
	void setMarketCategoryIds(Set <long> marketCategoryIds);


    private:
    Set<long> marketCategoryIds;
};
}

#endif /* TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumRequest_H_ */
