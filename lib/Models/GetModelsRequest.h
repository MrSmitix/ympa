
/*
 * GetModelsRequest.h
 *
 * Запрос информации о моделях.
 */

#ifndef TINY_CPP_CLIENT_GetModelsRequest_H_
#define TINY_CPP_CLIENT_GetModelsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Запрос информации о моделях.
 *
 *  \ingroup Models
 *
 */

class GetModelsRequest{
public:

    /*! \brief Constructor.
	 */
    GetModelsRequest();
    GetModelsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetModelsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список моделей.
	 */
	std::list<long> getModels();

	/*! \brief Set Список моделей.
	 */
	void setModels(std::list <long> models);


    private:
    std::list<long> models;
};
}

#endif /* TINY_CPP_CLIENT_GetModelsRequest_H_ */
