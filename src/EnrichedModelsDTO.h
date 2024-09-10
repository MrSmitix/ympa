/*
 * EnrichedModelsDTO.h
 *
 * Список моделей товаров.
 */

#ifndef _EnrichedModelsDTO_H_
#define _EnrichedModelsDTO_H_


#include <string>
#include "EnrichedModelDTO.h"
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

class EnrichedModelsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	EnrichedModelsDTO();
	EnrichedModelsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnrichedModelsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список моделей товаров.
	 */
	std::list<EnrichedModelDTO> getModels();

	/*! \brief Set Список моделей товаров.
	 */
	void setModels(std::list <EnrichedModelDTO> models);

private:
	std::list <EnrichedModelDTO>models;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnrichedModelsDTO_H_ */
