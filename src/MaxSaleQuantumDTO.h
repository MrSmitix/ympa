/*
 * MaxSaleQuantumDTO.h
 *
 * Лимит на установку кванта и минимального количества товаров по категориям. 
 */

#ifndef _MaxSaleQuantumDTO_H_
#define _MaxSaleQuantumDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Лимит на установку кванта и минимального количества товаров по категориям. 
 *
 *  \ingroup Models
 *
 */

class MaxSaleQuantumDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	MaxSaleQuantumDTO();
	MaxSaleQuantumDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MaxSaleQuantumDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор категории.
	 */
	long long getId();

	/*! \brief Set Идентификатор категории.
	 */
	void setId(long long  id);
	/*! \brief Get Название категории.
	 */
	std::string getName();

	/*! \brief Set Название категории.
	 */
	void setName(std::string  name);
	/*! \brief Get Лимит на установку кванта и минимального количества товаров.
	 */
	int getMaxSaleQuantum();

	/*! \brief Set Лимит на установку кванта и минимального количества товаров.
	 */
	void setMaxSaleQuantum(int  maxSaleQuantum);

private:
	long long id;
	std::string name;
	int maxSaleQuantum;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MaxSaleQuantumDTO_H_ */
