/*
 * GetCategoriesMaxSaleQuantumRequest.h
 *
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */

#ifndef _GetCategoriesMaxSaleQuantumRequest_H_
#define _GetCategoriesMaxSaleQuantumRequest_H_


#include <string>
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesMaxSaleQuantumRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCategoriesMaxSaleQuantumRequest();
	GetCategoriesMaxSaleQuantumRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCategoriesMaxSaleQuantumRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
	 */
	Set<long long> getMarketCategoryIds();

	/*! \brief Set Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
	 */
	void setMarketCategoryIds(Set <long long> marketCategoryIds);

private:
	Set <long long>marketCategoryIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCategoriesMaxSaleQuantumRequest_H_ */
