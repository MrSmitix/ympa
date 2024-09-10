
/*
 * EnrichedModelsDTO.h
 *
 * Список моделей товаров.
 */

#ifndef TINY_CPP_CLIENT_EnrichedModelsDTO_H_
#define TINY_CPP_CLIENT_EnrichedModelsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EnrichedModelDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список моделей товаров.
 *
 *  \ingroup Models
 *
 */

class EnrichedModelsDTO{
public:

    /*! \brief Constructor.
	 */
    EnrichedModelsDTO();
    EnrichedModelsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EnrichedModelsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список моделей товаров.
	 */
	std::list<EnrichedModelDTO> getModels();

	/*! \brief Set Список моделей товаров.
	 */
	void setModels(std::list <EnrichedModelDTO> models);


    private:
    std::list<EnrichedModelDTO> models;
};
}

#endif /* TINY_CPP_CLIENT_EnrichedModelsDTO_H_ */
