
/*
 * ModelsDTO.h
 *
 * Список моделей товаров.
 */

#ifndef TINY_CPP_CLIENT_ModelsDTO_H_
#define TINY_CPP_CLIENT_ModelsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ModelDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список моделей товаров.
 *
 *  \ingroup Models
 *
 */

class ModelsDTO{
public:

    /*! \brief Constructor.
	 */
    ModelsDTO();
    ModelsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModelsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список моделей товаров.
	 */
	std::list<ModelDTO> getModels();

	/*! \brief Set Список моделей товаров.
	 */
	void setModels(std::list <ModelDTO> models);


    private:
    std::list<ModelDTO> models;
};
}

#endif /* TINY_CPP_CLIENT_ModelsDTO_H_ */
