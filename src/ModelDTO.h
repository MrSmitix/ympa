/*
 * ModelDTO.h
 *
 * Модель товара.
 */

#ifndef _ModelDTO_H_
#define _ModelDTO_H_


#include <string>
#include "ModelPriceDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Модель товара.
 *
 *  \ingroup Models
 *
 */

class ModelDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ModelDTO();
	ModelDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModelDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор модели товара.
	 */
	long long getId();

	/*! \brief Set Идентификатор модели товара.
	 */
	void setId(long long  id);
	/*! \brief Get Название модели товара.
	 */
	std::string getName();

	/*! \brief Set Название модели товара.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	ModelPriceDTO getPrices();

	/*! \brief Set 
	 */
	void setPrices(ModelPriceDTO  prices);

private:
	long long id;
	std::string name;
	ModelPriceDTO prices;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModelDTO_H_ */
