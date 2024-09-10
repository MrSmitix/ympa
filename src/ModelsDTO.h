/*
 * ModelsDTO.h
 *
 * Список моделей товаров.
 */

#ifndef _ModelsDTO_H_
#define _ModelsDTO_H_


#include <string>
#include "ModelDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список моделей товаров.
 *
 *  \ingroup Models
 *
 */

class ModelsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ModelsDTO();
	ModelsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModelsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список моделей товаров.
	 */
	std::list<ModelDTO> getModels();

	/*! \brief Set Список моделей товаров.
	 */
	void setModels(std::list <ModelDTO> models);

private:
	std::list <ModelDTO>models;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModelsDTO_H_ */
